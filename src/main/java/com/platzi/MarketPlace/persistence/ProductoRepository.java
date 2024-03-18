/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.MarketPlace.persistence;

import com.platzi.MarketPlace.persistence.crud.ProductoCrudRepository;
import com.platzi.MarketPlace.persistence.entity.Producto;
import java.util.List;

/**
 *
 * @author luis
 */
public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    
    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
