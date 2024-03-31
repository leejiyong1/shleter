package com.animal.shelter.service;

import org.springframework.stereotype.Service;

import com.animal.shelter.mapper.CommentMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CommentService {
	
	private final CommentMapper commentMapper;

}
