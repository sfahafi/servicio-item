package com.sfahafi.app.item.service;

import java.util.List;

import com.sfahafi.app.item.models.Item;

public interface IItemService {

	public List<Item> buscarTodos();
	public Item buscarPorId(Long id, Integer cantidad);
}
