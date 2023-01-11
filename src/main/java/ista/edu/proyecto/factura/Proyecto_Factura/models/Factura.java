package ista.edu.proyecto.factura.Proyecto_Factura.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Factura {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Integer id_factura;
    @Column(name="date")
    private Date date;

    //Relacion con cliente
    @ManyToOne
    //Siempre los mismos nombres para no confundirme
    @JoinColumn(name = "id_cliente",referencedColumnName = "id_cliente")
    //El nombre de esta variable va a @OnetoMany(mappedBy = "cliente")
    private Cliente cliente;

    //Relacion con  detalle de factura
    @OneToMany(mappedBy = "factura")
    private List<Detalle_factura>detalleFacturas;

}
