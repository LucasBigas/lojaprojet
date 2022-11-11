package br.univille.lojaprojet.service;

import java.util.List;

import br.univille.lojaprojet.Entity.Cliente;

public interface ClienteService {
    List<Cliente> getAll();
    Cliente save(Cliente cliente);
    Cliente findById(long id);
    void delete(long id);
   
}
