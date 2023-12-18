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
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;

public class EnglishController extends SceneController{
    private Stage stage;
    private Scene scene;
    public void switchToPoem1(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("poem1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPoem2(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("poem2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPoem3(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("poem3.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPoem4(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("poem4.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPoem5(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("poem5.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToPoem6(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("poem6.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAlphabets(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("engAlphabets.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNumbers(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("numbersEnglish.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToQuiz(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("quiz1.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        StartQuiz();
        stage.show();
    }
    @FXML
    public Label question;
    @FXML
    public Button opt1,opt2,opt3,opt4;
    int counter=0;
    static int correct=0;
    static int wrong=0;
    @FXML
    private void StartQuiz(){
        loadQuestions();
    }

    private void loadQuestions() {
        if(counter == 0){
            question.setText("1.Put it ______.");
            opt1.setText("down");
            opt2.setText("and");
            opt3.setText("did");
            opt4.setText("for");
        }
        else if(counter == 1){
            question.setText("2.He will ______.");
            opt1.setText("am");
            opt2.setText("come");
            opt3.setText("this");
            opt4.setText("are");
        }
        else if(counter == 2){
            question.setText("3.I ____  jump.");
            opt1.setText("have");
            opt2.setText("am");
            opt3.setText("eat");
            opt4.setText("can");
        }
        else if(counter == 3){
            question.setText("4.I ____  going.");
            opt1.setText("have");
            opt2.setText("am");
            opt3.setText("eat");
            opt4.setText("do");
        }
        else if(counter == 4){
            question.setText("5.The sky is _____.");
            opt1.setText("but");
            opt2.setText("he");
            opt3.setText("blue");
            opt4.setText("me");
        }
        else if(counter == 5){
            question.setText("6.Try to ____ it.");
            opt1.setText("and");
            opt2.setText("find");
            opt3.setText("or");
            opt4.setText("am");
        }
        else if(counter == 6){
            question.setText("7.It is ____ free.");
            opt1.setText("am");
            opt2.setText("for");
            opt3.setText("she");
            opt4.setText("did");
        }
        else if(counter == 7){
            question.setText("8.It is ______");
            opt1.setText("let");
            opt2.setText("ask");
            opt3.setText("then");
            opt4.setText("funny");
        }
        else if(counter == 8){
            question.setText("9.I have______eyes");
            opt1.setText("two");
            opt2.setText("yes");
            opt3.setText("will");
            opt4.setText("at");
        }
        else if(counter == 9){
            question.setText("10.Please______away");
            opt1.setText("pen");
            opt2.setText("been");
            opt3.setText("go");
            opt4.setText("our");
        }
        else if(counter == 10){
            question.setText("11.Please______it");
            opt1.setText("pen");
            opt2.setText("do");
            opt3.setText("go");
            opt4.setText("our");
        }
        else if(counter == 11){
            question.setText("12.Can I______?");
            opt1.setText("the");
            opt2.setText("help");
            opt3.setText("book");
            opt4.setText("may");
        }
        else if(counter == 12){
            question.setText("13.I am right ______.");
            opt1.setText("here");
            opt2.setText("done");
            opt3.setText("was");
            opt4.setText("did");
        }
        else if(counter == 13){
            question.setText("14.____ can drink.");
            opt1.setText("it");
            opt2.setText("if");
            opt3.setText("like");
            opt4.setText("I");
        }
        else if(counter == 14){
            question.setText("15.I am____ house.");
            opt1.setText("in");
            opt2.setText("my");
            opt3.setText("the");
            opt4.setText("is");
        }
        else if(counter == 15){
            question.setText("16.He ____ my friend.");
            opt1.setText("is");
            opt2.setText("are");
            opt3.setText("mine");
            opt4.setText("am");
        }else if(counter == 16){
            question.setText("17.____ is new.");
            opt1.setText("not");
            opt2.setText("or");
            opt3.setText("It");
            opt4.setText("on");
        }else if(counter == 17){
            question.setText("18.I can____.");
            opt1.setText("write");
            opt2.setText("are");
            opt3.setText("It");
            opt4.setText("me");
        }else if(counter == 18){
            question.setText("19.I am a _____ busy.");
            opt1.setText("one");
            opt2.setText("my");
            opt3.setText("your");
            opt4.setText("little");
        }else if(counter == 19){
            question.setText("20.____ at that.");
            opt1.setText("yes");
            opt2.setText("one");
            opt3.setText("away");
            opt4.setText("Look");
        }
    }
    @FXML
    public void opt1clicked(ActionEvent event){
        checkAnswer(opt1.getText().toString());
        if(checkAnswer(opt1.getText().toString())){
            correct++;
            opt1.setStyle("-fx-background-color: green;");
        }else {
            wrong++;
            opt1.setStyle("-fx-background-color: red;");
        }
        if(counter == 19){

            res.setStyle("-fx-background-color: green;");
            showResult.setText("Quiz Ends! Click Result");

        }else{
            counter++;
        }
    }
    @FXML
    public void opt2clicked(ActionEvent event){
        checkAnswer(opt2.getText().toString());
        if(checkAnswer(opt2.getText().toString())){
            correct++;
            opt2.setStyle("-fx-background-color: green;");
        }else {
            wrong++;
            opt2.setStyle("-fx-background-color: red;");
        }
        if(counter == 19){
            res.setStyle("-fx-background-color: green;");
            showResult.setText("Quiz Ends! Click Result");

        }else{
            counter++;
        }
    }
    public void NextQuestion(ActionEvent event) throws  IOException{
        loadQuestions();
        opt1.setStyle("-fx-background-color: indigo;");
        opt2.setStyle("-fx-background-color: indigo;");
        opt3.setStyle("-fx-background-color: indigo;");
        opt4.setStyle("-fx-background-color: indigo;");
    }
    @FXML
    public void opt3clicked(ActionEvent event){
        checkAnswer(opt3.getText().toString());
        if(checkAnswer(opt3.getText().toString())){
            correct++;
            opt3.setStyle("-fx-background-color: green;");
        }else {
            wrong++;
            opt3.setStyle("-fx-background-color: red;");
        }
        if(counter == 19){
            res.setStyle("-fx-background-color: green;");
            showResult.setText("Quiz Ends! Click Result");

        }else{
            counter++;
        }
    }
    @FXML
    public void opt4clicked(ActionEvent event){
        checkAnswer(opt4.getText().toString());
        if(checkAnswer(opt4.getText().toString())){
            correct++;
            opt4.setStyle("-fx-background-color: green;");

        }else {
            wrong++;
            opt4.setStyle("-fx-background-color: red;");
        }
        if(counter == 19){
            res.setStyle("-fx-background-color: green;");
            showResult.setText("Quiz Ends! Click Result");
        }else{
            counter++;
        }
    }
    boolean checkAnswer(String answer ) {
        if(counter == 0){
            if(answer.equals("down")){
                return true;
            }
            else {
                opt1.setStyle("-fx-background-color: green;");
                return false;
            }
        } else if (counter == 1) {
            if(answer.equals("come")){
                return true;
            }
            else{
                opt2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 2) {
            if(answer.equals("can")){
                return true;
            }
            else{
                opt4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 3) {
            if(answer.equals("am")){
                return true;
            }
            else{
                opt2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 4) {
            if(answer.equals("blue")){
                return true;
            }
            else{
                opt3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 5) {
            if(answer.equals("find")){
                return true;
            }
            else{
                opt2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 6) {
            if(answer.equals("for")){
                return true;
            }
            else{
                opt2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 7) {
            if(answer.equals("funny")){
                return true;
            }
            else{
                opt4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 8) {
            if(answer.equals("two")){
                return true;
            }
            else{
                opt1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 9) {
            if(answer.equals("go")){
                return true;
            }
            else{
                opt3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 10) {
            if(answer.equals("do")){
                return true;
            }
            else{
                opt2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 11) {
            if(answer.equals("help")){
                return true;
            }
            else{
                opt2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 12) {
            if(answer.equals("here")){
                return true;
            }
            else{
                opt1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 13) {
            if(answer.equals("I")){
                return true;
            }
            else{
                opt4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 14) {
            if(answer.equals("in")){
                return true;
            }
            else{
                opt1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 15) {
            if(answer.equals("is")){
                return true;
            }
            else{
                opt1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 16) {
            if(answer.equals("It")){
                return true;
            }
            else{
                opt3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 17) {
            if(answer.equals("write")){
                return true;
            }
            else{
                opt1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 18) {
            if(answer.equals("little")){
                return true;
            }
            else{
                opt4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter == 19) {
            if(answer.equals("Look")){
                return true;
            }
            else{
                opt4.setStyle("-fx-background-color: green;");
                return false;
            }
        }
        return false;
    }

    public void ShowRes(ActionEvent event){
        scr.setText(Integer.toString(correct));
        scr.setFont(Font.font(20));
        cans.setText(Integer.toString(correct));
        cans.setFont(Font.font(20));
        ians.setText(Integer.toString(wrong));
        ians.setFont(Font.font(20));
    }

    @FXML
    public Label showResult;
    @FXML
    TextField scr,cans,ians;

    @FXML
    Button res;

    public void ShowResult(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("result.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /*********************************************Quiz Alphabets*****************************************************************************/
    public void switchToQuiz2(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("quiz2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        StartQuiz2();
        stage.show();
    }

    @FXML
    public Label question2;
    @FXML
    public Button opt21,opt22,opt23,opt24;
    int counter2=0;
    static int correct2=0;
    static int wrong2=0;
    @FXML
    private void StartQuiz2(){
        loadQuestions2();
    }
    public void NextQuestion2(ActionEvent event) throws  IOException{
        loadQuestions2();
        opt21.setStyle("-fx-background-color: indigo;");
        opt22.setStyle("-fx-background-color: indigo;");
        opt23.setStyle("-fx-background-color: indigo;");
        opt24.setStyle("-fx-background-color: indigo;");
    }
    private void loadQuestions2() {
        if(counter2 == 0){
            question2.setText("1.A-");
            opt21.setText("q");
            opt22.setText("e");
            opt23.setText("a");
            opt24.setText("o");
        }
        else if(counter2 == 1){
            question2.setText("2.Q-");
            opt21.setText("p");
            opt22.setText("c");
            opt23.setText("f");
            opt24.setText("q");
        }
        else if(counter2 == 2){
            question2.setText("3.B-");
            opt21.setText("p");
            opt22.setText("a");
            opt23.setText("t");
            opt24.setText("b");
        }
        else if(counter2 == 3){
            question2.setText("4.f-");
            opt21.setText("g");
            opt22.setText("F");
            opt23.setText("h");
            opt24.setText("D");
        }
        else if(counter2 == 4){
            question2.setText("5.J");
            opt21.setText("j");
            opt22.setText("g");
            opt23.setText("i");
            opt24.setText("w");
        }
        else if(counter2 == 5){
            question2.setText("6.M-");
            opt21.setText("n");
            opt22.setText("m");
            opt23.setText("r");
            opt24.setText("x");
        }
        else if(counter2 == 6){
            question2.setText("7.E");
            opt21.setText("p");
            opt22.setText("u");
            opt23.setText("s");
            opt24.setText("e");
        }
        else if(counter2 == 7){
            question2.setText("8.r-");
            opt21.setText("L");
            opt22.setText("Y");
            opt23.setText("R");
            opt24.setText("B");
        }
        else if(counter2 == 8){
            question2.setText("9.T");
            opt21.setText("w");
            opt22.setText("y");
            opt23.setText("l");
            opt24.setText("t");
        }
        else if(counter2 == 9){
            question2.setText("10.H");
            opt21.setText("p");
            opt22.setText("n");
            opt23.setText("g");
            opt24.setText("h");
        }
        else if(counter2 == 10){
            question2.setText("11.G");
            opt21.setText("p");
            opt22.setText("d");
            opt23.setText("g");
            opt24.setText("r");
        }
        else if(counter2 == 11){
            question2.setText("12.D-");
            opt21.setText("h");
            opt22.setText("d");
            opt23.setText("b");
            opt24.setText("y");
        }
    }
    @FXML
    public void opt21clicked(ActionEvent event){
        checkAnswer2(opt21.getText().toString());
        if(checkAnswer2(opt21.getText().toString())){
            correct2++;
            opt21.setStyle("-fx-background-color: green;");
        }else {
            wrong2++;
            opt21.setStyle("-fx-background-color: red;");
        }
        if(counter2 == 11){

            res2.setStyle("-fx-background-color: green;");
            showResult2.setText("Quiz Ends! Click Result");

        }else{
            counter2++;
        }
    }
    @FXML
    public void opt22clicked(ActionEvent event){
        checkAnswer2(opt22.getText().toString());
        if(checkAnswer2(opt22.getText().toString())){
            correct2++;
            opt22.setStyle("-fx-background-color: green;");
        }else {
            wrong2++;
            opt22.setStyle("-fx-background-color: red;");
        }
        if(counter2 == 11){
            res2.setStyle("-fx-background-color: green;");
            showResult2.setText("Quiz Ends! Click Result");

        }else{
            counter2++;
        }
    }
    @FXML
    public void opt23clicked(ActionEvent event){
        checkAnswer2(opt23.getText().toString());
        if(checkAnswer2(opt23.getText().toString())){
            correct2++;
            opt23.setStyle("-fx-background-color: green;");
        }else {
            wrong2++;
            opt23.setStyle("-fx-background-color: red;");
        }
        if(counter2 == 11){
            res2.setStyle("-fx-background-color: green;");
            showResult2.setText("Quiz Ends! Click Result");
        }else{
            counter2++;
        }
    }
    @FXML
    public void opt24clicked(ActionEvent event){
        checkAnswer2(opt24.getText().toString());
        if(checkAnswer2(opt24.getText().toString())){
            correct2++;
            opt24.setStyle("-fx-background-color: green;");

        }else {
            wrong2++;
            opt24.setStyle("-fx-background-color: red;");
        }
        if(counter2 == 11){
            res2.setStyle("-fx-background-color: green;");
            showResult2.setText("Quiz Ends! Click Result");
        }else{
            counter2++;
        }
    }
    boolean checkAnswer2(String answer ) {
        if(counter2 == 0){
            if(answer.equals("a")){
                return true;
            }
            else {
                opt23.setStyle("-fx-background-color: green;");
                return false;
            }
        } else if (counter2 == 1) {
            if(answer.equals("q")){
                return true;
            }
            else{
                opt24.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 2) {
            if(answer.equals("b")){
                return true;
            }
            else{
                opt24.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 3) {
            if(answer.equals("F")){
                return true;
            }
            else{
                opt22.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 4) {
            if(answer.equals("j")){
                return true;
            }
            else{
                opt21.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 5) {
            if(answer.equals("m")){
                return true;
            }
            else{
                opt22.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 6) {
            if(answer.equals("e")){
                return true;
            }
            else{
                opt24.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 7) {
            if(answer.equals("R")){
                return true;
            }
            else{
                opt23.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 8) {
            if(answer.equals("t")){
                return true;
            }
            else{
                opt24.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 9) {
            if(answer.equals("h")){
                return true;
            }
            else{
                opt24.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 10) {
            if(answer.equals("g")){
                return true;
            }
            else{
                opt23.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counter2 == 11) {
            if(answer.equals("d")){
                return true;
            }
            else{
                opt22.setStyle("-fx-background-color: green;");
                return false;
            }
        }
        return false;
    }

    public void ShowRes2(ActionEvent event){
        scr2.setText(Integer.toString(correct2));
        scr2.setFont(Font.font(20));
        cans2.setText(Integer.toString(correct2));
        cans2.setFont(Font.font(20));
        ians2.setText(Integer.toString(wrong2));
        ians2.setFont(Font.font(20));
    }

    @FXML
    public Label showResult2;
    @FXML
    TextField scr2,cans2,ians2;

    @FXML
    Button res2;

    public void ShowResult2(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("result2.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
