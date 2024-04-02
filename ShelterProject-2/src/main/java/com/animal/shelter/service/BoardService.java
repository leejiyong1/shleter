package com.animal.shelter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.animal.shelter.mapper.BoardMapper;
import com.animal.shelter.vo.Board;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardMapper boardMapper;
	
	public List<Board> board_list(int page){
		int count  = boardMapper.board_count();
		return null;
	}

}
