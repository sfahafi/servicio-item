package com.sfahafi.app.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sfahafi.app.item.models.Item;
import com.sfahafi.app.item.service.IItemService;

@RestController
public class ItemController {

	@Autowired
	@Qualifier("serviceFeign")
	private IItemService itemService;
	
	@GetMapping("/listar")
	public List<Item> listar(){
		return itemService.buscarTodos();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Item detalle(@PathVariable Long id, @PathVariable Integer cantidad) {
		return itemService.buscarPorId(id, cantidad);
	}
	
}
