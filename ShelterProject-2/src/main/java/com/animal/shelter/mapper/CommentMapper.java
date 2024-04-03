package com.animal.shelter.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.animal.shelter.vo.Board;

@Mapper
public interface CommentMapper {
	
	@Select("SELECT * FROM (SELECT RANK() OVER( ORDER BY c_idx DESC) no, c.* FROM Comment c  where b_idx = #{b_idx})WHERE no BETWEEN #{start} AND #{end}")
	List<Board> Comment_list(Map<String, Integer> map);
	
	@Select("SELECT count(*) FROM comment where b_idx = #{b_idx}")
	int Comment_count();

}
