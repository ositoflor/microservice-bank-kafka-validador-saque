package com.br.microservice.validador.saques.services;

import com.br.microservice.validador.saques.dtos.SolicitacaoDto;

public interface ContaService {

    void validaSaque(SolicitacaoDto solicitacao);
}
