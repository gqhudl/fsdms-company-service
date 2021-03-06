package com.fsd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@Slf4j
@EnableJpaAuditing
@EnableScheduling
@EnableDiscoveryClient
@SpringBootApplication
public class FSDMSCompanySrvApplication {

  public static void main(String[] args) {
    SpringApplication.run(FSDMSCompanySrvApplication.class, args);
  }

}
