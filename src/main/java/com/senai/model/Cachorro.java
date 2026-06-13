package com.senai.model;

public class Cachorro extends Animal {

    public  Cachorro (String nome, int idade){
        super(nome, idade);
        this.arquivoSom = "com/senai/resources/sons/cachorro.mp3";
    }



}
