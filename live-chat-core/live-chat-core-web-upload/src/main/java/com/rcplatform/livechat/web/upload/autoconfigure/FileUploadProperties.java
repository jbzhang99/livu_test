package com.rcplatform.livechat.web.upload.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by admin on 2017/4/27.
 */
@ConfigurationProperties(prefix = FileUploadProperties.FILE_UPLOAD)
public class FileUploadProperties {


    public static  final String FILE_UPLOAD = "image";

    private String filePath;


    private String filePrefix;


    private String fileType;


    private String fileHeader;


    private String ip;


    private String host;


    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePrefix() {
        return filePrefix;
    }

    public void setFilePrefix(String filePrefix) {
        this.filePrefix = filePrefix;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileHeader() {
        return fileHeader;
    }

    public void setFileHeader(String fileHeader) {
        this.fileHeader = fileHeader;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
