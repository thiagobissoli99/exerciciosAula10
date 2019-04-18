package br.com.digitalhouse;

import java.util.Objects;

public class Pessoa {

    private String nome;
    private Integer RG;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer RG) {
        this.nome = nome;
        this.RG = RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRG() {
        return RG;
    }

    public void setRG(Integer RG) {
        this.RG = RG;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(RG, pessoa.RG);
    }

}
