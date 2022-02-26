package com.example.lhw22assigment1st1169347;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    //private variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> activities;
    private Image studentImage;

    //constructor
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> activities) {
        setStudentNumber(studentNumber);
        setName(firstName,lastName);
        setActivities(activities);
        String fileName = String.format("images/%s_%s.jpg", firstName, lastName);
        studentImage = new Image(getClass().getResource(fileName).toExternalForm());

    }

    public Image getStudentImage() {
        return studentImage;
    }
    /**
     * Convert the first letter in name to capital with a char arraay
     * verify the name by adding checking for string length of both first and last name
     * converting it to a char array
     * use the function isLetter to make sure the char is a letter
     */
    public void setName(String firstName, String lastName) {
        char[] firstNameArray = firstName.toCharArray();
        firstNameArray[0] = Character.toUpperCase(firstNameArray[0]);
        char[] lastNameArray = lastName.toCharArray();
        lastNameArray[0] = Character.toUpperCase(lastNameArray[0]);

        firstName = String.valueOf(firstNameArray);
        lastName = String.valueOf(lastNameArray);

        if(firstName.length() > 2 && lastName.length() > 2){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException("Your first and last name needed to be longer then 2 letters");

    }
    //getters

    /**
     * return firstName
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * return last name
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * return student number
     * @return
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     *
     * @param studentNumber
     * Verify student number
     * student number must 7 numbers long
     * this is done by checking the numbers length
     */
    public void setStudentNumber(int studentNumber) {
        int numLength = String.valueOf(studentNumber).length();
        if(numLength == 7)
        this.studentNumber = studentNumber;
        else
            throw new IllegalArgumentException("Your student number must contain 9 numbers");
    }

    /**
     * return ArrayList
     * @return
     */
    public ArrayList<String> getActivities() {
        return activities;
    }

    /**
     * Validates the Arraylist not to be empty
     * @param activities
     */
    public void setActivities(ArrayList<String> activities) {
        if(activities.size()!= 0)
            this.activities = activities;
        else
            throw new IllegalArgumentException("The activity list provided was empty must have atleast one");
    }
}
