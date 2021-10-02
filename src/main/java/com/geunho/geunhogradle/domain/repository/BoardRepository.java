package com.geunho.geunhogradle.domain.repository;

import com.geunho.geunhogradle.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
