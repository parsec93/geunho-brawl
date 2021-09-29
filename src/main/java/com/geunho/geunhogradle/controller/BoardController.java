package com.geunho.geunhogradle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board_notice")
    public String list() {
        return "board/list.html";
    }

    @GetMapping("/board_notice_post")
    public String post() {
        return "board/post.html";
    }
}