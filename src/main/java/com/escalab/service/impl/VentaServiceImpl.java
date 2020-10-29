package com.escalab.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.escalab.dto.FiltroVentaDTO;
import com.escalab.dto.VentaDTO;
import com.escalab.dto.VentaListaProductoDTO;
import com.escalab.dto.VentaResumenDTO;
import com.escalab.model.Venta;
import com.escalab.repo.ICompraProductoRepo;
import com.escalab.repo.IVentaRepo;
import com.escalab.service.IVentaService;

public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaRepo repo;
	
	@Autowired
	private ICompraProductoRepo cpRepo;

	@Override
	public Venta registrar(Venta obj) {
		return repo.save(obj);
	}

	@Override
	public Venta modificar(Venta obj) {
		// TODO Auto-generated method stub
		return repo.save(obj);
	}

	@Override
	public List<Venta> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Venta leerPorId(Integer id) {
		Optional<Venta> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Venta();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

	@Override
	public Venta registrarTransaccional(VentaListaProductoDTO dto) {
		return dto.getVenta();
	}

	@Override
	public List<Venta> buscar(FiltroVentaDTO filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Venta> buscarFecha(FiltroVentaDTO filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VentaResumenDTO> listarResumen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] generarReporte() {
		// TODO Auto-generated method stub
		return null;
	}

}

