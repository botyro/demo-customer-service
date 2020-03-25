package com.demo.democustomerservice.controller;

import com.demo.democustomerservice.service.ThreadExcutorExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Slf4j
@RestController
@RefreshScope
public class CustomerController {

    @Value("${user.name}")
    private String name;

    @Autowired
    ThreadExcutorExample threadExcutorExample;

    @GetMapping(value = "/hello")
    public String greeting() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String strDate = dateFormat.format(date);

        log.debug("Greeting service have called at {}", strDate);
        return "Hello " + name;
    }
}
