package com.universal.infra.inContract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InContractService {

	@Autowired
	private InContractDao inContractDao;
	
	// conSelectList
	public List<InContractDto> conSelectList(InContractVo inContractVo) {
		return inContractDao.conSelectList(inContractVo);
	}
	
	// conInsert
	public int conInsert(InContractDto inContractDto) {
		return inContractDao.conInsert(inContractDto);
	}
	
	// conSelectOne
	public InContractDto conSelectOne(InContractDto inContractDto) {
		return inContractDao.conSelectOne(inContractDto);
	}
	
	// conUpdate
	public int conUpdate(InContractDto inContractDto) {
		return inContractDao.conUpdate(inContractDto);
	}
	
	// conSelectOneCount
	public int conSelectOneCount(InContractVo inContractVo) {
		return inContractDao.conSelectOneCount(inContractVo);
	}
	
}
