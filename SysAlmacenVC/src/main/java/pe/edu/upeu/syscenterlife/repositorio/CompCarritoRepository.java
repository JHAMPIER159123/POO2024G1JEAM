/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.syscenterlife.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.Modelo.CompCarrito;  // Asumiendo que la clase CompCarrito está en este paquete

@Repository
public interface CompCarritoRepository extends JpaRepository<CompCarrito, Long> {
    // Aquí puedes agregar métodos personalizados de consulta si es necesario
}