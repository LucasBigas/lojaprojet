package br.univille.lojaprojet.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.lojaprojet.Entity.Cliente;
import br.univille.lojaprojet.repository.ClienteRepository;
import br.univille.lojaprojet.service.ClienteService;

@Service
public class ClienteServiceImpl  implements ClienteService{

    @Autowired
    private ClienteRepository repositorio;


    @Override
    public List<Cliente> getAll() {
        
        return repositorio.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        
        return repositorio.save(cliente);
    }

    @Override
    public Cliente findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Cliente();
    }

    @Override
    public void delete(long id) {
        repositorio.deleteById(id);;
        
        
    }

    
}
