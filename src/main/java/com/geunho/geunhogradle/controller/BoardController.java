package com.geunho.geunhogradle.controller;

import com.geunho.geunhogradle.dto.BoardDto;
import com.geunho.geunhogradle.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    private BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board_notice")
    public String list() {
        return "board/list.html";
    }

    @GetMapping("/board_notice_post")
    public String post() {
        return "board/post.html";
    }

    @PostMapping("/board_notice_post")
    public String write(BoardDto boardDto) {
        boardService.savePost(boardDto);
        return "redirect:/";
    }

}