package pe.edu.upeu.poo.claseinterna;

public class Mama {
    String alimento = "nutrientes";
    
    public void alimentar(){
        System.out.println("Alimentando dando "+alimento);
    }
    
    class Bebe {
        double peso=1;
        public void moverse(){
            System.out.println("Da pataditas..");
        }
    }
}
