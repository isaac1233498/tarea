package com.escalab.service;

import java.util.List;

import com.escalab.model.CompraProducto;

public interface ICompraProductoService {

	List<CompraProducto> listarProductoPorCompra(Integer idVenta);

	
}
