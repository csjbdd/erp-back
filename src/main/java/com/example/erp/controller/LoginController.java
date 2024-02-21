package com.example.erp.controller;

import com.example.erp.filter.JwtTokenProvider;
import com.example.erp.model.*;
import com.example.erp.service.impl.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@CrossOrigin
public class LoginController {
    private final MemberService memberService;
    private final JwtTokenProvider jwtTokenProvider;
    @PostMapping("/login")
    public Map<String,Object> login(@RequestBody MemberLoginRequestDto memberLoginRequestDto) {
        Map<String,Object> result = new HashMap<>();
        String memberId = memberLoginRequestDto.getMemberId();
        String password = memberLoginRequestDto.getPassword();
        result = memberService.login(memberId, password);
        return result;
    }
    @GetMapping("/test")
    public String test() {
        return "김덕배";
    }

    @PostMapping("/test2")
    public String test2() {
        return "success";
    }
}
