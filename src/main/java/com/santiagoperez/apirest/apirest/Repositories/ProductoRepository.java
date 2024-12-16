package com.santiagoperez.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santiagoperez.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
