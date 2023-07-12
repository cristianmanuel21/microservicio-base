package com.formacionbdi.springboot.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.pe.commons.app.models.Producto;


public interface ProductoDao extends CrudRepository<Producto, Long>{

}
