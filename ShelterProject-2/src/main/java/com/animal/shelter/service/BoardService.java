package com.animal.shelter.service;

import org.springframework.stereotype.Service;

import com.animal.shelter.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	
	private final BoardMapper boardMapper;

}
