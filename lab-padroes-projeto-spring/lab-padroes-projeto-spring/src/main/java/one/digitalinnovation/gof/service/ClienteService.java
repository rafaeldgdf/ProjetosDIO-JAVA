package one.digitalinnovation.gof.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Endereco;
import one.digitalinnovation.gof.repository.ClienteRepository;
import one.digitalinnovation.gof.repository.EnderecoRepository;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CepService cepService;

    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(String cpf) {
        return clienteRepository.findById(cpf);
    }

    public Cliente inserir(Cliente cliente) {
        Endereco endereco = cepService.buscarOuCriarEndereco(cliente.getEndereco().getCep());
        cliente.setEndereco(endereco);
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar(String cpf, Cliente cliente) {
        Optional<Cliente> clienteDb = clienteRepository.findById(cpf);
        if (clienteDb.isPresent()) {
            Cliente clienteAtualizado = clienteDb.get();
            clienteAtualizado.setNome(cliente.getNome());
            clienteAtualizado.setSobrenome(cliente.getSobrenome());
            clienteAtualizado.setEndereco(cepService.buscarOuCriarEndereco(cliente.getEndereco().getCep()));
            return clienteRepository.save(clienteAtualizado);
        }
        return null;
    }

    public void deletar(String cpf) {
        clienteRepository.deleteById(cpf);
    }
}
