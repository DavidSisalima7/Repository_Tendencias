package ista.edu.proyecto.factura.Proyecto_Factura.service;

import ista.edu.proyecto.factura.Proyecto_Factura.models.Producto;
import ista.edu.proyecto.factura.Proyecto_Factura.repository.IProductoDao;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServiceImp implements IProductoService{

    @Autowired
    private IProductoDao productoDao;

    @Override
    @Transactional (readOnly=true)
    public List<Producto> findAll() {

        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public Producto save(Producto user) {
        return productoDao.save(user);
    }

    @Override
    @Transactional (readOnly=true)
    public Producto findById(Integer id)
    {
        return productoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {

        productoDao.deleteById(id);
    }
}
