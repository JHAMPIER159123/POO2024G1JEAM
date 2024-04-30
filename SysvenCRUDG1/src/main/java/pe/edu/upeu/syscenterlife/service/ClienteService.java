package pe.edu.upeu.syscenterlife.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.dao.ClienteDao;
import pe.edu.upeu.syscenterlife.modelo.Cliente;

@Service
public class ClienteService {
    
    ClienteDao clienteDao=new ClienteDao();

    List<Cliente> listaCli = new ArrayList<>();

    public boolean saveEntidad(Cliente cliente) { //create
        return clienteDao.guardarCliente(cliente)==1?true:false;
    }

    public List<Cliente> listarEntidad() { //report
        return clienteDao.addCliente();
    }

    public Cliente buscarCliente(String dniruc) {
        return listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dniruc))
                .findFirst()
                .orElse(null); // Devuelve null si no se encuentra ningún cliente
    }

    public Cliente updateEntidad(Cliente clientex) { //update
        listaCli.stream()
                .filter(cliente
                        -> cliente.getDniruc().equals(clientex.getDniruc())) // Filtrar por DNI
                .findFirst() // Obtener el primer cliente que cumpla con el filtro
                .ifPresent(cliente
                        -> cliente.setNombre(cliente.getNombre()));
        //return this.listaCli.set(index, cliente);
        return buscarCliente(clientex.getDniruc());
    }

    public void deleteRegistEntdad(String dato) { //delete
        listaCli.remove(listaCli.stream()
                .filter(cliente -> cliente.getDniruc().equals(dato))
                .findFirst().orElse(null));
    }
}
