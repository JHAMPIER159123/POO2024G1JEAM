/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.syscenterlife.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.Modelo.Producto;  // Asumiendo que la clase Producto está en este paquete

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    @Query(value = "SELECT p.* FROM Producto p WHERE p.nombre like :filter", nativeQuery = true)
    List<Producto> listAutoCompletProducto(@Param("filter") String filter);
}
