package br.univille.lojaprojet.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.univille.lojaprojet.service.CidadeService;
import br.univille.lojaprojet.service.ClienteService;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private CidadeService cidadeService;
    
    @GetMapping
    public ModelAndView index(){
        return new ModelAndView("home/index");
    }

    @GetMapping("/produto")
    public ModelAndView prod(){
        return new ModelAndView("home/produto");
    }

    @GetMapping("/novo")
    public ModelAndView novo(){
        var listaClientes = clienteService.getAll();
        var listaCidades = cidadeService.getAll();
        HashMap<String,Object> dados = new HashMap<>();
        dados.put("listaClientes", listaClientes);
        dados.put("listaCidades", listaCidades);
        return new ModelAndView("home/form",dados);

    }

    

}
