module com.example.childlearningapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.childlearningapp to javafx.fxml;
    exports com.example.childlearningapp;
}