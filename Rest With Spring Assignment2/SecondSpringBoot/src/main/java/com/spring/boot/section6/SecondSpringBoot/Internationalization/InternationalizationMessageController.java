package com.spring.boot.section6.SecondSpringBoot.Internationalization;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Api(description = "Contains the Internationalization of Good Morning and hello")
@RestController
public class InternationalizationMessageController {

    @Autowired
    private MessageSource source;

    @GetMapping("/greetings")
    @ApiOperation(value = "returns Good morning message",
            notes = "It returns good morning message on the basis of the locale")
    public String welcomeUser(){
        return source.getMessage("good.morning",null,
                LocaleContextHolder.getLocale());
    }

    @GetMapping("/user/{name}")
    @ApiOperation(value = "returns hello to the user",
            notes = "It takes the name of the user from the path and returns Hello+username on the basis of the Locale")
    public String welcomeMessage(@PathVariable String name){
        String myString= source.getMessage("hello.user",null,
                LocaleContextHolder.getLocale());
        return myString+name;
    }

}
