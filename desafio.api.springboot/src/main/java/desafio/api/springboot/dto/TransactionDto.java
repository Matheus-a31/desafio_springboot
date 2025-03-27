package desafio.api.springboot.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;

public class TransactionDto {

    @NotNull
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}   
