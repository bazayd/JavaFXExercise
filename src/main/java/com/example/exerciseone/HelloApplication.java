package com.example.exerciseone;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Brandon", 145));
        students.add(new Student("Juan", 123));



        VBox vBox = new VBox();

        for (Student student: students) {
            GridPane cardPane = cardPaneCreate(student);
            vBox.getChildren().add(cardPane);
        }

//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
//        stage.setTitle("Hello!");
//        stage.setScene(scene);
//        stage.show();
        BorderPane bp = new BorderPane();
        bp.setCenter(vBox);

        Scene scene = new Scene(bp, 350, 230, Color.LIGHTYELLOW);

        stage.setTitle("Student Info");

        stage.setScene(scene);
        stage.show();
    }



    private GridPane cardPaneCreate(Student student) {
        Label nameLabel = new Label("Name: " + student.getName());
        Label idLabel = new Label("ID: " + student.getStudentId());

        GridPane cardPane = new GridPane();
        cardPane.setPadding(new Insets(10));
        cardPane.setHgap(5);
        cardPane.setVgap(5);

        cardPane.add(nameLabel, 0, 0);
        cardPane.add(idLabel, 0, 1);

        cardPane.setStyle("-fx-background-color: #ffffff; -fx-border-color: #ec5130 ; -fx-border-width: 2px;; -fx-border-radius: 5px");

        return cardPane;
    }

//    private Node getStudent(Student student) {
//        String studentinfo = "Name: " + student.getName()
//                + ", Student ID: " + student.getStudentId();
//        return new Label(studentinfo);
//    }

    public static void main(String[] args) {
        launch(args);
    }
}