package ista.edu.proyecto.factura.Proyecto_Factura.repository;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Detalle_factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDetalleFacturaDao extends JpaRepository<Detalle_factura,Integer> {

}
