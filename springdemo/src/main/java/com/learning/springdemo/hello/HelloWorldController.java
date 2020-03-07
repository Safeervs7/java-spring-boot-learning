package com.learning.springdemo.hello ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET, path = "/hello-test-world")
    public HelloBean helloWorld()
    {
        return new HelloBean("hellow world bean");
    }

    @GetMapping(path = "/good-morning")
    public String goodMorningMessage(@RequestHeader(name = "Accept-language", required = false) Locale locale){
        return messageSource.getMessage("good.morning.message", null,locale);
    }

}
