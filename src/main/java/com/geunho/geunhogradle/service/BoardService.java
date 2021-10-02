package com.geunho.geunhogradle.service;

import com.geunho.geunhogradle.domain.repository.BoardRepository;
import com.geunho.geunhogradle.dto.BoardDto;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
