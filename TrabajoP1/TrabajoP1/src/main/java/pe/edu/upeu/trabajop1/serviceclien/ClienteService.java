package pe.edu.upeu.trabajop1.serviceclien;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.trabajop1.modelocli.Cliente;

@Service
public class ClienteService {
    
     List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente cliente) { //create
        return this.listaCli.add(cliente);
    }

    public List<Cliente> listarEntidad() { //report
        return listaCli;
    }

    public Cliente buscarCliente(String cantidad) {
        return listaCli.stream()
                .filter(cliente -> cliente.getCantidad().equals(cantidad))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Cliente updateEntidad(Cliente clientex) { //update
        listaCli.stream()
                .filter(cliente
                        -> cliente.getCantidad().equals(clientex.getCantidad())) // Filtrar por cantidad de producto
                .findFirst() // Obtener el primer producto que cumpla con el filtro
                .ifPresent(cliente
                        -> cliente.setModelo(cliente.getModelo()));
        //return this.listaCli.set(index, cliente);
        return buscarCliente(clientex.getCantidad());
    }

    public void deleteRegistEntdad(String dato) { //delete
        listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getCantidad().equals(dato))
                .findFirst().orElse(null));
    }
}
