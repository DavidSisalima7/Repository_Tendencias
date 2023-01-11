package ista.edu.proyecto.factura.Proyecto_Factura.repository;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDao extends JpaRepository<Cliente, Integer> {

}
