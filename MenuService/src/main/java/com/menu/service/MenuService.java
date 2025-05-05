package com.menu.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.menu.entity.Menu;

@Service
public interface MenuService {
	
	Menu addMenu(Menu menu);
	
	List<Menu> getMenu();
	
	Menu get(Long id);
	
	

}
