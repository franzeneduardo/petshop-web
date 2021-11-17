package br.com.tt.petshop.controller;

import br.com.tt.petshop.service.VacinaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vacinas")

public class VacinaController {

    private final VacinaService vacinaService;

    public VacinaController(VacinaService vacinaService){
        this.vacinaService = vacinaService;
    }

    @GetMapping
    public List<String> listarVacinas(){
        return vacinaService.listarVacinas();
    }

}
