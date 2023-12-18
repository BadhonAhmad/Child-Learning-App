package com.example.childlearningapp;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
public class SceneController {
    private Stage stage;
    private Scene scene;

    public void switchToFirst(ActionEvent event) throws  IOException{
        Parent root=FXMLLoader.load(getClass().getResource("first.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void exitApp(ActionEvent event) throws  IOException{
        Parent root=FXMLLoader.load(getClass().getResource("first.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.close();
    }
    public void aboutApp(ActionEvent event) throws  IOException{
        Parent root=FXMLLoader.load(getClass().getResource("about.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToLangChoose(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("langChoose.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToBanglaLang(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("banglaLang.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToEnglish(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("englishLang.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToNameChoose(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("DifferentNames.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**************************************Mathematics Quiz************************************************************************************/
    public void switchToQuizmath(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("mathquiz.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        StartQuizmath();
        stage.show();
    }
    @FXML
    public Label questionmath;
    @FXML
    public Button optmath1,optmath2,optmath3,optmath4;
    int countermath=0;
    static int correctmath=0;
    static int wrongmath=0;
    @FXML
    private void StartQuizmath(){
        loadQuestionsmath();
    }
    private void loadQuestionsmath() {
        if(countermath == 0){
            questionmath.setText("1.Which one is greater?10 or 7");
            optmath1.setText("10");
            optmath2.setText("7");
            optmath3.setText("none");
            optmath4.setText("8");
        }
        else if(countermath == 1){
            questionmath.setText("2.12 + 89 = ?");
            optmath1.setText("100");
            optmath2.setText("101");
            optmath3.setText("110");
            optmath4.setText("1289");
        }
        else if(countermath == 2){
            questionmath.setText("3. 109 - 28 = ?");
            optmath1.setText("91");
            optmath2.setText("80");
            optmath3.setText("81");
            optmath4.setText("88");
        }
        else if(countermath == 3){
            questionmath.setText("4. 9 * 8 = ?");
            optmath1.setText("72");
            optmath2.setText("17");
            optmath3.setText("81");
            optmath4.setText("90");
        }
        else if(countermath == 4){
            questionmath.setText("5.Which number means we have nothing?");
            optmath1.setText("1");
            optmath2.setText("10");
            optmath3.setText("0");
            optmath4.setText("100");
        }
        else if(countermath == 5){
            questionmath.setText("6.How many sides does a triangle have?");
            optmath1.setText("2");
            optmath2.setText("3");
            optmath3.setText("4");
            optmath4.setText("5");
        }
        else if(countermath == 6){
            questionmath.setText("7.Which number comes after 9?");
            optmath1.setText("8");
            optmath2.setText("9");
            optmath3.setText("10");
            optmath4.setText("12");
        }
        else if(countermath == 7){
            questionmath.setText("8.How many sides does a square have?");
            optmath1.setText("2");
            optmath2.setText("3");
            optmath3.setText("4");
            optmath4.setText("5");
        }
        else if(countermath == 8){
            questionmath.setText("9.How many days are there in a week?");
            optmath1.setText("seven");
            optmath2.setText("six");
            optmath3.setText("eight");
            optmath4.setText("four");
        }
        else if(countermath == 9){
            questionmath.setText("10.Which number is an odd number?");
            optmath1.setText("10");
            optmath2.setText("11");
            optmath3.setText("12");
            optmath4.setText("14");
        }
        else if(countermath == 10){
            questionmath.setText("11.What is the square root of 16?");
            optmath1.setText("5");
            optmath2.setText("3");
            optmath3.setText("2");
            optmath4.setText("4");
        }
        else if(countermath == 11){
            questionmath.setText("12.What is the next number in the sequence: 2, 4, 6, 8, ___?");
            optmath1.setText("9");
            optmath2.setText("10");
            optmath3.setText("12");
            optmath4.setText("14");
        }
        else if(countermath == 12){
            questionmath.setText("13.Which number is divisible by 2?");
            optmath1.setText("19");
            optmath2.setText("12");
            optmath3.setText("9");
            optmath4.setText("21");
        }
        else if(countermath == 13){
            questionmath.setText("14.How many centimeters are in a meter?");
            optmath1.setText("10");
            optmath2.setText("100");
            optmath3.setText("1000");
            optmath4.setText("200");
        }
        else if(countermath == 14){
            questionmath.setText("15.What is the value of 3² - 4 x 2?");
            optmath1.setText("1");
            optmath2.setText("2");
            optmath3.setText("3");
            optmath4.setText("4");
        }
        else if(countermath == 15){
            questionmath.setText("16.A rectangle's length=8,width=5,what is its perimeter?");
            optmath1.setText("10");
            optmath2.setText("16");
            optmath3.setText("26");
            optmath4.setText("36");
        }else if(countermath == 16){
            questionmath.setText("17.Solve the equation: 2x + 5 = 13");
            optmath1.setText("x=3");
            optmath2.setText("x=4");
            optmath3.setText("x=6");
            optmath4.setText("x=8");
        }else if(countermath == 17){
            questionmath.setText("18.What is the area of a triangle with base of 6,height of 8?");
            optmath1.setText("12");
            optmath2.setText("24");
            optmath3.setText("30");
            optmath4.setText("48");
        }else if(countermath == 18){
            questionmath.setText("19.What is the value of 2³ + 4² - 5 x 3?");
            optmath1.setText("5");
            optmath2.setText("9");
            optmath3.setText("15");
            optmath4.setText("20");
        }else if(countermath == 19){
            questionmath.setText("20.Find the median of the following set of numbers:2,4,6,8,10");
            optmath1.setText("4");
            optmath2.setText("6");
            optmath3.setText("8");
            optmath4.setText("10");
        }
    }
    @FXML
    public void optmath1clicked(ActionEvent event){
        checkAnswermath(optmath1.getText().toString());
        if(checkAnswermath(optmath1.getText().toString())){
            correctmath++;
            optmath1.setStyle("-fx-background-color: green;");
        }else {
            wrongmath++;
            optmath1.setStyle("-fx-background-color: red;");
        }
        if(countermath == 19){
            resmath.setStyle("-fx-background-color: green;");
            showResultmath.setText("Quiz Ends! Click Result");

        }else{
            countermath++;
        }
    }
    @FXML
    public void optmath2clicked(ActionEvent event){
        checkAnswermath(optmath2.getText().toString());
        if(checkAnswermath(optmath2.getText().toString())){
            correctmath++;
            optmath2.setStyle("-fx-background-color: green;");
        }else {
            wrongmath++;
            optmath2.setStyle("-fx-background-color: red;");
        }
        if(countermath == 19){
            resmath.setStyle("-fx-background-color: green;");
            showResultmath.setText("Quiz Ends! Click Result");
        }else{
            countermath++;
        }
    }
    public void NextQuestionmath(ActionEvent event) throws  IOException{
        loadQuestionsmath();
        optmath1.setStyle("-fx-background-color: indigo;");
        optmath2.setStyle("-fx-background-color: indigo;");
        optmath3.setStyle("-fx-background-color: indigo;");
        optmath4.setStyle("-fx-background-color: indigo;");
    }
    @FXML
    public void optmath3clicked(ActionEvent event){
        checkAnswermath(optmath3.getText().toString());
        if(checkAnswermath(optmath3.getText().toString())){
            correctmath++;
            optmath3.setStyle("-fx-background-color: green;");
        }else {
            wrongmath++;
            optmath3.setStyle("-fx-background-color: red;");
        }
        if(countermath == 19){
            resmath.setStyle("-fx-background-color: green;");
            showResultmath.setText("Quiz Ends! Click Result");
        }else{
            countermath++;
        }
    }
    @FXML
    public void optmath4clicked(ActionEvent event){
        checkAnswermath(optmath4.getText().toString());
        if(checkAnswermath(optmath4.getText().toString())){
            correctmath++;
            optmath4.setStyle("-fx-background-color: green;");

        }else {
            wrongmath++;
            optmath4.setStyle("-fx-background-color: red;");
        }
        if(countermath == 19){
            resmath.setStyle("-fx-background-color: green;");
            showResultmath.setText("Quiz Ends! Click Result");
        }else{
            countermath++;
        }
    }
    boolean checkAnswermath(String answer ) {
        if(countermath == 0){
            if(answer.equals("10")){
                return true;
            }
            else {
                optmath1.setStyle("-fx-background-color: green;");
                return false;
            }
        } else if (countermath == 1) {
            if(answer.equals("101")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 2) {
            if(answer.equals("81")){
                return true;
            }
            else{
                optmath3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 3) {
            if(answer.equals("72")){
                return true;
            }
            else{
                optmath1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 4) {
            if(answer.equals("0")){
                return true;
            }
            else{
                optmath3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 5) {
            if(answer.equals("3")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 6) {
            if(answer.equals("10")){
                return true;
            }
            else{
                optmath3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 7) {
            if(answer.equals("4")){
                return true;
            }
            else{
                optmath3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 8) {
            if(answer.equals("seven")){
                return true;
            }
            else{
                optmath1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 9) {
            if(answer.equals("11")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 10) {
            if(answer.equals("4")){
                return true;
            }
            else{
                optmath4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 11) {
            if(answer.equals("10")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 12) {
            if(answer.equals("12")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 13) {
            if(answer.equals("100")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 14) {
            if(answer.equals("1")){
                return true;
            }
            else{
                optmath1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 15) {
            if(answer.equals("26")){
                return true;
            }
            else{
                optmath3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 16) {
            if(answer.equals("x=4")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 17) {
            if(answer.equals("24")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 18) {
            if(answer.equals("9")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (countermath == 19) {
            if(answer.equals("6")){
                return true;
            }
            else{
                optmath2.setStyle("-fx-background-color: green;");
                return false;
            }
        }
        return false;
    }
    public void ShowResmath(ActionEvent event){
        scrmath.setText(Integer.toString(correctmath));
        scrmath.setFont(Font.font(20));
        cansmath.setText(Integer.toString(correctmath));
        cansmath.setFont(Font.font(20));
        iansmath.setText(Integer.toString(wrongmath));
        iansmath.setFont(Font.font(20));
    }
    @FXML
    public Label showResultmath;
    @FXML
    TextField scrmath,cansmath,iansmath;

    @FXML
    Button resmath;

    public void ShowResultmath(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("mathquizresult.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /******************************************************IQ Test****************************************************/
    public void switchToQuiziq(ActionEvent event) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("quiziq.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        StartQuiziq();
        stage.show();
    }
    @FXML
    public Label questioniq;
    @FXML
    public Button optiq1,optiq2,optiq3,optiq4;
    @FXML
    public Label showResultiq;
    @FXML
    TextField scriq,cansiq,iansiq;

    @FXML
    Button resiq;
    int counteriq=0;
    static int correctiq=0;
    static int wrongiq=0;
    @FXML
    private void StartQuiziq(){
        loadQuestionsiq();
    }

    private void loadQuestionsiq() {

        if(counteriq == 0){
            questioniq.setText("1.Which shape is different from the others?");
            optiq1.setText("Circle");
            optiq2.setText("Square");
            optiq3.setText("Triangle");
            optiq4.setText("Rectangle");
        }
        else if(counteriq == 1){
            questioniq.setText("2.Which word is the odd one out?");
            optiq1.setText("Cat");
            optiq2.setText("Dog");
            optiq3.setText("Elephant");
            optiq4.setText("Fish");
        }
        else if(counteriq == 2){
            questioniq.setText("3.What comes next in the series?A,B,C,D,?");
            optiq1.setText("E");
            optiq2.setText("F");
            optiq3.setText("G");
            optiq4.setText("H");
        }
        else if(counteriq == 3){
            questioniq.setText("4.What is the opposite of \"happy\"?");
            optiq1.setText("Sad");
            optiq2.setText("Angry");
            optiq3.setText("Excited");
            optiq4.setText("Tired");
        }
        else if(counteriq == 4){
            questioniq.setText("5.Which animal lives in water?");
            optiq1.setText("Lion");
            optiq2.setText("Monkey");
            optiq3.setText("Fish");
            optiq4.setText("Elephant");
        }
        else if(counteriq == 5){
            questioniq.setText("6.What is the color of an orange?");
            optiq1.setText("Green");
            optiq2.setText("Blue");
            optiq3.setText("Red");
            optiq4.setText("Orange");
        }
        else if(counteriq == 6){
            questioniq.setText("7.How many legs does a dog have?");
            optiq1.setText("2");
            optiq2.setText("4");
            optiq3.setText("6");
            optiq4.setText("3");
        }
        else if(counteriq == 7){
            questioniq.setText("8.Which direction is opposite to \"up\"?");
            optiq1.setText("Down");
            optiq2.setText("Left");
            optiq3.setText("Right");
            optiq4.setText("Front");
        }
        else if(counteriq == 8){
            questioniq.setText("9.How many months are in a year?");
            optiq1.setText("6");
            optiq2.setText("9");
            optiq3.setText("12");
            optiq4.setText("15");
        }
        else if(counteriq == 9){
            questioniq.setText("10.What is the capital city of Bangladesh?");
            optiq1.setText("Cumilla");
            optiq2.setText("Rajshahi");
            optiq3.setText("Sylhet");
            optiq4.setText("Dhaka");
        }
        else if(counteriq == 10){
            questioniq.setText("11.Which animal is known for its long neck?");
            optiq1.setText("Lion");
            optiq2.setText("Giraffe");
            optiq3.setText("Elephant");
            optiq4.setText("Monkey");
        }
        else if(counteriq == 11){
            questioniq.setText("12.What is the opposite of \"big\"?");
            optiq1.setText("Small");
            optiq2.setText("Tall");
            optiq3.setText("Fast");
            optiq4.setText("Heavy");
        }
        else if(counteriq == 12){
            questioniq.setText("13.How many fingers does a human have in a hand?");
            optiq1.setText("4");
            optiq2.setText("5");
            optiq3.setText("6");
            optiq4.setText("10");
        }
        else if(counteriq == 13){
            questioniq.setText("14.Which is the tallest mountain in the world?");
            optiq1.setText("Mount Everest");
            optiq2.setText("Kilimanjaro");
            optiq3.setText("Mount Fuji");
            optiq4.setText("Mount McKinley");
        }
        else if(counteriq == 14){
            questioniq.setText("15.How many legs does a spider have?");
            optiq1.setText("4");
            optiq2.setText("6");
            optiq3.setText("8");
            optiq4.setText("10");
        }
        else if(counteriq == 15){
            questioniq.setText("16.How many colors are there in a rainbow?");
            optiq1.setText("4");
            optiq2.setText("5");
            optiq3.setText("6");
            optiq4.setText("7");
        }
    }
    @FXML
    public void optiq1clicked(ActionEvent event){
        checkAnsweriq(optiq1.getText().toString());
        if(checkAnsweriq(optiq1.getText().toString()) ){
            correctiq++;
            optiq1.setStyle("-fx-background-color: green;");
        }else {
            wrongiq++;
            optiq1.setStyle("-fx-background-color: red;");
        }
        if(counteriq == 15){
            resiq.setStyle("-fx-background-color: green;");
            showResultiq.setText("Quiz Ends! Click Result");

        }else{
            counteriq++;
        }
    }
    @FXML
    public void optiq2clicked(ActionEvent event){
        checkAnsweriq(optiq2.getText().toString());
        if(checkAnsweriq(optiq2.getText().toString()) ){
            correctiq++;
            optiq2.setStyle("-fx-background-color: green;");
        }else {
            wrongiq++;
            optiq2.setStyle("-fx-background-color: red;");
        }
        if(counteriq == 15){
            resiq.setStyle("-fx-background-color: green;");
            showResultiq.setText("Quiz Ends! Click Result");
        }else{
            counteriq++;
        }
    }
    public void NextQuestioniq(ActionEvent event) throws  IOException{
        loadQuestionsiq();
        optiq1.setStyle("-fx-background-color: indigo;");
        optiq2.setStyle("-fx-background-color: indigo;");
        optiq3.setStyle("-fx-background-color: indigo;");
        optiq4.setStyle("-fx-background-color: indigo;");
    }
    @FXML
    public void optiq3clicked(ActionEvent event){
        checkAnsweriq(optiq3.getText().toString());
        if(checkAnsweriq(optiq3.getText().toString())){
            correctiq++;
            optiq3.setStyle("-fx-background-color: green;");
        }else {
            wrongiq++;
            optiq3.setStyle("-fx-background-color: red;");
        }
        if(counteriq == 15){
            resiq.setStyle("-fx-background-color: green;");
            showResultiq.setText("Quiz Ends! Click Result");

        }else{
            counteriq++;
        }
    }
    @FXML
    public void optiq4clicked(ActionEvent event){
        checkAnsweriq(optiq4.getText().toString());
        if(checkAnsweriq(optiq4.getText().toString())){
            correctiq++;
            optiq4.setStyle("-fx-background-color: green;");

        }else {
            wrongiq++;
            optiq4.setStyle("-fx-background-color: red;");
        }
        if(counteriq == 15){
            resiq.setStyle("-fx-background-color: green;");
            showResultiq.setText("Quiz Ends! Click Result");
        }else{
            counteriq++;
        }
    }
    boolean checkAnsweriq(String answer ) {
        if(counteriq == 0){
            if(answer.equals("Circle")){
                return true;
            }
            else {
                optiq1.setStyle("-fx-background-color: green;");
                return false;
            }
        } else if (counteriq == 1) {
            if(answer.equals("Fish")){
                return true;
            }
            else{
                optiq4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 2) {
            if(answer.equals("E")){
                return true;
            }
            else{
                optiq1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 3) {
            if(answer.equals("Sad")){
                return true;
            }
            else{
                optiq1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 4) {
            if(answer.equals("Fish")){
                return true;
            }
            else{
                optiq3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 5) {
            if(answer.equals("Orange")){
                return true;
            }
            else{
                optiq4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 6) {
            if(answer.equals("4")){
                return true;
            }
            else{
                optiq2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 7) {
            if(answer.equals("Down")){
                return true;
            }
            else{
                optiq1.setStyle("-fx-background-color: green;");
                return false;
            }//1,4,1E,1,3Fish,4Orange,2-4,1Down,3-12,4Dhaka,2Giraffe,1Small,2-5,1Mount Everest,3-8,4-7
        }else if (counteriq == 8) {
            if(answer.equals("12")){
                return true;
            }
            else{
                optiq3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 9) {
            if(answer.equals("Dhaka")){
                return true;
            }
            else{
                optiq4.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 10) {
            if(answer.equals("Giraffe")){
                return true;
            }
            else{
                optiq2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 11) {
            if(answer.equals("Small")){
                return true;
            }
            else{
                optiq1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 12) {
            if(answer.equals("5")){
                return true;
            }
            else{
                optiq2.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 13) {
            if(answer.equals("Mount Everest")){
                return true;
            }
            else{
                optiq1.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 14) {
            if(answer.equals("8")){
                return true;
            }
            else{
                optiq3.setStyle("-fx-background-color: green;");
                return false;
            }
        }else if (counteriq == 15) {
            if(answer.equals("7")){
                return true;
            }
            else{
                optiq4.setStyle("-fx-background-color: green;");
                return false;
            }
        }
        return false;
    }
    public void ShowResiq(ActionEvent event){
        scriq.setText(Integer.toString(correctiq));
        scriq.setFont(Font.font(20));
        cansiq.setText(Integer.toString(correctiq));
        cansiq.setFont(Font.font(20));
        iansiq.setText(Integer.toString(wrongiq));
        iansiq.setFont(Font.font(20));
    }
    public void ShowResultiq(ActionEvent event)throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("quiziqresult.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToArabicLang(ActionEvent event)throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("ArabicLang.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene =new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
