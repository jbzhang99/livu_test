package com.rcplatform.livechat.tupuapi;


import com.alibaba.fastjson.JSONObject;

/**
 * Created by admin on 2017/2/17.
 */
public class ErrorUtil {

    public static final int CODE_SUCCESS = 0;
    public static final int ERROR_CODE_AUTHENTICATION = 1;
    public static final int ERROR_CODE_MODEL_ID_ERROR = 2;
    public static final int ERROR_CODE_NO_FILE = 3;
    public static final int ERROR_CODE_API_VISION_ERROR = 4;
    public static final int ERROR_CODE_API_DEPRECATED = 5;
    public static final int ERROR_CODE_SECRET_ID_ERROR = 6;
    public static final int ERROR_CODE_TASK_ID_ERROR = 7;
    public static final int ERROR_CODE_SECRET_ID_STATUS_ERROR = 8;
    public static final int ERROR_CODE_NO_CERTIFICATE = 9;
    public static final int ERROR_CODE_PIPE_ID_ERROR = 10;
    public static final int ERROR_CODE_CALLBACK_ERROR = 11;
    public static final int ERROR_CODE_TIME_ERROR = 12;
    public static final int ERROR_CODE_TASK_CLOSED = 13;
    public static final int ERROR_CODE_IMAGE_ERROR = 14;
    public static final int ERROR_CODE_NOT_FOUND = 404;
    public static final int ERROR_CODE_DOWNLOAD_FAILED = 400;
    public static final int ERROR_CODE_SEVER_ERROR = 100;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 101;
    public static final int ERROR_CODE_RESULT_VERIFY_FAILED = 102;
    public static final int ERROR_CODE_OTHERS = 103;

    public ErrorUtil() {
    }

    public static JSONObject getErrorMsg(int errCode, String errMsg) {
        JSONObject obj = new JSONObject();
        switch(errCode) {
            case 0:
                errMsg = "success";
                break;
            case 1:
                errMsg = "authentication failed ";
                break;
            case 2:
                errMsg = "model id error";
                break;
            case 3:
                errMsg = "no file to upload";
                break;
            case 4:
                errMsg = "api version error";
                break;
            case 5:
                errMsg = "api version deprecated";
                break;
            case 6:
                errMsg = "secretId id error";
                break;
            case 7:
                errMsg = "task id error";
                break;
            case 8:
                errMsg = "secretId  status error";
                break;
            case 9:
                errMsg = "no cetificate upload";
                break;
            case 10:
                errMsg = "pipe id error";
                break;
            case 11:
                errMsg = "callback error";
                break;
            case 12:
                errMsg = "parameter time error";
                break;
            case 13:
                errMsg = "task has closed";
                break;
            case 14:
                errMsg = "files formats error";
                break;
            case 100:
                errMsg = "server has a problem";
                break;
            case 101:
                errMsg = "server has a problem";
                break;
            case 102:
                errMsg = "response verify failed";
                break;
            case 103:
            default:
                if(errMsg == null || errMsg == "") {
                    errMsg = "unknown error";
                }
                break;
            case 400:
                errMsg = "files download failed";
                break;
            case 404:
                errMsg = "files not found";
        }

        obj.put("code", Integer.valueOf(errCode));
        obj.put("message", errMsg);
        return obj;
    }
}
