package com.senai.controller;

import com.senai.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ZoologicoControlloer {

    @FXML
    ComboBox<String> cmbTipo;

    @FXML
    TextField txtNome;

    @FXML
    TextField txtIdade;

    @FXML
    ListView<Animal> lstAnimais;

    @FXML
    TextArea txtSaida;

    @FXML
    ObservableList<Animal>  animais = FXCollections.observableArrayList();

    @FXML
    void initialize(){
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("Cachorro");
        tipos.add("Gato");
        tipos.add("Vaca");
        tipos.add("Macaco");
        cmbTipo.setItems(FXCollections.observableArrayList(tipos));

        cmbTipo.getSelectionModel().selectFirst();
        lstAnimais.setItems(animais);
    }

    public void onAdicionar() {
        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        Cachorro cachorro = new Cachorro(nome, idade);
        Gato gato = new Gato(nome, idade);
        Vaca vaca = new Vaca(nome, idade);
        Macaco macaco = new Macaco(nome, idade);

        if (cmbTipo.getValue().equals("Cachorro")){
            animais.add(cachorro);
        } else if (cmbTipo.getValue().equals("Gato")) {
            animais.add(gato);
        }else if (cmbTipo.getValue().equals("Vaca")) {
            animais.add(vaca);
        }else if (cmbTipo.getValue().equals("Macaco")) {
            animais.add(macaco);
        }

    }

    public void onEmitirSom() {

    }
}
