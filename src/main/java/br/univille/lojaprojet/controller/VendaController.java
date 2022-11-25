package br.univille.lojaprojet.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.lojaprojet.Entity.Venda;
import br.univille.lojaprojet.service.AtendenteService;
import br.univille.lojaprojet.service.ClienteService;
import br.univille.lojaprojet.service.VendaService;

@Controller
@RequestMapping("/vendas")
public class VendaController {
    
    @Autowired
    private VendaService service;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private AtendenteService atendenteService;

    @GetMapping
    public ModelAndView index(){
        var listaVendas = service.getAll();
        return new ModelAndView("venda/index","listaVendas",listaVendas);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var venda = new Venda();
        var listaClientes = clienteService.getAll();
        var listaAtendentes = atendenteService.getAll();
        HashMap<String,Object> dados =new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaClientes", listaClientes);
        dados.put("listaAtendentes", listaAtendentes);
        return new ModelAndView("venda/form",dados);
    }

    @PostMapping(params = "form")
    public ModelAndView save(Venda venda){
        service.save(venda);
        return new ModelAndView("redirect:/vendas");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var venda = service.findById(id);
        var listaAtendentes = atendenteService.getAll();
        var listaClientes = clienteService.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("venda", venda);
        dados.put("listaClientes", listaClientes);
        dados.put("listaAtendentes", listaAtendentes);
        return new ModelAndView("venda/form",dados);
    }
}
