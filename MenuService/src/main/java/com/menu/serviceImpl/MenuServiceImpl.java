package com.menu.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menu.entity.Menu;
import com.menu.repository.MenuRepository;
import com.menu.service.MenuService;


@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	MenuRepository menuRepository;
	
	@Override
	public Menu addMenu(Menu menu) {
		
		return menuRepository.save(menu);
	}

	@Override
	public List<Menu> getMenu() {
		
		return menuRepository.findAll();
	}

	@Override
	public Menu get(Long id) {
		
		return menuRepository.findById(id).orElseThrow(()-> new RuntimeException("Menu is Not found..."));
	}

	
	
	
	
   
	
	
	

}
