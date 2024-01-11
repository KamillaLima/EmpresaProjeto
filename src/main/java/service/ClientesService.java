package service;

import model.Cliente;
import org.springframework.stereotype.Service;
import repository.ClientesRepository;

@Service
public class ClientesService {
    public  void salvarCliente(Cliente cliente){
        //Preciso do clienteRepository para que ele realize essa conexão com o banco de dados
        ClientesRepository clientesRepository = new ClientesRepository();
        ClientesRepository.persistir(cliente);
    }

    public  void validarCliente(Cliente cliente){

    }
}
