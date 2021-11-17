package br.com.tt.petshop.repository;

public enum TipoPagamento {
    CREDITO,
    DEBITO,
    PIX,
    BOLETO;

    private String tipo;

    TipoPagamento() {
        tipo = tipo;
    }

    public String getTipo(){return tipo;}

}
