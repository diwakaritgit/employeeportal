package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication(scanBasePackages = {"com.employee"})
@SuppressWarnings({"PMD.UseUtilityClass"})
public class Starter extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(Starter.class, args);
  }
}
