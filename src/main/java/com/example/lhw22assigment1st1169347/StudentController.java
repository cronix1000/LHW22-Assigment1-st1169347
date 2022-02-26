package com.example.lhw22assigment1st1169347;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.io.Console;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentController implements Initializable{



    @FXML
    private ListView<String> activityList;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private ImageView studentImageView;

    @FXML
    private Label studentNumberLabel;


    private Student student;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> activities  = new ArrayList<>();
        activities.add("Gaming");
        activities.add("Boxing");
        activities.add("WeightLifting");
        activities.add("Game Development");
        activities.add("Mauy Thai");

        student = new Student("Idan", "Gomberg", 2424233, activities);
        showStudent(student.getActivities());
        }


    @FXML
    private void showStudent(ArrayList<String> list){
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentImageView.setImage(student.getStudentImage());
        studentImageView.setRotate(90);
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));
        for(int i=0; i<student.getActivities().size();i++) {
            activityList.getItems().add(list.get(i));
        }


    }
}
