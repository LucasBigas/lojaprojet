package br.univille.lojaprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.lojaprojet.Entity.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Long> {
    
}
