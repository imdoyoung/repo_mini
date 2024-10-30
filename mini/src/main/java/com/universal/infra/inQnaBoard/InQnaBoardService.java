package com.universal.infra.inQnaBoard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universal.infra.code.CodeDto;
import com.universal.infra.codeGroup.CodeGroupDto;
import com.universal.infra.codeGroup.CodeGroupVo;


@Service
public class InQnaBoardService {
	
	@Autowired
	private InQnaBoardDao inQnaBoardDao;
	//List
	public List<InQnaBoardDto> selectList(InQnaBoardVo inQnaBoardvo) {
		return inQnaBoardDao.selectList(inQnaBoardvo);
	}

	public InQnaBoardDto selectOne(InQnaBoardDto inQnaBoardDto) {
		return inQnaBoardDao.selectOne(inQnaBoardDto);
	}
	
	//UPDATE
	public int update(InQnaBoardDto inQnaBoardDto) {
		System.out.println(inQnaBoardDto.getInqbSeq());
		return inQnaBoardDao.update(inQnaBoardDto);
	}
	
	 //insert
	public int insert(InQnaBoardDto inQnaBoardDto) {
		return inQnaBoardDao.insert(inQnaBoardDto);
	}
	
	//delete
	public int delete(InQnaBoardDto inQnaBoardDto) {
		return inQnaBoardDao.delete(inQnaBoardDto);
	}
	
	//uelete
	public int uelete(InQnaBoardDto inQnaBoardDto) {
		return inQnaBoardDao.uelete(inQnaBoardDto);
	}
	//SelectCount
	 public int selectOneCount(InQnaBoardVo inQnaBoardvo) { 
	     return inQnaBoardDao.selectOneCount(inQnaBoardvo); 
	 } 
	 //member
	 public List<InQnaBoardDto> selectListInQnaBoard() {
			return inQnaBoardDao.selectListInQnaBoard();
	} 
	 //staff
	 public List<InQnaBoardDto> selectstaffInQnaBoard() {
			return inQnaBoardDao.selectstaffInQnaBoard();
	}  

}
