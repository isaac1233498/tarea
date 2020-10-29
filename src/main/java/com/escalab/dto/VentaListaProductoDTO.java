package com.escalab.dto;

import java.util.List;

import com.escalab.model.Producto;
import com.escalab.model.Venta;

public class VentaListaProductoDTO {

	private Venta venta;
	private List<Producto> lstproducto;
	
	public Venta getVenta() {
		return venta;
	}
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	public List<Producto> getLstproducto() {
		return lstproducto;
	}
	public void setLstproducto(List<Producto> lstproducto) {
		this.lstproducto = lstproducto;
	}
	
}
