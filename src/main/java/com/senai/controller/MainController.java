package com.senai.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MainController {

    @FXML
    private Label label;

    @FXML
    protected void onBtnClick(){
        label.setText("Clicou!!!");
    }
}