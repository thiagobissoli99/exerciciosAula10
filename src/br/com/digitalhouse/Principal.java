package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        Pessoa thiago = new Pessoa("Thiago",123456);
        Pessoa Jair = new Pessoa("jair",123456);

        System.out.println(thiago.equals(Jair));

    }
}
