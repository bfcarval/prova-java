package br.com.confidencecambio.javabasico.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Robo implements Worker {

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
