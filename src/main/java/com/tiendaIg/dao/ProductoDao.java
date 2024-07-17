package com.tiendaIg.dao;

import com.tiendaIg.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
