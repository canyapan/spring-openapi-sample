package com.canyapan.sample.springopenapisample.controller.impl;

import com.canyapan.sample.springopenapisample.controller.EchoController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * OpenApi Sample project
 *
 * See URLs:
 * localhost:8080/swagger-ui.html
 * localhost:8080/v3/api-docs
 */
@RestController
public class EchoControllerImpl implements EchoController {

    @GetMapping("/api/v1/echo")
    public String echo(final String message) {
        return message;
    }
}
