package com.example.erp.controller;

import com.example.erp.model.MemberLoginRequestDto;
import com.example.erp.model.TokenInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/profile")
public class ProfileController {
    @GetMapping("/user")
    public Map<String,Object> user() {
        Map<String,Object> test = new HashMap<>();
        test.put("company","test");
        test.put("username","test");
        test.put("email","test");
        test.put("firstName","test");
        test.put("lastName","test");
        test.put("address","test");
        test.put("city","test");
        test.put("country","test");
        test.put("postalCode","test");
        test.put("aboutMe","test");
        return test;
    }
}
