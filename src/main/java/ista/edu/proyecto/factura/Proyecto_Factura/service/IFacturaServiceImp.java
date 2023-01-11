package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Factura;
import ista.edu.proyecto.factura.Proyecto_Factura.repository.IFacturaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class IFacturaServiceImp implements IFacturaService {

    @Autowired
    private IFacturaDao facturaDao;

    @Override
    @Transactional(readOnly=true)
    public List<Factura> findAll() {
        return (List<Factura>) facturaDao.findAll();
    }

    @Override
    @Transactional
    public Factura save(Factura factura) {
        return facturaDao.save(factura);
    }

    @Override
    @Transactional(readOnly=true)
    public Factura findById(Integer id) {
        return facturaDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        facturaDao.deleteById(id);
    }
}
