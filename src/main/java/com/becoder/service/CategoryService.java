package com.becoder.service;

import java.util.List;

import com.becoder.entity.Category;

public interface CategoryService {
	
	Boolean saveCategory(Category category);
	
	List<Category> getAllCategory();
}
