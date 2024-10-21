package com.universal.infra.codeGroup;



import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface CodeGroupDao {
	//list
	public List<CodeGroupDto>selectList(CodeGroupVo codegroupvo);
	//insert
	public int insert(CodeGroupDto codeGroupDto); 
	//selectone
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto);
	//update
	public int update(CodeGroupDto codeGroupDto); 
	//delete
	public int delete(CodeGroupDto codeGroupDto); 
	//uelete
	public int uelete(CodeGroupDto codeGroupDto); 
	//selectOneCount
	public int selectOneCount(CodeGroupVo codegroupvo); 
	    

}
