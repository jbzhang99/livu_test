
package com.rcplatform.livechat.web.upload;


import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.MoreCollectors;
import com.google.common.collect.Sets;
import com.rcplatform.livechat.bean.TuputechBean;
import com.rcplatform.livechat.constant.AppIdConstant;
import com.rcplatform.livechat.enums.*;
import com.rcplatform.livechat.tupuapi.Api;
import com.rcplatform.livechat.tupuapi.ConfigUtil;
import com.rcplatform.videochat.bean.ImageCheckResult;
import com.rcplatform.videochat.model.TupuSecretId;
import com.rcplatform.videochat.param.EroticismParam;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.rcplatform.livechat.constant.AppIdConstant.NEW_APP_ID;
import static com.rcplatform.livechat.constant.AppIdConstant.OLD_APP_ID;


public class ImageAutoReview {

	public String apiUrl = "http://api-us.open.tuputech.com/v3/recognition/";
	//secret id

	private String headImgSecretId = "58a51f4681759a613d66c4ec";


	private String boySecretId = "595c77ea782b063d63b6e48d";


	private String personSecretId = "5965dcc46fc7d5358f3b7436";


	private String girlSecretId = "596875086fc7d5358f3b7445";


	private String livuHeadImgSecretId = "59780a18c4c7ed7c2ed139f3";


	private String livuBoySecretId = "59780a97c4c7ed7c2ed139f7";


	private String liveuGirlSecretId = "59780abac4c7ed7c2ed139fb";


	private String privateKey = "C:\\Users\\admin\\IdeaProjects\\live-chat\\live-chat-module\\live-chat-module-users\\src\\main\\resources\\pkcs8_private_key.pem";

	/**
	 * 0：一个老年男人； 1：一个老年女人； 2：一个青年男人； 3：一个青年女人； 4：一个小男孩； 5：一个小女孩； 6：一个婴儿； 7：多个老年男人； 8：多个老年女人； 9：多个老年男女； 10：多个青年男人； 11：多个青年女人； 12：多个青年男女； 13：多个小男孩； 14：多个小女孩； 15：多个小男孩和小女孩； 16：多个婴儿； 17：多个男人和 女人； 18：多个男人； 19：多个女人； 20：没有人； 21：一个中年男人； 22：一个中年女人； 23：多个中年男人； 24：多个中年女人； 25：多个中年男女； 26：多个男人和女人；
	 */
	private static final HashSet<Integer> GIRLS = Sets.newHashSet(3);


	private static final HashSet<Integer> BOYS = Sets.newHashSet(2);


	private static Set<TupuSecretId> set = Stream.of(
			new TupuSecretId("livecht 头像", OLD_APP_ID, "58a51f4681759a613d66c4ec",
					UserGenderEnum.ALL.key(), TupuSecretIdFunctionEnum.HEAD_IMG.ordinal(),
					TupuSecretIdTyepEnum.PERSON_AND_EROTICISM.ordinal()),
			new TupuSecretId("livecht 男性视频", OLD_APP_ID, "595c77ea782b063d63b6e48d",
					UserGenderEnum.BOY.key(), TupuSecretIdFunctionEnum.VIDEO.ordinal(),
					TupuSecretIdTyepEnum.EROTICISM.ordinal()),
			new TupuSecretId("livecht 女性视频", OLD_APP_ID, "596875086fc7d5358f3b7445",
					UserGenderEnum.GIRL.key(), TupuSecretIdFunctionEnum.VIDEO.ordinal(),
					TupuSecretIdTyepEnum.EROTICISM.ordinal()),
			new TupuSecretId("livecht 人物鉴定", OLD_APP_ID, "59b753564bcc31024ca8bdbd",
					UserGenderEnum.ALL.key(), TupuSecretIdFunctionEnum.ANY.ordinal(),
					TupuSecretIdTyepEnum.PERSON.ordinal()),
			new TupuSecretId("livU 头像", NEW_APP_ID, "59780a18c4c7ed7c2ed139f3",
					UserGenderEnum.ALL.key(), TupuSecretIdFunctionEnum.HEAD_IMG.ordinal(),
					TupuSecretIdTyepEnum.PERSON_AND_EROTICISM.ordinal()),
			new TupuSecretId("livU 男性视频色情", NEW_APP_ID, "59780a97c4c7ed7c2ed139f7",
					UserGenderEnum.BOY.key(), TupuSecretIdFunctionEnum.VIDEO.ordinal(),
					TupuSecretIdTyepEnum.EROTICISM.ordinal()),
			new TupuSecretId("livU 女性视频色情", NEW_APP_ID, "59780abac4c7ed7c2ed139fb",
					UserGenderEnum.GIRL.key(), TupuSecretIdFunctionEnum.VIDEO.ordinal(),
					TupuSecretIdTyepEnum.EROTICISM.ordinal()),
			new TupuSecretId("livU 人物鉴定", NEW_APP_ID, "59ae1bac4bcc31024ca8bd82",
					UserGenderEnum.ALL.key(), TupuSecretIdFunctionEnum.ANY.ordinal(),
					TupuSecretIdTyepEnum.PERSON.ordinal()),
			new TupuSecretId("livecht 色情女视频", OLD_APP_ID, "59ddbc757f7f645591e507b4",
					UserGenderEnum.GIRL.key(), TupuSecretIdFunctionEnum.EROTICISM_FEMALE_VIDEO.ordinal(),
					TupuSecretIdTyepEnum.EROTICISM.ordinal()),
			new TupuSecretId("livU  色情女视频", NEW_APP_ID, "59ddbd3c7f7f645591e507ba",
					UserGenderEnum.GIRL.key(), TupuSecretIdFunctionEnum.EROTICISM_FEMALE_VIDEO.ordinal(),
					TupuSecretIdTyepEnum.EROTICISM.ordinal())
	).collect(Collectors.toSet());


	private Logger logger = LoggerFactory.getLogger(ImageAutoReview.class);

	public ImageAutoReview() {
	}

	public ImageAutoReview(String apiUrl, String secretId, String privateKey) {
		this.apiUrl = apiUrl;
		this.headImgSecretId = secretId;
		this.privateKey = privateKey;
	}

	public static void main(String[] args) throws Exception {
//        //测试图片url
//        String url = "http://lcpic5.rcplatformhk.com/report/2017-07-03/1499085783296846450.jpg";
//        ArrayList<String> objects = new ArrayList<>();
//        objects.add(url);
//        //objects.add("http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg");
//        String[] tag = {"1"};
		ImageAutoReview imageAutoReview = new ImageAutoReview();
//        TuputechBean tuputechBean = imageAutoReview.processorIMGReview(url, "1", "");
//        System.out.println(tuputechBean);
		TuputechBean tuputechBean = imageAutoReview.processorIMGReview(AppIdConstant.getAppId(20000), UserGenderEnum.ALL.key(),
				TupuSecretIdFunctionEnum.ANY.ordinal(), TupuSecretIdTyepEnum.PERSON.ordinal(), "http://lcpic2.rcplatformhk.com/video-chat/upload/1487264078841461283.jpg", "1");
		System.out.println(tuputechBean);
	}


	/**
	 * @param image 图片
	 * @param tag   图片标记
	 * @return 响应数据
	 */
	public TuputechBean processorIMGReview(Integer appId, Integer gender, Integer function, Integer type, String image, String tag) {
		TupuSecretId secretId = set.stream().filter(tupuSecretId -> tupuSecretId.getAppId().equals(appId) && tupuSecretId.getGender().equals(gender)
				&& tupuSecretId.getFunction().equals(function) && tupuSecretId.getType().equals(type)).collect(MoreCollectors.onlyElement());
		//logger.error(secretId.toString());
		return processorIMGReview(image, tag, secretId.getSecretId());
	}

	public TuputechBean processorImgReview(EroticismParam eroticismParam, Integer gender, Integer function, Integer type) {

		TupuSecretId secretId = set.stream().filter(tupuSecretId -> tupuSecretId.getAppId().equals(eroticismParam.getAppId())
						&& tupuSecretId.getGender().equals(gender)
						&& tupuSecretId.getFunction().equals(function)
						&& tupuSecretId.getType().equals(type))
				.collect(MoreCollectors.onlyElement());


		return processorIMGReview(eroticismParam.getImageUrl(),
				String.valueOf(eroticismParam.getUserId()),
				secretId.getSecretId());
	}


	/**
	 * @return 返回值说明:https://www.us.tuputech.com/api/response#image
	 * @throws Exception 设定文件.JSONObject 返回类型
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 */
	public TuputechBean processorIMGReview(List<String> fileList, String[] tags) throws Exception {
		Api api = new Api(headImgSecretId, privateKey, apiUrl);
		JSONObject result = api.doApiTest(ConfigUtil.UPLOAD_TYPE.UPLOAD_URI_TYPE, fileList, tags);
		logger.error(result.toString());
		TuputechBean tuputechBean = JSONObject.parseObject(result.toJSONString(), TuputechBean.class);
		return tuputechBean;
	}


	private TuputechBean processorIMGReview(String image, String tag, String secretId) {
		ArrayList<String> fileList = new ArrayList<>();
		fileList.add(image);
		Api api = new Api(secretId, privateKey, apiUrl);
		JSONObject result = api.doApiTest(ConfigUtil.UPLOAD_TYPE.UPLOAD_URI_TYPE, fileList, tag);
		logger.error(result.toString());
		TuputechBean tuputechBean = JSONObject.parseObject(result.toJSONString(), TuputechBean.class);
		return tuputechBean;
	}

	public ImageCheckResult checkEroticism(TuputechBean tuputechBean) {
		if (tuputechBean != null && tuputechBean.getEroticism() != null) {
			//色情鉴定返回结果
			List<TuputechBean.Eroticism.FileListBean> fileList = tuputechBean.getEroticism().getFileList();

			if (CollectionUtils.isNotEmpty(fileList)) {
				for (TuputechBean.Eroticism.FileListBean fileListBean : fileList) {
					//色情标识
					Integer label = fileListBean.getLabel();
					boolean review = fileListBean.isReview();
					ImageCheckResult imageCheckResult = new ImageCheckResult(fileListBean.getRate(), review, label);

					if (label.equals(EroticismLabelEnum.eroticism.ordinal()) && review) {
						//色情 需要手动审核的为likely
						imageCheckResult.setCheckResult(ReportEroticismEnum.LIKELY.key());

					} else if (label.equals(EroticismLabelEnum.eroticism.ordinal()) && !review) {
						//色情 不需要手动审核的为 色情
						imageCheckResult.setCheckResult(ReportEroticismEnum.EROTICISM.key());
					} else {
						//其余的为正常 用户
						imageCheckResult.setCheckResult(ReportEroticismEnum.NORMAL.key());
					}
					if (imageCheckResult.getCheckResult() != null) {
						return imageCheckResult;
					}
				}
			}
		}
		return null;
	}

	/**
	 * 返回api检查的色情标识
	 *
	 * @param tuputechBean
	 * @return
	 */
	public ImageCheckResult checkEroticismNew(TuputechBean tuputechBean) {

		if (tuputechBean != null && tuputechBean.getEroticism() != null) {
			//色情鉴定返回结果
			List<TuputechBean.Eroticism.FileListBean> fileList = tuputechBean.getEroticism().getFileList();
			//如果不为空
			if (CollectionUtils.isNotEmpty(fileList)) {

				for (TuputechBean.Eroticism.FileListBean fileListBean : fileList) {
					return new ImageCheckResult(fileListBean.getRate(), //图谱的比例
							fileListBean.isReview(),//是否被审核过
							fileListBean.getLabel());

				};

			}
		}
		return null;
	}


	public ImageCheckResult checkPerson(TuputechBean tuputechBean) throws Exception {
//        TuputechBean tuputechBean = this.processorIMGReview(url, userId.toString());
		if (tuputechBean.getPerson() != null) {
			List<TuputechBean.Person.FileListBeanX> fileList = tuputechBean.getPerson().getFileList();
			if (CollectionUtils.isNotEmpty(fileList)) {
				TuputechBean.Person.FileListBeanX fileListBeanX = fileList.get(0);
				Integer label = fileListBeanX.getLabel();
				Boolean review = fileListBeanX.getReview();
				if (GIRLS.contains(label) && review.equals(false)) {
					return new ImageCheckResult(ReportPersonEnum.PASS.key(), fileListBeanX.getRate(), fileListBeanX.getReview(), fileListBeanX.getLabel());
				} else if (BOYS.contains(label) && review.equals(false)) {
					return new ImageCheckResult(ReportPersonEnum.UN_PASS.key(), fileListBeanX.getRate(), fileListBeanX.getReview(), fileListBeanX.getLabel());
				} else {
					return new ImageCheckResult(ReportPersonEnum.UN_KNOW.key(), fileListBeanX.getRate(), fileListBeanX.getReview(), fileListBeanX.getLabel());
				}
			}
		}
		return null;
	}

	public ImageCheckResult checkPersonNew(TuputechBean tuputechBean) throws Exception {
		if (tuputechBean.getPerson() != null) {
			List<TuputechBean.Person.FileListBeanX> fileList = tuputechBean.getPerson().getFileList();
			if (CollectionUtils.isNotEmpty(fileList)) {
				TuputechBean.Person.FileListBeanX fileListBeanX = fileList.get(0);
				return new ImageCheckResult(fileListBeanX.getRate(),
						fileListBeanX.getReview(),
						fileListBeanX.getLabel());
			}
		}
		return null;
	}

	public ImageCheckResult checkGenderNew(TuputechBean tuputechBean) throws Exception {
		if (tuputechBean.getGenderInfo() != null) {
			List<TuputechBean.GenderInfo.FileListBean> fileList = tuputechBean.getGenderInfo().getFileList();
			if (CollectionUtils.isNotEmpty(fileList)) {
				TuputechBean.GenderInfo.FileListBean fileListBean = fileList.get(0);
				Integer label = fileListBean.getLabel();
				label = label == 1 ? 3 : (label == 0 ? 2 : -1);
				return new ImageCheckResult(fileListBean.getRate(),
						fileListBean.isReview(),
						label);
			}
		}
		return null;
	}

	public ImageCheckResult checkGender(TuputechBean tuputechBean) throws Exception {
		if (tuputechBean.getGenderInfo() != null) {
			List<TuputechBean.GenderInfo.FileListBean> fileList = tuputechBean.getGenderInfo().getFileList();
			if (CollectionUtils.isNotEmpty(fileList)) {
				TuputechBean.GenderInfo.FileListBean fileListBean = fileList.get(0);
				Integer label = fileListBean.getLabel();
				Boolean review = fileListBean.isReview();
				if (label.equals(1) && review.equals(false)) {
					return new ImageCheckResult(ReportPersonEnum.PASS.key(), fileListBean.getRate(), fileListBean.isReview(), fileListBean.getLabel());
				} else if (label.equals(0) && review.equals(false)) {
					return new ImageCheckResult(ReportPersonEnum.UN_PASS.key(), fileListBean.getRate(), fileListBean.isReview(), fileListBean.getLabel());
				} else {
					return new ImageCheckResult(ReportPersonEnum.UN_KNOW.key(), fileListBean.getRate(), fileListBean.isReview(), fileListBean.getLabel());
				}
			}
		}
		return null;
	}


	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}


	public String getHeadImgSecretId() {
		return headImgSecretId;
	}

	public void setHeadImgSecretId(String headImgSecretId) {
		this.headImgSecretId = headImgSecretId;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
}

