package com.blockchain.server.cmc;

import com.blockchain.server.base.BaseConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {BaseConf.class, CMCApplication.class})
public class CMCApplication {
    public static void main(String[] args) {
        SpringApplication.run(CMCApplication.class);
    }
}
