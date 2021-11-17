package br.com.tt.petshop.repository;

import org.springframework.stereotype.Repository;

@Repository
public class TipoPagamentoRepository {

/*
    public List<String> listarTipoPagamento(){
        return List.of("CREDITO","DEBITO","PIX","BOLETO");
    }
*/

    public TipoPagamento[] listarTipoPagamento(){
        return TipoPagamento.values();
    }




}
