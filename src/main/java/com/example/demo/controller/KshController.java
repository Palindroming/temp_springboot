package com.example.demo.controller;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KshController {
    @GetMapping("/ksh")
    @ResponseBody
    public String index() {
        return "안녕하세요 김성현입니다";
    }
}


