package br.univille.lojaprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.lojaprojet.Entity.ComissaoVenda;

@Repository
public interface ComissaoVendaRepository  extends JpaRepository<ComissaoVenda,Long>{
    
}
