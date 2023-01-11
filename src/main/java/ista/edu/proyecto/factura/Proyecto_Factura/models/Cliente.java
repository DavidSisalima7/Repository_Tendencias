package ista.edu.proyecto.factura.Proyecto_Factura.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Cliente {

    //Creacion de atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    private Integer id_cliente;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="cedula")
    private String cedula;
    @Column(name="email")
    private String email;

    //Creacion de relaciones
    //"cliente" viene de la clase relacionada
    @OneToMany(mappedBy = "cliente")
    private List<Factura>facturas;


}
