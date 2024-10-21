package com.universal.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.universal.infra.codeGroup.CodeGroupDto;
import com.universal.infra.codeGroup.CodeGroupVo;

@Repository
public interface CodeDao {
	
	public List<CodeDto>selectList(CodeVo codevo);
	
	public int insert(CodeDto codeDto); 
	//codegroup
	public List<CodeDto>selectListCodeGroup();
	//MForm
	public CodeDto selectOne(CodeDto codeDto);
	//Update
	public int update(CodeDto codeDto); 
	//Uelete
	public int uelete(CodeDto codeDto); 
	//Delete
	public int delete(CodeDto codeDto); 
	//selectOneCount
	public int selectOneCount(CodeVo codevo); 
		
}
