package com.escalab.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.escalab.dto.FiltroVentaDTO;
import com.escalab.dto.VentaListaProductoDTO;
import com.escalab.dto.VentaResumenDTO;
import com.escalab.model.Venta;

public interface IVentaRepo extends JpaRepository<Venta, Integer> {

	@Query("from Venta v where v.cliente.id_cliente =: id_cliente or LOWER (v.cliente.nombre_cliente)like %:nombre_cliente%")
	List<Venta> buscar(@Param("id_cliente")String id_cliente, @Param("nombre_cliente")String nombre_cliente);

	@Query(value = "from Venta v where v.fecha between :fechaVenta and :fechaSgte")
	List<Venta> buscarFecha(@Param("fechaVenta") LocalDateTime fechaVenta, @Param("fechaSgte") LocalDateTime fechaSgte);

	@Query(value = "Select * from fn_listarResumen()", nativeQuery = true)
	List<Object[]> listarResumen();
}
