package dev.martintaylor.transfer_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTransferServiceApplication {

    public static void main(String[] args) {
        SpringApplication.from(TransferServiceApplication::main).with(TestTransferServiceApplication.class).run(args);
    }

}
