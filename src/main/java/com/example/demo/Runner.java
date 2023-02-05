package com.example.demo;

import conponent.EmployeeComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    private static final Logger logger = LogManager.getLogger(Runner.class);

    @Autowired
    private EmployeeComponent employeeComponent;

    @Override
    public void run(String... args) throws Exception {
        logger.info("Hi! Welcome to the first demo!");
        employeeComponent.employeeWelocme("Farhan");
    }

}
