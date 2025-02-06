package com.becoder.service;

import java.util.List;

import com.becoder.dto.CategoryDto;
import com.becoder.dto.CategoryResponse;

public interface CategoryService {
	
	Boolean saveCategory(CategoryDto categoryDto);
	
	List<CategoryDto> getAllCategory();

	List<CategoryResponse> getActiveCategory();

	CategoryDto getCategoryById(Integer id);

	Boolean deleteCategory(Integer id);
}
