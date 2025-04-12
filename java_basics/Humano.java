package java_basics;

public class Humano extends SerVivo {

    public String nome;

    public Humano(){
        super(42);
        this.nome = "Fernanda";
    }

//    @Override
    public void respirar() {
        System.out.println("Respirando...");
    }
}
