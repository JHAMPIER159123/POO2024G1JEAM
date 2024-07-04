package pe.edu.upeu.syscenterlife.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.syscenterlife.Modelo.Cliente;
import pe.edu.upeu.syscenterlife.repositorio.ClienteRepository;

@Service
public class ClienteService {
    
    @Autowired
    ClienteRepository repository;
    
    //c
    public Cliente guardarEntidad(Cliente cliente){
    return repository.save(cliente);    
    }
    //r
    public List<Cliente> listarEntidad(){
    return repository.findAll();
    }
    //u
    public Cliente actualizarEntidad(Cliente cliente){
    return repository.save(cliente);
    }
    //d
    public void eliminarEntidad(String dniruc){
        repository.delete(repository.findById(dniruc).get());
    }
    //b
    public Cliente buscarEntidad(String dniruc){
    return repository.findById(dniruc).get();
    }

    public Cliente buscarCliente(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteRegistEntdad(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean saveEntidad(Cliente to) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Cliente updateEntidad(Cliente to) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
