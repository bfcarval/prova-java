package br.com.confidencecambio.javabasico.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Cliente implements Worker {

    private String nome;

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String setNome(String nome) {
        return this.nome = nome;
    }
}
