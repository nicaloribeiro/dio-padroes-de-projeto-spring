package dio.bootcamp.bootcampgft.service;

import dio.bootcamp.bootcampgft.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void cadastrarCliente(Cliente cliente);

    void atualizarCliente(Long id, Cliente cliente);

    void deletarCliente(Long id);
}
