package br.univille.lojaprojet.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.lojaprojet.Entity.ComissaoVenda;
import br.univille.lojaprojet.repository.ComissaoVendaRepository;
import br.univille.lojaprojet.service.ComissaoVendaService;

@Service
public class ComissaoVendaServiceImpl implements ComissaoVendaService {

    @Autowired
    private ComissaoVendaRepository repositorio;

    @Override
    public List<ComissaoVenda> getAll() {
       
        return repositorio.findAll();
    }

    @Override
    public ComissaoVenda save(ComissaoVenda comissaoVenda) {
     
        return repositorio.save(comissaoVenda);
    }

    @Override
    public ComissaoVenda findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new ComissaoVenda();
    }
    
}
