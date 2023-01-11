package ista.edu.proyecto.factura.Proyecto_Factura.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Detalle_factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Integer id_detalle;
    @Column(name = "numero_factura")
    private Integer numero_factura;
    @Column(name = "cantidad")
    private Integer cantidad;

    //Relacion con factura
    @ManyToOne
    @JoinColumn(name = "id_factura",referencedColumnName = "id_factura")
    private Factura factura;

    //Relacion con productos
    @ManyToOne
    @JoinColumn(name = "id_producto",referencedColumnName = "id_producto")
    private Producto producto;

}
