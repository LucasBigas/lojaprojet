package br.univille.lojaprojet.service;

import java.util.List;

import br.univille.lojaprojet.Entity.Atendente;

public interface AtendenteService {
    List<Atendente>getAll();
    Atendente save(Atendente atendente);
    Atendente findById(long id);
    void delete(long id);
}
