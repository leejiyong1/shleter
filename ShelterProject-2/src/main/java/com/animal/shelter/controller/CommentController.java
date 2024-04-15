package com.animal.shelter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.animal.shelter.service.CommentService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
	
	private final CommentService commentService;
	
	
	

}
