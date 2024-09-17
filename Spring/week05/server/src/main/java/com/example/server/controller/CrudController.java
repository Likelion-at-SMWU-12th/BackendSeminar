package com.example.server.controller;

import com.example.server.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/crud-api")
public class CrudController {

    @GetMapping
    public String getName() {
        return "Flature";
    }

    @GetMapping("/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }

    @GetMapping("/param")
    public String getNameWithParam(@RequestParam String name) {
        return "Hello. " + name + "!";
    }

    @PostMapping
    public ResponseEntity<MemberDto> getMember(
            @RequestBody MemberDto request,
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization
    ) {
        MemberDto memberDto = new MemberDto();
        memberDto.setName(name);
        memberDto.setEmail(email);
        memberDto.setOrganization(organization);
        return ResponseEntity.status(HttpStatus.OK).body(memberDto);
    }

    @PostMapping("/add-header")
    public ResponseEntity<MemberDto> addHeader(@RequestHeader("my-header") String header,
                                               @RequestBody MemberDto memberDto) {
        return ResponseEntity.status(HttpStatus.OK).body(memberDto);
    }
}