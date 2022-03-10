package com.sfahafi.app.item.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.sfahafi.app.item.clientes.ProductoClienteRest;
import com.sfahafi.app.item.models.Item;

@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements IItemService {
	
	@Autowired
	private ProductoClienteRest pcr;

	@Override
	public List<Item> buscarTodos() {
		return pcr.listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item buscarPorId(Long id, Integer cantidad) {
		return new Item(pcr.detalle(id), cantidad);
	}

}
