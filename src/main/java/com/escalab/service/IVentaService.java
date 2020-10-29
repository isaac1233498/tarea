package com.escalab.service;

import java.util.List;

import com.escalab.dto.FiltroVentaDTO;
import com.escalab.dto.VentaListaProductoDTO;
import com.escalab.dto.VentaResumenDTO;
import com.escalab.model.Venta;

public interface IVentaService extends ICRUD<Venta>{
	
	Venta registrarTransaccional(VentaListaProductoDTO dto);
	
	List<Venta> buscar(FiltroVentaDTO filtro);
	
	List<Venta> buscarFecha(FiltroVentaDTO filtro);
	
	List<VentaResumenDTO> listarResumen();
	
	byte[] generarReporte();

}
