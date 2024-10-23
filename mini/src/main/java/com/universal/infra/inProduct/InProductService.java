package com.universal.infra.inProduct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universal.infra.inApplication.InApplicationDto;

@Service
public class InProductService {
	
	@Autowired
	private InProductDao inproductDao;
	
	public List<InProductDto> ProSelectList(InProductVo inProductVo) {
		List<InProductDto> inProducts = inproductDao.ProSelectList(inProductVo);
		return inProducts;
	}
	
	// ProSelectOne
	public InProductDto ProSelectOne(InProductDto inProductDto) {
		return inproductDao.ProSelectOne(inProductDto);
	}
	
	// ProInsert
	public int ProInsert(InProductDto inProductDto) {
		return inproductDao.ProInsert(inProductDto);
	}

	// ProUpdate
	public int ProUpdate(InProductDto inProductDto) {
		return inproductDao.ProUpdate(inProductDto);
	}

}
