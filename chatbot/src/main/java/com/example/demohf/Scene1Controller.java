package com.example.demohf;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene1Controller {
    @FXML
    private TextField usernameid;
    @FXML
    private PasswordField passwordid;
    @FXML
    protected void onLogin() throws IOException {
         //je doit savoir
        if (usernameid.getText().equals("admin") && passwordid.getText().equals("admin")){
            Stage s= (Stage) usernameid.getScene().getWindow();
            //recuperer la scene2
            //cahrger la vu
            FXMLLoader fx = new FXMLLoader(MinApp.class.getResource("Scene2.fxml"));
            Scene sc2 = new Scene(fx.load());
            //atacher la scene au stage
            s.setScene(sc2);

        }else{
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Authentification error");
            alert.setHeaderText("Username or Password not validated !");
            alert.setContentText("you can retry bu changing authentification information");
            alert.show();
        }



    }
}
