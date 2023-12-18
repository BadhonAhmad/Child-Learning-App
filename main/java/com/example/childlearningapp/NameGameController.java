package com.example.childlearningapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class NameGameController extends SceneController{
    private Stage stage;
    private Scene scene;
    /****************************************Name Identifying Game*********************************************************************/
    public void switchToNameGame(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("NameGame.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        StartGame();
        stage.show();
    }
    @FXML
    private Label myLabel;
    @FXML
    private Button myButton;
    @FXML
    private TextField myTextField,NameGameScore;
    @FXML
    private ImageView img;
    int cnt=0;
    String name;
    static int right=0;
    public void StartGame(){
        loadImage();
    }
    public void submit(ActionEvent event){
        name=myTextField.getText();
        name.toLowerCase();
        if(cnt == 0){
            if(name.equals("bear")){
                right++;
                myLabel.setText("Perfect!");
                myLabel.setStyle("-fx-background-color: green;");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                myLabel.setText("Wrong!  Correct Name: bear");
                myLabel.setStyle("-fx-background-color: red;");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        }
        else if(cnt == 1){
            if(name.equals("lion")){
                right++;
                myLabel.setText("Excellent!");
                myLabel.setStyle("-fx-background-color: green;");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                myLabel.setText("Wrong!  Correct Name: lion");
                myLabel.setStyle("-fx-background-color: red;");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 2){
            if(name.equals("apple")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Nice!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: apple");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 3){
            if(name.equals("cat")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("You are absolutely correct!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: cat");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 4){
            if(name.equals("giraffe")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Good Job!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: giraffe");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 5){
            if(name.equals("banana")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Very Nice!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: banana");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 6){
            if(name.equals("orange")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Excellent!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));

            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: orange");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 7){
            if(name.equals("horse")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Perfect!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: horse");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 8){
            if(name.equals("jackfruit")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Wow!It's Amazing!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: jackfruit");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 9){
            if(name.equals("guava")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Awesome!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: guava");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 10){
            if(name.equals("mango")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Perfect!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: mango");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 11){
            if(name.equals("pineapple")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Very Nice!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: pineapple");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 12){
            if(name.equals("watermelon")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Perfect!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: watermelon");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 13){
            if(name.equals("monkey")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Excellent!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                 myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: monkey");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        } else if(cnt == 14){
            if(name.equals("tiger")){
                right++;
                myLabel.setStyle("-fx-background-color: green;");
                myLabel.setText("Good Job!");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
            else{
                myLabel.setStyle("-fx-background-color: red;");
                myLabel.setText("Wrong!  Correct Name: tiger");
                NameGameScore.setText(String.valueOf(right));
                NameGameScore.setFont(Font.font(22));
            }
        }
        cnt++;
    }
    public void NextImage(ActionEvent event){
        loadImage();
    }
    public void loadImage(){
        myTextField.clear();
        myLabel.setStyle("-fx-background-color: blue;");
        myLabel.setText("Write Your Answer In the Box,then Click Submit!");
        if(cnt == 0){
            Image myImg=new Image(getClass().getResourceAsStream("bear.png"));
            img.setImage(myImg);
        }else if(cnt == 1){
            Image myImg=new Image(getClass().getResourceAsStream("lion.png"));
            img.setImage(myImg);
        }
        else if(cnt == 2){
            Image myImg=new Image(getClass().getResourceAsStream("apple.png"));
            img.setImage(myImg);
        }
        else if(cnt == 3){
            Image myImg=new Image(getClass().getResourceAsStream("cat.png"));
            img.setImage(myImg);
        }
        else if(cnt == 4){
            Image myImg=new Image(getClass().getResourceAsStream("giraffe.png"));
            img.setImage(myImg);
        }
        else if(cnt == 5){
            Image myImg=new Image(getClass().getResourceAsStream("banana.png"));
            img.setImage(myImg);
        }
        else if(cnt == 6){
            Image myImg=new Image(getClass().getResourceAsStream("orange.png"));
            img.setImage(myImg);
        }
        else if(cnt == 7){
            Image myImg=new Image(getClass().getResourceAsStream("horse.png"));
            img.setImage(myImg);
        }
        else if(cnt == 8){
            Image myImg=new Image(getClass().getResourceAsStream("jackfruit.png"));
            img.setImage(myImg);
        }
        else if(cnt == 9){
            Image myImg=new Image(getClass().getResourceAsStream("guava.png"));
            img.setImage(myImg);
        }
        else if(cnt == 10){
            Image myImg=new Image(getClass().getResourceAsStream("mango.png"));
            img.setImage(myImg);
        }
        else if(cnt == 11){
            Image myImg=new Image(getClass().getResourceAsStream("pineapple.png"));
            img.setImage(myImg);
        }
        else if(cnt == 12){
            Image myImg=new Image(getClass().getResourceAsStream("watermelon.png"));
            img.setImage(myImg);
        }
        else if(cnt == 13){
            Image myImg=new Image(getClass().getResourceAsStream("monkey.png"));
            img.setImage(myImg);
        }
        else if(cnt == 14){
            Image myImg=new Image(getClass().getResourceAsStream("tiger.png"));
            img.setImage(myImg);
        }
        else if(cnt == 15){
            myLabel.setText("Congratulations! The Game Ends Here!");
        }
    }
    public void switchToDifferentNames(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("DifferentNames.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDays1(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("days1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToFruitsNames1(ActionEvent event) throws  IOException{
        Parent root=FXMLLoader.load(getClass().getResource("FruitsName1.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToFruitsNames2(ActionEvent event) throws  IOException{
        Parent root=FXMLLoader.load(getClass().getResource("FruitsName2.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAnimalsName1(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("AnimalsName1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAnimalsName2(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("AnimalsName2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAnimalsName3(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("AnimalsName3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAnimalsName4(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("AnimalsName4.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToWeek(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("week.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToMonth(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("months.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToSeason(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("seasons.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
