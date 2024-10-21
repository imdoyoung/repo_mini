package com.universal.infra.inQnaBoard;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface InQnaBoardDao {
	
	public List<InQnaBoardDto>selectList(InQnaBoardVo inQnaBoardvo);
	
	public InQnaBoardDto selectOne(InQnaBoardDto inQnaBoardDto);
	
	public int update(InQnaBoardDto inQnaBoardDto); 
	
	public int insert(InQnaBoardDto inQnaBoardDto); 
	
	public int delete(InQnaBoardDto inQnaBoardDto); 
	
	public int uelete(InQnaBoardDto inQnaBoardDto); 
	//selectOneCount
	public int selectOneCount(InQnaBoardVo inQnaBoardvo); 
}
