package br.univille.lojaprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.lojaprojet.Entity.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository<Produto,Long>{
    
}
