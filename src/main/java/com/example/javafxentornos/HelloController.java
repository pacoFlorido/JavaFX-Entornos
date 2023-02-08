package com.example.javafxentornos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola Entornos! Paco Florido Quesada");
    }

    public void onByeButtonClick() { welcomeText.setText(""); }
}