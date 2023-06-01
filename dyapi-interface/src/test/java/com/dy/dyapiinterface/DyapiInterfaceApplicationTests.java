package com.dy.dyapiinterface;

import com.dy.dyapiclientsdk.client.DeyApiClient;
import com.dy.dyapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DyapiInterfaceApplicationTests {
    @Autowired
    private DeyApiClient deyApiClient;
    @Test
    void contextLoads() {

    }

}
