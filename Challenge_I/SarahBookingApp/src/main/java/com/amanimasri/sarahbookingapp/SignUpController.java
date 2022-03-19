package com.amanimasri.sarahbookingapp;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SignUpController {

    @FXML
    private TextField first_name;

    @FXML
    private TextField last_name;

    @FXML
    private TextField username;

    @FXML
    private TextField email;


    @FXML
    private PasswordField password;


    @FXML
    private PasswordField confirm_password;

    @FXML
    private ComboBox<?> gender;



    @FXML
    private TextField phone_number;



    @FXML
    void signup(MouseEvent event) {

    }

}
