package com.br.microservice.validador.saques.dtos;

import com.br.microservice.validador.saques.domain.Conta;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SolicitacaoDto {
    private Conta conta;
    private Double valorSolicitado;
    private String idSolicitacao;
}
