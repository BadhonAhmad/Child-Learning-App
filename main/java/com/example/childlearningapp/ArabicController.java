package com.example.childlearningapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ArabicController extends SceneController{
    private Stage stage;
    private Scene scene;
    public void switchToArabicAlphabets(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("ArabicAlphabets.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSurahFatiha(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahFatiha.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToSurahKuraish(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahKuraish.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToSurahKawsar(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahKawsar.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToSurahNas(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahNas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToSurahIkhlas(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahIkhlas.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToSurahNasor(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahNasor.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToSurahFil(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("SurahFil.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHadith1(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("hadith1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHadith2(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("hadith2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHadith3(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("hadith3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHadith4(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("hadith4.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToDua1(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("dua1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToDua2(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("dua2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToDua3(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("dua3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }public void switchToDua4(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("dua4.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
