package com.tiendaIg.dao;

import com.tiendaIg.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaDao extends JpaRepository <Venta,Long> {
     
}
