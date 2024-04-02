package com.animal.shelter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.animal.shelter.vo.Board;

@Mapper
public interface BoardMapper {
	
	@Select("SELECT * FROM (SELECT RANK() OVER( ORDER BY b_idx DESC) no, b.* FROM board b )WHERE no BETWEEN #{start} AND #{end}")
	List<Board> board_list(Map<String, Integer> map);
	
	@Select("SELECT count(*) FROM board")
	int board_count();
	
	

}
