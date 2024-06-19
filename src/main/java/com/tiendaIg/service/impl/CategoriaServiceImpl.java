package com.tiendaIg.service.impl;

import com.tiendaIg.dao.CategoriaDao;
import com.tiendaIg.domain.Categoria;
import com.tiendaIg.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activo) {
        List<Categoria> lista = categoriaDao.findAll();
                
        // Filtrar en caso de querer solo activos
        if (activo) {
            lista.removeIf(c -> !c.isActivo());
        }
        
        return lista;
    }
    
}
