package com.rcplatform.livechat.tupuapi;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.*;

/**
 * Created by admin on 2017/2/17.
 */
public class HttpConnectionUtil {

    public HttpConnectionUtil() {
    }

    public static String uploadImage(String actionUrl, String secretId, String timestamp, String nonce, String signature, List<String> fileLists, String[] tags) throws Exception {
        String BOUNDARY = UUID.randomUUID().toString();
        HashMap param = new HashMap();
        param.put("secretId", secretId);
        param.put("timestamp", timestamp);
        param.put("signature", signature);
        param.put("nonce", nonce);
        String PREFIX = "--";
        String END = "\r\n";
        String CONTENT_TYPE = "multipart/form-data";
        String result = null;
        URL url = new URL(actionUrl);
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();
        conn.setConnectTimeout(15000);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setUseCaches(false);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Charset", "UTF-8");
        conn.setRequestProperty("connection", "keep-alive");
        conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
        conn.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + BOUNDARY);
        DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
        StringBuffer stringBuffer = null;
        String params = "";
        String res;
        int var26;
        if(param != null && param.size() > 0) {
            Iterator end_data = param.keySet().iterator();

            String input;
            while(end_data.hasNext()) {
                stringBuffer = null;
                stringBuffer = new StringBuffer();
                res = (String)end_data.next();
                input = (String)param.get(res);
                stringBuffer.append("--").append(BOUNDARY).append("\r\n");
                stringBuffer.append("Content-Disposition: form-data; name=\"").append(res).append("\"").append("\r\n").append("\r\n");
                stringBuffer.append(input).append("\r\n");
                params = stringBuffer.toString();
                dos.write(params.getBytes("UTF-8"));
            }

            if(tags != null && tags.length > 0) {
                for(var26 = 0; var26 < tags.length; ++var26) {
                    stringBuffer = null;
                    stringBuffer = new StringBuffer();
                    input = tags[var26];
                    stringBuffer.append("--").append(BOUNDARY).append("\r\n");
                    stringBuffer.append("Content-Disposition: form-data; name=\"").append("tag").append("\"").append("\r\n").append("\r\n");
                    stringBuffer.append(input).append("\r\n");
                    params = stringBuffer.toString();
                    dos.write(params.getBytes("UTF-8"));
                }
            }
        }

        for(int var24 = 0; var24 < fileLists.size(); ++var24) {
            res = (String)fileLists.get(var24);
            dos.write(("--" + BOUNDARY + "\r\n").getBytes("UTF-8"));
            dos.write(("Content-Disposition:form-data; name=\"image\"; filename=\"" + (String)fileLists.get(var24) + "\"" + "\r\n").getBytes("UTF-8"));
            dos.write("\r\n".getBytes("UTF-8"));
            FileInputStream var27 = new FileInputStream(res);
            short sb1 = 1024;
            byte[] ss = new byte[sb1];
            boolean length = true;

            int var31;
            while((var31 = var27.read(ss)) != -1) {
                dos.write(ss, 0, var31);
            }

            dos.writeBytes("\r\n");
            var27.close();
        }

        byte[] var25 = ("--" + BOUNDARY + "--" + "\r\n").getBytes("UTF-8");
        dos.write(var25);
        dos.flush();
        var26 = conn.getResponseCode();
        if(var26 == 200) {
            InputStream var28 = conn.getInputStream();
            StringBuffer var29 = new StringBuffer();

            int var30;
            while((var30 = var28.read()) != -1) {
                var29.append((char)var30);
            }

            result = var29.toString();
        }

        return result;
    }

    public static String uploadUri(String actionUrl, String timestamp, String nonce, String signature, List<String> fileLists, String[] tags) throws Exception {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        String httpArg = "timestamp=" + timestamp + "&nonce=" + nonce + "&signature=" + URLEncoder.encode(signature);
        int connect_url;
        if(tags != null && tags.length > 0) {
            for(connect_url = 0; connect_url < tags.length; ++connect_url) {
                httpArg = httpArg + "&tag=" + tags[connect_url];
            }
        }

        if(fileLists.size() > 0) {
            for(connect_url = 0; connect_url < fileLists.size(); ++connect_url) {
                httpArg = httpArg + "&image=" + URLEncoder.encode((String)fileLists.get(connect_url));
            }
        }

        URL var14 = new URL(actionUrl);
        HttpURLConnection connection = (HttpURLConnection)var14.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        connection.setDoOutput(true);
        connection.getOutputStream().write(httpArg.getBytes("UTF-8"));
        connection.connect();
        InputStream is = connection.getInputStream();
        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        String strRead = null;

        while((strRead = reader.readLine()) != null) {
            sbf.append(strRead);
            sbf.append("\r\n");
        }

        reader.close();
        result = sbf.toString();
        return result;
    }
}
