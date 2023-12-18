package com.example.childlearningapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BanglaController extends SceneController{
    private Stage stage;
    private Scene scene;
    public void switchToShoroborno(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Shoroborno.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNumbers(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("numbersBangla.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToByanjonborno(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Byanjonborno.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToKobita(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Kobita1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToKobita2(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Kobita2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToKobita3(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Kobita3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToKobita4(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Kobita4.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToKobita5(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Kobita5.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToKobita6(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("Kobita6.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
