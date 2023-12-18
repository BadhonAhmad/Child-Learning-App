package com.example.childlearningapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("first.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Image icon=new Image("C:\\Users\\Nobel\\IdeaProjects\\ChildLearningApp\\src\\main\\resources\\com\\example\\childlearningapp\\front.jpg");
        stage.getIcons().add(icon);
        stage.setTitle("Child Learning App");
        stage.show();
        stage.setResizable(false);
        stage.setFullScreen(false);
    }
    public static void main(String[] args) {
        launch();
    }

}