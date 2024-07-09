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
import pe.edu.upeu.syscenterlife.Modelo.VentCarrito;  // Asumiendo que la clase VentCarrito está en este paquete

@Repository
public interface VentCarritoRepository extends JpaRepository<VentCarrito, Long> {

    @Query(value = "SELECT c.* FROM vent_carrito c WHERE c.dniruc=:dniruc", nativeQuery = true)
    List<VentCarrito> listaCarritoCliente(@Param("dniruc") String dniruc);

    void deleteByDniruc(/*@Param("dniruc")*/String dniruc);

}
