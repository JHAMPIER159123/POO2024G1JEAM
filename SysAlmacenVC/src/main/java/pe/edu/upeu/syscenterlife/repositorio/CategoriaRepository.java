
package pe.edu.upeu.syscenterlife.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.syscenterlife.Modelo.Categoria;  // Asumiendo que la clase Categoria está en este paquete

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    // Aquí puedes agregar métodos personalizados de consulta si es necesario
}
