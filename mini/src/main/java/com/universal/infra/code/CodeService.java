package com.universal.infra.code;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universal.infra.codeGroup.CodeGroupDto;
import com.universal.infra.codeGroup.CodeGroupVo;


@Service
public class CodeService {
	
	@Autowired
	private CodeDao codeDao;
	//list
	public List<CodeDto> selectList(CodeVo codevo) {
		return codeDao.selectList(codevo);
	}
	//insert
	public int insert(CodeDto codeDto) {
		return codeDao.insert(codeDto);	
	}
	//Form-listcodegroup
	public List<CodeDto> selectListCodeGroup() {
		return codeDao.selectListCodeGroup();
	} 
	//MForm
	public CodeDto selectOne(CodeDto codeDto) {
		return codeDao.selectOne(codeDto);	
	}	
	//UPDATE
	public int update(CodeDto codeDto) {
	 System.out.println(codeDto.getIncdSeq());
	    return codeDao.update(codeDto);
	}
	//Uelete
	public int uelete(CodeDto codeDto) {
	 System.out.println(codeDto.getIncdSeq());
		return codeDao.uelete(codeDto);
	}
	//Delete
	public int delete(CodeDto codeDto) {
	 System.out.println(codeDto.getIncdSeq());
		return codeDao.delete(codeDto);
	}	
	//SelectCount
	public int selectOneCount(CodeVo codevo) { 
	     return codeDao.selectOneCount(codevo); 
	} 
		
}
