public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca");

        Carro meuCarro1 = new Carro("Sandero");

        Carro meuCarro2 = new Carro("BMW");

        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();

    }
}

class Carro {
    String modelo;

    public Carro(String modelo)
    {
        this.modelo = modelo;
    }

    public void acelerar()
    {
        System.out.println("Acelerando o carro" + this.modelo);
    }

}
