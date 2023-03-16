package com.br.microservice.validador.saques.domain;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Conta {

    private String id;
    private Integer agencia;

    private Integer conta;
    private Integer digito;
    private Double saldo = 0.0;
    private String documentoCliente;
    private String idCliente;
    private TipoConta tipoConta;
    private Integer quantidadeSaque;
}
