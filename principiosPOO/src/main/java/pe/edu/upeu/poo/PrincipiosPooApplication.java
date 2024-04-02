package pe.edu.upeu.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.poo.cobjeto.Persona;

@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipiosPooApplication.class, args);
                Persona person=new Persona();//aplicando objetos //para utilizar su atributos o acciones
                person.setNombre(" jeam");
                person.setEdad(21);
                person.edad=38;
                System.out.println(" yo soy"+person.getNombre()+" y tengo "+person.getEdad()+" años");
                person.saludo();
	}

}
