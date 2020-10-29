package com.escalab.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.escalab.model.CompraProducto;
import com.escalab.repo.ICompraProductoRepo;
import com.escalab.service.ICompraProductoService;

public class CompraProductoServiceImpl implements ICompraProductoService {

	@Autowired
	private ICompraProductoRepo repo;

	@Override
	public List<CompraProducto> listarProductoPorCompra(Integer idVenta) {
		// TODO Auto-generated method stub
		return repo.listarProductoPorCompra(idVenta);
		//return null;
	}

}
