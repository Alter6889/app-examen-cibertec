package pe.edu.cibertec.app_examen_cibertec.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_examen_cibertec.model.Cliente;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();

    public Cliente agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

}
