module com.example.exerciseone {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciseone to javafx.fxml;
    exports com.example.exerciseone;
}