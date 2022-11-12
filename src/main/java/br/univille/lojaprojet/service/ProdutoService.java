package br.univille.lojaprojet.service;

import java.util.List;

import br.univille.lojaprojet.Entity.Produto;

public interface ProdutoService {
    List<Produto>getAll();
    Produto save(Produto produto);
    Produto findById(long id);
}
