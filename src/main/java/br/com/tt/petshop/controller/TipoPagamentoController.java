package br.com.tt.petshop.controller;

import br.com.tt.petshop.repository.TipoPagamento;
import br.com.tt.petshop.service.TipoPagamentoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tipopagamento")

public class TipoPagamentoController {

    private final TipoPagamentoService tipoPagamentoService;

    public TipoPagamentoController(TipoPagamentoService tipoPagamentoService){
        this.tipoPagamentoService = tipoPagamentoService;
    }

    @GetMapping
    public TipoPagamento[] listarTipoPagamento(){
        return tipoPagamentoService.listarTipoPagamento();
    }

}
