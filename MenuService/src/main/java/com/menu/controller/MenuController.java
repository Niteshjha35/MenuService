package com.menu.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menu.entity.Menu;
import com.menu.service.MenuService;

@RestController
@RequestMapping("/menu")


public class MenuController {
	
	//for create
	
	@Autowired
	
	MenuService menuService;
	
	@PostMapping
	public Menu createMenu(@RequestBody Menu menu ) {
		
		return menuService.addMenu(menu);
	}
	

	@GetMapping
	public List<Menu> getMenu() {
		
		return menuService.getMenu();
	}
	
	
	@GetMapping("/{id}")
	public Menu getOne(@PathVariable Long id) {
		
		return menuService.get(id);
	}
	
}
