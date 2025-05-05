package com.menu.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
@NoArgsConstructor
public class Menu {

    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Long Id;
private String menuItem;
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getMenuItem() {
	return menuItem;
}
public void setMenuItem(String menuItem) {
	this.menuItem = menuItem;
}

public Menu() {}

public Menu(Long id, String menuItem) {
	super();
	Id = id;
	this.menuItem = menuItem;
}
@Override
public String toString() {
	return "Menu [Id=" + Id + ", menuItem=" + menuItem + "]";
}





}
