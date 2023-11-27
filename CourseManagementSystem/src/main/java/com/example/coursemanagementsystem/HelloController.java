package com.example.coursemanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private TextField e_mail;
    @FXML
    private TextField password;

    @FXML
    protected void onClickSignIn() {
        e_mail.getText();
        password.getText();

    }
}