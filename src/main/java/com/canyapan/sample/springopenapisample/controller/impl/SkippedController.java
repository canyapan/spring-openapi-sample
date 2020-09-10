package com.canyapan.sample.springopenapisample.controller.impl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This will not be shown in swagger-ui.
 * Excluded in the configs.
 */
@RestController
public class SkippedController {

    @GetMapping("/api/v1/will/not/match")
    public String getHello() {
        return "hello!";
    }
}
