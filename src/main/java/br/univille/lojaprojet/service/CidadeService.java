package br.univille.lojaprojet.service;

import java.util.List;

import br.univille.lojaprojet.Entity.Cidade;

public interface CidadeService {
    List<Cidade>getAll();
    Cidade save(Cidade cidade);
    Cidade findById(long id);
    void delete(long id);
}
