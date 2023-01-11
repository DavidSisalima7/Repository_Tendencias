package ista.edu.proyecto.factura.Proyecto_Factura.repository;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFacturaDao extends JpaRepository<Factura,Integer> {

}
