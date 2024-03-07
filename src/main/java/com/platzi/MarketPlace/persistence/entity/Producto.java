package com.platzi.MarketPlace.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.websocket.OnError;
import java.util.List;

/**
 *
 * @author luis
 */
@Entity
@Table(name = "productos")
public class Producto {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private String nombre;
    
    @Column(name = "id_categoria")
    private Integer idcategoria;
    
    @Column(name = "codigo_de_barras")
    private String codigodebarras;
    
    @Column(name = "cantidad_stock")
    private double cantidadstock;
    
    private boolean estado;
    
    @Column(name = "precio_venta")
    private double precioventa;
    
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private categoria categoria;
    
    @OneToMany(mappedBy = "producto")
    private List<comprasproducto> comprasproducto;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getIdcategoria() {
        return idcategoria;
    }
    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }
    public String getCodigodebarras() {
        return codigodebarras;
    }
    public void setCodigodebarras(String codigodebarras) {
        this.codigodebarras = codigodebarras;
    }
    public double getCantidadstock() {
        return cantidadstock;
    }
    public void setCantidadstock(double cantidadstock) {
        this.cantidadstock = cantidadstock;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public double getPrecioventa() {
        return precioventa;
    }
    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }    
}
