package pe.edu.upeu.syscenterlife.servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.syscenterlife.autocomp.ModeloDataAutocomplet;
import pe.edu.upeu.syscenterlife.Modelo.Cliente;
import pe.edu.upeu.syscenterlife.repositorio.ClienteRepository;
import pe.edu.upeu.syscenterlife.utils.ErrorLogger;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;
    
    ErrorLogger log=new ErrorLogger("ClienteService");

    //c
    public Cliente guardarEntidad(Cliente cliente) {
        return repository.save(cliente);
    }

    //r
    public List<Cliente> listarEntidad() {
        return repository.findAll();
    }

    //u
    public Cliente actualizarEntidad(Cliente cliente) {
        return repository.save(cliente);
    }

    //d
    public void eliminarEntidad(String dniruc) {
        repository.delete(repository.findById(dniruc).get());
    }

    //b
    public Cliente buscarEntidad(String dniruc) {
        return repository.findById(dniruc).get();
    }

    public List<ModeloDataAutocomplet> listAutoComplet(String dato) {
        List<ModeloDataAutocomplet> listarclientes = new ArrayList<>();
        try {
            for (Cliente cliente : repository.listAutoCompletCliente(dato + "%")) {
                ModeloDataAutocomplet data = new ModeloDataAutocomplet();
                ModeloDataAutocomplet.TIPE_DISPLAY = "ID";
                data.setIdx(cliente.getDniruc());
                data.setNombreDysplay(cliente.getNombre());
                data.setOtherData(cliente.getDocumento());
                listarclientes.add(data);
            }
        } catch (Exception e) {
            log.log(Level.SEVERE, "create", e);
        }
        return listarclientes;
    }
}
