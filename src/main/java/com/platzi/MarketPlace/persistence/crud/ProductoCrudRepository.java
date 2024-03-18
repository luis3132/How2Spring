/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.platzi.MarketPlace.persistence.crud;

import com.platzi.MarketPlace.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author luis
 */
public interface ProductoCrudRepository extends CrudRepository<Producto, Integer>{
        
}
