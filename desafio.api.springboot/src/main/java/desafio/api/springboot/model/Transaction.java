package desafio.api.springboot.model;

import java.time.OffsetDateTime;

public class Transaction{

    private double valor;
    private OffsetDateTime dataHora;

    /***
     *  Construtor da classe Transaction, um modo mais inteligente de encapsular do que usar sets
     * @param valor
     * @param dataHora
     * 
     */
    public Transaction(final double valor, final OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}