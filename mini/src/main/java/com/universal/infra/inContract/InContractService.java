package com.universal.infra.inContract;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InContractService {

	@Autowired
	private InContractDao incontractDao;
	
	// conSelectList
	public List<InContractDto> conSelectList() {
		List<InContractDto> contracts = incontractDao.conSelectList();
		return contracts;
	}
	
	// conInsert
	public int conInsert(InContractDto inContractDto) {
		return incontractDao.conInsert(inContractDto);
	}
}
