package ista.edu.proyecto.factura.Proyecto_Factura.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer id_producto;
    @Column(name="nombre")
    private String nombre;
    @Column(name="precio")
    private Double precio;
    @Column(name = "stock")
    private int stock;

    //Relacion con detalle de factura
    @OneToMany(mappedBy = "producto")
    private List<Detalle_factura>detalleFacturas;
}
