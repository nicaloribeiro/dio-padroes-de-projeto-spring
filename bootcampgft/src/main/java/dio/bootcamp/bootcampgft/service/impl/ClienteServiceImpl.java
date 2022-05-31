package dio.bootcamp.bootcampgft.service.impl;

import org.springframework.stereotype.Service;

import dio.bootcamp.bootcampgft.model.Cliente;
import dio.bootcamp.bootcampgft.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void cadastrarCliente(Cliente cliente) {}

    @Override
    public void atualizarCliente(Long id, Cliente cliente){}

    @Override
    public void deletarCliente(Long id) {}
}