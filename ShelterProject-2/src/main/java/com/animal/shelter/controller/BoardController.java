package com.animal.shelter.controller;

import org.springframework.stereotype.Controller;

import com.animal.shelter.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;

	
}
