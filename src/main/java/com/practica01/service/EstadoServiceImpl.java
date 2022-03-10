package com.practica01.service;

import com.practica01.EstadoDao.EstadoDao;
import com.practica01.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstadoServiceImpl implements EstadoService{

    @Autowired
    private EstadoDao estadoDao;
    
    @Override
    public List<Estado> getEstados() {
        return (List<Estado>)estadoDao.findAll();
    }

    @Override
    public void save(Estado estado) {
       estadoDao.save(estado);
    }

    @Override
    public void delete(Estado estado) {
         estadoDao.delete(estado);
    }

    @Override
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdEstado()).orElse(null);
    }
    
}
