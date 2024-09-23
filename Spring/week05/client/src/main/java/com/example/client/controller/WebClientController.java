package com.example.client.controller;

import com.example.client.dto.MemberDto;
import com.example.client.dto.Tweet;
import com.example.client.service.WebClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class WebClientController {
    private static final Logger log = LoggerFactory.getLogger(WebClientController.class);

    private String getSlowServiceUri() {
        return "http://localhost:9090/api/v1/slow";
    }

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

    @GetMapping(value = "/tweets-non-blocking", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Tweet> getTweetsNonBlocking() {
        log.info("Starting NON-BLOCKING Controller!");
        Flux<Tweet> tweetFlux = WebClient.create()
                .get()
                .uri(getSlowServiceUri())
                .retrieve()
                .bodyToFlux(Tweet.class);

        tweetFlux.subscribe(tweet -> log.info(tweet.toString()));
        log.info("Exiting NON-BLOCKING Controller!");
        return tweetFlux;
    }
}

