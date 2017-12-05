package com.rcplatform.livechat.exceptionhandle;


import com.alibaba.dubbo.rpc.RpcException;
import com.alibaba.fastjson.JSONException;
import com.rcplatform.livechat.bean.SealingInfo;
import com.rcplatform.livechat.enums.StatEnum;
import com.rcplatform.livechat.exception.BaseException;
import com.rcplatform.livechat.exception.FileTypeException;
import com.rcplatform.livechat.exception.HttpException;
import com.rcplatform.livechat.mail.service.MailService;
import com.rcplatform.livechat.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.multipart.MultipartException;

import javax.crypto.BadPaddingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.util.Date;
import java.util.HashMap;

import static com.rcplatform.livechat.constant.HttpErrorMessage.RPC_ERROR;


/**
 * Created by Yang Peng on 2016/9/30.
 *
 * @Description: ${todo} 这里用一句话描述这个类的作用
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    private final MailService exceptionMailService;

    @Autowired
    public GlobalExceptionHandler(@Qualifier("exceptionMailService") MailService exceptionMailService) {
        this.exceptionMailService = exceptionMailService;
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Response defaultErrorHandler(final HttpServletRequest req, final Exception e) {
        final Date date = new Date();
        logger.info("系统时间:" + date.toString());
        final String s = "未知异常:" + date.getTime() + " " + req.getRequestURL() + req.getQueryString();
        logger.error(s, e);
        exceptionMailService.asyncSendMessage(new HashMap<String, String>(){{put("title",s);put("message",e.getMessage());}},s);
        return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), e.getMessage(), date, req.getRequestURI());
    }




    @ExceptionHandler(value = RpcException.class)
    @ResponseStatus(HttpStatus.REQUEST_TIMEOUT)
    @ResponseBody
    public Response RpcException(final HttpServletRequest req, final Exception e) {
        final Date date = new Date();
        final String s = "dubbo 调用异常:" + date.getTime() + " " + req.getRequestURL() + req.getQueryString();
        logger.error(s, e);
        return new Response(HttpStatus.REQUEST_TIMEOUT.value(), RPC_ERROR, date, req.getRequestURI());
    }



    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ResponseBody
    public Response MethodErrorHandler(final HttpServletRequest req, final Exception e) {
        final Date date = new Date();
        logger.info("系统时间:" + date.toString());
        return new Response(HttpStatus.METHOD_NOT_ALLOWED.value(), e.getMessage(), date, req.getRequestURI());
    }



    @ExceptionHandler(value = {MethodArgumentNotValidException.class, JSONException.class,
            MissingServletRequestParameterException.class, MethodArgumentNotValidException.class,
            FileTypeException.class, MultipartException.class, ConstraintViolationException.class, MethodArgumentTypeMismatchException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response BadRequestErrorHandler(final HttpServletRequest req, final Exception e) {
        final Date date = new Date();
        logger.info("系统时间:" + date.toString());
        return new Response(HttpStatus.BAD_REQUEST.value(), e.getLocalizedMessage(), date, req.getRequestURI());
    }



    @ExceptionHandler(value = BadPaddingException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response DecodeErrorHandler(final HttpServletRequest req, final Exception e, HttpServletResponse response) {
        final Date date = new Date();
        response.setStatus(((HttpException) e).getHttpstatus());
        return new Response(((HttpException) e).getHttpstatus(), e.getMessage(), date, req.getRequestURI());
    }



    @ExceptionHandler(value = HttpException.class)
    @ResponseBody
    public Response HttpErrorHandler(final HttpServletRequest req, final Exception e, HttpServletResponse response) {
        final Date date = new Date();
        response.setStatus(((HttpException) e).getHttpstatus());
        return new Response(((HttpException) e).getHttpstatus(), e.getMessage(), date, req.getRequestURI());
    }



    @ExceptionHandler(value = BaseException.class)
    @ResponseBody
    public Response BaseErrorHandler(final HttpServletRequest req, final Exception e) {
        logger.info("系统时间:" + new Date());
        if (((BaseException) e).getStatEnum().equals(StatEnum.USER_REPORT)) {
            SealingInfo sealingInfo = (SealingInfo) ((BaseException) e).getObject();
            Long time = (sealingInfo.getSealingTime().getTime() - System.currentTimeMillis()) / 1000;
            return new Response.Builder(((BaseException) e).getStatEnum().key(), ((BaseException) e).getStatEnum().desc()
                    , new Date(), req.getRequestURI()).extra(time).other(sealingInfo).build();
        } else {
            return new Response.Builder(((BaseException) e).getStatEnum().key(), ((BaseException) e).getStatEnum().desc()
                    , new Date(), req.getRequestURI()).extra(((BaseException) e).getObject()).build();
        }
    }








}
