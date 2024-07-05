/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.syscenterlife.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.Modelo.Usuario;  // Asumiendo que la clase Usuario está en este paquete

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Aquí puedes agregar métodos personalizados de consulta si es necesario
    @Query(value = "SELECT u.* FROM Usuario u WHERE u.user=:dnix ",
             nativeQuery = true)
    Usuario buscarUsuario(@Param("dnix") String dnix);

    @Query(value = "SELECT u.* FROM Usuario u WHERE u.user=:user and u.clave=:clave", nativeQuery = true)
    Usuario loginUsuario(@Param("user") String user, @Param("clave") String clave);

}
