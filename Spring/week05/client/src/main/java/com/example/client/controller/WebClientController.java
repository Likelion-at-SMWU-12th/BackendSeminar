package com.example.client.controller;

import com.example.client.dto.MemberDto;
import com.example.client.service.WebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {

    @Autowired
    private WebClientService webClientService;

    @GetMapping("/call-api")
    public Mono<String> callApi() {
        return webClientService.getNameWithPathVariable();
    }

    @GetMapping("/post-member")
    public Mono<MemberDto> postMember() {
        return webClientService.postWithParamAndBody();
    }
}

