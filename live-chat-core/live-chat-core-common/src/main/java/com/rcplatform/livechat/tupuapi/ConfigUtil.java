package com.rcplatform.livechat.tupuapi;

/**
 * Created by admin on 2017/2/17.
 */
public class ConfigUtil {

    public static final String PUBLIC_TUPU_KEY_PATH = "open_tuputech_com_public_key.pem";

    public ConfigUtil() {
    }

    public static final class FILE_LIMIT {
        public static final int MAX_IMAGE_LENGTH = 819200;
        public static final int MAX_IMAGE_LIST_SIZE = 200;

        public FILE_LIMIT() {
        }
    }

    public static final class NET_WORK {
        public static final String API_URI = "http://api.open.tuputech.com/v3/recognition/";

        public NET_WORK() {
        }
    }

    public static final class UPLOAD_TYPE {
        public static final String UPLOAD_IMAGE_TYPE = "image";
        public static final String UPLOAD_URI_TYPE = "url";

        public UPLOAD_TYPE() {
        }
    }
}
