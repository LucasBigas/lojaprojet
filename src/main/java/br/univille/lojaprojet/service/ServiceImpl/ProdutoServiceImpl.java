package br.univille.lojaprojet.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.lojaprojet.Entity.Produto;
import br.univille.lojaprojet.repository.ProdutoRepository;
import br.univille.lojaprojet.service.ProdutoService;

@Service
public class ProdutoServiceImpl  implements ProdutoService{

    @Autowired
    private ProdutoRepository repositorio;

    @Override
    public List<Produto> getAll() {
    
        return repositorio.findAll();
    }

    @Override
    public Produto save(Produto produto) {
        
        return repositorio.save(produto);
    }

    @Override
    public Produto findById(long id) {
        var resultado = repositorio.findById(id);
        if(resultado.isPresent()){
            return resultado.get();
        }
        return new Produto();
    }
    
}
