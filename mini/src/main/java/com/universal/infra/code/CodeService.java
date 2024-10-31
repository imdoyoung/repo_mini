package com.universal.infra.code;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universal.infra.codeGroup.CodeGroupDto;
import com.universal.infra.codeGroup.CodeGroupVo;

import jakarta.annotation.PostConstruct;


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
	//cahco
	@PostConstruct
	public void selectListCachedCodeArrayList() {
		System.out.println("selectListCachedCodeArrayList 함수 실행");
		List<CodeDto> codeList = (ArrayList<CodeDto>) codeDao.selectListCachedCodeArrayList();
		CodeDto.cachedCodeArrayList.clear();
		CodeDto.cachedCodeArrayList.addAll(codeList);
		System.out.println("cachedCodeArrayList: " + CodeDto.cachedCodeArrayList.size() + "chached!!");

	}
	public static void clear() {
		CodeDto.cachedCodeArrayList.clear();
	}
	
	public static List<CodeDto> selectListCachedCode(String inCodegroup_incgSeq){
		List<CodeDto> rt = new ArrayList<CodeDto>();
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getInCodegroup_incgSeq().equals(inCodegroup_incgSeq)) {
				rt.add(codeRow);
			} else {
				// by pass
			}
		}
		return rt;
	}
	
	public static String selectOneCachedCode(int incdSeq){
		String rt = "";
		for(CodeDto codeRow : CodeDto.cachedCodeArrayList) {
			if (codeRow.getIncdSeq().equals(Integer.toString(incdSeq))) {
				rt = codeRow.getIncdName();
			} else {
				// by pass
			}
		}
		return rt;
	}
		
}
