package br.univille.lojaprojet.service;

import java.util.List;

import br.univille.lojaprojet.Entity.ComissaoVenda;

public interface ComissaoVendaService {
    List<ComissaoVenda>getAll();
    ComissaoVenda save(ComissaoVenda comissaoVenda);
    ComissaoVenda findById(long id);
}
