package com.canyapan.sample.springopenapisample.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Echo API", description = "A simple echo API")
public interface EchoController {
    @Operation(description = "Echo REST API Operation", tags = {"echo", "api"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "success"),
            @ApiResponse(responseCode = "400", description = "bad request")
    })
    public String echo(final String message);
}
