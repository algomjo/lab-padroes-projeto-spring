package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.service.ViaCepService;
import org.springframework.stereotype.Service;

@Service
public class ViaCepServiceImpl implements ViaCepService {

    @Override
    public Endereco consultarCep(String cep) {
        // Implementação da consulta real ao serviço ViaCEP
        return null;
    }
}
