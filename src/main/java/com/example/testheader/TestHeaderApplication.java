package com.example.testheader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({
        "com.tlexpress.api_core_system.app.*"
})
public class TestHeaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestHeaderApplication.class, args);
    }

}
