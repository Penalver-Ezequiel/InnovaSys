package com.irso.innovasys.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nombre;

    @Column(nullable = false)
    private double precioBase;

    @Column(nullable = false)
    private double stock;

    @Enumerated(EnumType.STRING)
    @Column(name = "unidad_medida", nullable = false)
    private UnidadMedida unidadMedida;

    public Producto() {}

    public Producto(String nombre, double precioBase, double stock, UnidadMedida unidadMedida) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.stock = stock;
        this.unidadMedida = unidadMedida.UNIDAD;
    }
    
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) { 
        this.unidadMedida = unidadMedida;
    }

     public UnidadMedida getUnidadMedida() { 
        return unidadMedida; 
    }

    @Override
     public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precioBase=" + precioBase +
                ", stock=" + stock +
                ", unidadMedida=" + unidadMedida + 
                '}';
    }  
  
}
