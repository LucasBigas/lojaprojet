package br.univille.lojaprojet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.univille.lojaprojet.Entity.Atendente;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente,Long> {
    
}
