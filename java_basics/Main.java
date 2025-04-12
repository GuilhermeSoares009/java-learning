package java_basics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        meuCarro2.acelerar();
        meuCarro2.acelerar();

        Humano meuSer = new Humano();
        meuSer.respirar();;

        Carro meuCarroFUrado = null;

        try {
            meuCarroFUrado.acelerar();
        } catch (NullPointerException exception) {
            System.out.println("vende carro furado");
        }

    }
}

