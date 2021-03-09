package com.spring.boot.section6.SecondSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.Locale;

@Configuration
public class BeanConfigFile {

    //For Swagger
    public final ApiInfo apiInfo = new ApiInfo("Rest With Spring", "Performing all the Crud operations of Rest with Spring with an example of Employee Class",
            "1.0", "urn:tos", new Contact("Akshay Negi", "tothenew.com", "akshay.negi@tothenew.com"), "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    @Bean
    public Docket getDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spring.boot"))
                .build()
                .apiInfo(apiInfo);
    }

    //For Internationalization
    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();
        localeResolver.setDefaultLocale(Locale.US);
        return localeResolver;
    }


}
