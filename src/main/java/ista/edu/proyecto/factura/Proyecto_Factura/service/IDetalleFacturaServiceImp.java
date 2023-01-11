package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Detalle_factura;
import ista.edu.proyecto.factura.Proyecto_Factura.repository.IDetalleFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IDetalleFacturaServiceImp implements IDetalleFacturaService{
    @Autowired
    private IDetalleFacturaDao detalleFacturaDao;
    @Override
    @Transactional(readOnly=true)
    public List<Detalle_factura> findAll() {
        return (List<Detalle_factura>) detalleFacturaDao.findAll();
    }

    @Override
    @Transactional
    public Detalle_factura save(Detalle_factura detalleFactura) {
        return detalleFacturaDao.save(detalleFactura);
    }

    @Override
    @Transactional (readOnly=true)
    public Detalle_factura findById(Integer id) {
        return detalleFacturaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        detalleFacturaDao.deleteById(id);
    }
}
