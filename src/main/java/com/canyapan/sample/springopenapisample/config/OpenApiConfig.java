package com.canyapan.sample.springopenapisample.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Echo REST API",
                description = "A sample OpenApi usage demo app",
                license = @License(
                        name = "Apache license 2.0",
                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"))
)
public class OpenApiConfig {
}
