package com.senai.model;

import javax.swing.*;

public class Animal {

    //Atributos
    String nome;
    int idade;

    public Animal() {}

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //Metodos
    void emitirSom(){

    };

    public String toString(){
        return "Nome: " + nome + " Idade: " + idade + " (" + getClass().getSimpleName() + ")";
    }


}
