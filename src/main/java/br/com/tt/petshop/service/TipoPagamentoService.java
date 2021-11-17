package br.com.tt.petshop.service;

import br.com.tt.petshop.repository.TipoPagamento;
import br.com.tt.petshop.repository.TipoPagamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoPagamentoService {

    private final TipoPagamentoRepository tipoPagamentoRepository;

    public TipoPagamentoService(TipoPagamentoRepository tipoPagamentoRepository){
        this.tipoPagamentoRepository = tipoPagamentoRepository;
    }


    public TipoPagamento[] listarTipoPagamento(){

        return tipoPagamentoRepository.listarTipoPagamento();

    }

}
