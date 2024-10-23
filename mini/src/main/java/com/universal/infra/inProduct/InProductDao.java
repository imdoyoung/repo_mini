package com.universal.infra.inProduct;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface InProductDao {
	
	// ProSelectList
	public List<InProductDto> ProSelectList(InProductVo inProductVo);
	
	// ProSelectOne
	public InProductDto ProSelectOne(InProductDto inProductDto);
	
	// ProInsert
	public int ProInsert(InProductDto inProductDto);
	
	// ProUpdate
	public int ProUpdate(InProductDto inProductDto);

}
