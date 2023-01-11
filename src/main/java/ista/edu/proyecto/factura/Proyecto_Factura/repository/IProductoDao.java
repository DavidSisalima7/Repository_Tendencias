package ista.edu.proyecto.factura.Proyecto_Factura.repository;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoDao extends JpaRepository<Producto, Integer> {

}
