package com.yhh.rest;

import com.yhh.service.I18nService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/api")
public class HelloJavaCoderController {

    private final I18nService i18nService;

    public HelloJavaCoderController(I18nService i18nService) {
        this.i18nService = i18nService;
    }

    @GetMapping("/hello-coder")
    public ResponseEntity greeting() {
        return ResponseEntity.ok(i18nService.getMessage("message.key.hello", new Object[]{"JavaCoder"}));
    }

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok(i18nService.getMessage("message.key.test"));
    }

}
