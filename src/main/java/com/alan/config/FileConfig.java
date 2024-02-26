package com.alan.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;


@Configuration
public class FileConfig {

    /**
     * 配置文件上传大小
     */
    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //  单个数据大小 100M
        factory.setMaxFileSize("102400KB");
        /// 总上传数据大小 100M
        factory.setMaxRequestSize("102400KB");
        return factory.createMultipartConfig();
    }

}