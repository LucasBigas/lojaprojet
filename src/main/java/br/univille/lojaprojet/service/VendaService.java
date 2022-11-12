package br.univille.lojaprojet.service;

import java.util.List;

import br.univille.lojaprojet.Entity.Venda;

public interface VendaService {
    List<Venda>getAll();
    Venda save(Venda venda);
    Venda findById(long id);
}
