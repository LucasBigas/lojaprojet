package br.univille.lojaprojet.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.lojaprojet.Entity.ComissaoVenda;
import br.univille.lojaprojet.service.AtendenteService;
import br.univille.lojaprojet.service.ComissaoVendaService;



@Controller
@RequestMapping("/comissaovendas")
public class ComissaoVendaController {

    @Autowired
    private ComissaoVendaService service;

    @Autowired
    private AtendenteService atendenteService;

    @GetMapping
    public ModelAndView index(){
        var listaComissao = service.getAll();
        return new ModelAndView("comissao/index","listaComissao",listaComissao);
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var comissao = new ComissaoVenda();
        var listaAtendentes = atendenteService.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("comissao", comissao);
        dados.put("listaAtendentes", listaAtendentes);
        return new ModelAndView("comissao/form",dados);
    }

    @PostMapping(params = "form")
    public ModelAndView save(ComissaoVenda comissaoVenda){
        service.save(comissaoVenda);
        return new ModelAndView("redirect:/comissaovendas");
    }

    @GetMapping("/alterar/{id}")
    public ModelAndView alterar(@PathVariable("id") long id){
        var umaComissao = service.findById(id);
        var listaAtendentes = atendenteService.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("comissao", umaComissao);
        dados.put("listaAtendentes", listaAtendentes);
        return new ModelAndView("comissao/form",dados);
    }
}