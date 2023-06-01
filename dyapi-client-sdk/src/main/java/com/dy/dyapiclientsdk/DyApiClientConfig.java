package com.dy.dyapiclientsdk;

import com.dy.dyapiclientsdk.client.DeyApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("dyapi-client")
@Data
@ComponentScan
public class DyApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public DeyApiClient getDeyApiClient(){
        return new DeyApiClient(accessKey,secretKey);
    }
}
