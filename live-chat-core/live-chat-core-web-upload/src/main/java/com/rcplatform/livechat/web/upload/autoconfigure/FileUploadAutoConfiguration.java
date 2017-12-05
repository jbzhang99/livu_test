package com.rcplatform.livechat.web.upload.autoconfigure;

import com.rcplatform.livechat.web.upload.CompressPic;
import com.rcplatform.livechat.web.upload.FileUpload;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by admin on 2017/4/27.
 */
@Configuration
@EnableConfigurationProperties(FileUploadProperties.class)
public class FileUploadAutoConfiguration {


    private FileUploadProperties fileUploadProperties;


    public FileUploadAutoConfiguration(FileUploadProperties fileUploadProperties) {
        this.fileUploadProperties = fileUploadProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public FileUpload fileUpload() {
        return new FileUpload(fileUploadProperties.getFilePath(), fileUploadProperties.getFilePrefix(),
                fileUploadProperties.getFileType(), fileUploadProperties.getFileHeader(),
                fileUploadProperties.getIp(), fileUploadProperties.getHost());
    }


    @Bean
    @ConditionalOnMissingBean
    public CompressPic compressPic(){
        return new CompressPic(fileUploadProperties.getFilePath(),fileUploadProperties.getFilePrefix());
    }
}
