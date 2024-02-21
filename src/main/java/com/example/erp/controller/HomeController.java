package com.example.erp.controller;

import com.example.erp.model.BoardDto;
import com.example.erp.model.Header;
import com.example.erp.model.SearchCondition;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Controller
@CrossOrigin
public class HomeController {
    @GetMapping("/")
    public String test() {
        return "index";
    }

}
