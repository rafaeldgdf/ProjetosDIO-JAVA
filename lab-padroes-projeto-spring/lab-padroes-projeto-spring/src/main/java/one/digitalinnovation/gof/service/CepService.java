package one.digitalinnovation.gof.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.repository.EnderecoRepository;

@Service
public class CepService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    @Autowired
    private ViaCepService viaCepService;
    
    public Endereco buscarOuCriarEndereco(String cep) {
        return enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            novoEndereco.setCep(cep); // Certifique-se de que o CEP está sendo atribuído aqui
            return enderecoRepository.save(novoEndereco);
        });
    }
}
