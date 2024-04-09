package pe.edu.upeu.poo.encapsulamiento;

public class Loro implements Animal {
    
    @Override
    public void emitirSonido() {
        System.out.println("Hola manito...aprendé pues");
    }
    @Override
    public void dormir() {
        System.out.println("Zzz...Zzz....");
    }
    @Override
    public void habla(){
        System.out.println("los pollitos dicen pio pio pio");
    }
    
}
