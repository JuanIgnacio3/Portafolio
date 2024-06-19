package com.tiendaIg.service;

import com.tiendaIg.domain.Categoria;
import java.util.List;

public interface CategoriaService {
    
    //Metodo que obtiene una lista de categorias
    public List<Categoria> getCategorias(boolean activo);
    
}
