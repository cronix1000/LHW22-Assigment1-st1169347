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
    public String str;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] activities = {"Gaming","Boxing","WeightLifting","Game Development"};

        student = new Student("Idan", "Gomberg", 2424233, activities);
        showStudent(student.getActivities());
        }


    @FXML
    private void showStudent(String[] list){
        firstNameLabel.setText(student.getFirstName());
        lastNameLabel.setText(student.getLastName());
        studentImageView.setImage(student.getStudentImage());
        studentNumberLabel.setText(Integer.toString(student.getStudentNumber()));
        for(int i=0; i<student.getActivities().length;i++) {
            activityList.getItems().add(list[i]);
        }


    }
}
