package com.universal.infra.codeGroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CodeGroupService {
	
	@Autowired
	private CodeGroupDao codeGroupDao;
	//list
	public List<CodeGroupDto> selectList(CodeGroupVo codegroupvo) {
		return codeGroupDao.selectList(codegroupvo);
	}
    //insert
	public int insert(CodeGroupDto codeGroupDto) {
		return codeGroupDao.insert(codeGroupDto);
	}
	//MForm
	public CodeGroupDto selectOne(CodeGroupDto codeGroupDto) {
		return codeGroupDao.selectOne(codeGroupDto);
	}
	//UPDATE
	public int update(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIncgSeq());
		return codeGroupDao.update(codeGroupDto);
	}
	//Delete
	public int delete(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIncgSeq());
		return codeGroupDao.delete(codeGroupDto);
	}
	//uelete
	public int uelete(CodeGroupDto codeGroupDto) {
		System.out.println(codeGroupDto.getIncgSeq());
		return codeGroupDao.uelete(codeGroupDto);
	}
	//SelectCount
	  public int selectOneCount(CodeGroupVo codegroupvo) { 
	     return codeGroupDao.selectOneCount(codegroupvo); 
	  }  

}
