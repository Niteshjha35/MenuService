package com.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menu.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {

	

}
