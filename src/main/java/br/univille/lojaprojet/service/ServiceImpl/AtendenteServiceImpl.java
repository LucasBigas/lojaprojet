package br.univille.lojaprojet.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.lojaprojet.Entity.Atendente;
import br.univille.lojaprojet.repository.AtendenteRepository;
import br.univille.lojaprojet.service.AtendenteService;

@Service
public class AtendenteServiceImpl implements AtendenteService{

    @Autowired
    private AtendenteRepository repositorio;

    @Override
    public List<Atendente> getAll() {
        
        return repositorio.findAll();
    }

    @Override
    public Atendente save(Atendente atendente) {
        
        return repositorio.save(atendente);
    }

    @Override
    public Atendente findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Atendente();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);
    }
    
}
