package com.curator.oeuvre.controller;

import com.curator.oeuvre.config.CommonResponse;
import com.curator.oeuvre.config.ErrorResponse;
import com.curator.oeuvre.constant.ErrorCode;
import com.curator.oeuvre.exception.*;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.rmi.ServerException;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/health-check")
@Api(tags = "00. νμ€νΈ π")
@RequiredArgsConstructor
public class HealthCheckController {

    @Operation(summary = "νμ€νΈ api", description = "νμ€νΈμ© api μλλ©")
    @GetMapping(produces = "application/json;charset=utf-8")
    public CommonResponse<String> healthCheck () {
        log.info("health-check");
        return CommonResponse.onSuccess("νμ€νΈ μ±κ³΅");
    }
}
