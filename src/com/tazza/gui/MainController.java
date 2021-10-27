package com.tazza.gui;

import com.tazza.StringExercises;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TextField helperTxt;
    @FXML
    private Label lblExercise;
    @FXML
    private Label lblResult;
    @FXML
    private ComboBox exerciseType;
    @FXML
    private Button executionButton;
    @FXML
    private TextField txtInput;
    StringExercises se = new StringExercises();
    public void processText(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*exerciseType.setItems(FXCollections.observableArrayList("Insert the String in between < and > ",
                "Count the length","Insert a \"@\" in between letters","Inverse a String","Translate in morse",
                "Replace words horse/saddle/spores by ****", "Inverse and glue together","Alternate Case",
                "1337 it ! :)","Replace letters by chosen ones", "Word multiplier",
                "The longest repeating character","Inverse the meaning","Test in class"));*/
        exerciseType.getItems().add("Insert the String in between < and >");
        exerciseType.getItems().add("Count the length");
        exerciseType.getItems().add("Insert a \"@\" in between letters");
        exerciseType.getItems().add("Inverse a String");
        exerciseType.getItems().add("Translate in morse");
        exerciseType.getItems().add("Replace words horse/saddle/spores by ****");
        exerciseType.getItems().add("Inverse and glue together");
        exerciseType.getItems().add("Alternate Case");
        exerciseType.getItems().add("1337 it ! :)");
        exerciseType.getItems().add("Replace letters by chosen ones");
        exerciseType.getItems().add("Word multiplier");
        exerciseType.getItems().add("The longest repeating character");
        exerciseType.getItems().add("Inverse the meaning");
        exerciseType.getItems().add("Test in class");
        exerciseType.getItems().add("Test on array indexes");

        exerciseType.setVisibleRowCount(4);
        helperTxt.setOpacity(0);
    }
    public void setLabel(String text){
        lblExercise.setText(text);
        helperTxt.setOpacity(0);
    }
    public void handleSelectExerciseType(ActionEvent actionEvent) throws IOException {
        helperTxt.setOpacity(0);
        String inputString = txtInput.getText();
        String changedString;
        int selectedIndex = exerciseType.getSelectionModel().getSelectedIndex();
        switch (selectedIndex) {
            case 0:

                changedString = se.exercise1(inputString);
                break;
            case 1:

                changedString = se.exercise2(inputString);
                break;
            case 2:

                changedString = se.exercise3(inputString);
                break;
            case 3:

                changedString = se.exercise4(inputString);
                break;
            case 4:

                changedString = se.exercise5(inputString);
                break;
            case 5:

                changedString = se.exercise6(inputString);
                break;
            case 6:

                changedString = se.exercise7(inputString);
                break;
            case 7:

                changedString = se.exercise8(inputString);
                break;
            case 8:

                changedString = se.exercise9(inputString);
                break;
            case 9:
                String inputAllowed= helperTxt.getText();
                changedString = se.exercise10(inputString,inputAllowed);
                break;
            case 10:

                changedString = se.exercise11(inputString);
                break;
            case 11:

                changedString = se.exercise12(inputString);
                break;
            case 12:

                changedString = se.exercise13(inputString);
                break;
            case 13:
                helperTxt.setOpacity(1);
                 inputAllowed=helperTxt.getText();
                changedString = String.valueOf(se.exercise14(Integer.parseInt(inputString),Integer.parseInt(inputAllowed)));
                break;
            case 14:

                changedString = se.exerciseTest(inputString);
                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");

        }



        String resultText = changedString;

        lblResult.setText(resultText);
    }

    public void displaySelected(ActionEvent actionEvent) {
        int selectedIndex = exerciseType.getSelectionModel().getSelectedIndex();
        switch (selectedIndex) {
            case 0:
                setLabel("Enter a name/word :");

                break;
            case 1:
                setLabel("Enter a name/word you wish the length of:");

                break;
            case 2:
                setLabel("Enter a name/word to get @ in between letters:");

                break;
            case 3:
                setLabel("Enter a name/word you wish to inverse:");

                break;
            case 4:
                setLabel("Please provide a sentence you wish to translate in morse :");

                break;
            case 5:
                setLabel("Please enter a sentence with the words horse/saddle/spores to replace by ****");

                break;
            case 6:
                setLabel("Please enter the name or sentence that you want inverted and glued :");

                break;
            case 7:
                setLabel("Please enter the name or sentence that you want the case alternated :");

                break;
            case 8:
                setLabel("Please enter the name or sentence that you want to 1337 :) :");

                break;
            case 9:
                setLabel("Please enter the name or sentence that you want to process"
                +"\n Please enter the characters that you allow to exist in the next realm (case sensitive):");
                helperTxt.setOpacity(1);

                break;
            case 10:
                setLabel("Please enter the name or sentence that you want to process through a multiplier :");

                break;
            case 11:
                setLabel("Exercise 12 : Please enter the name or sentence that you want to process in order to find the value longest repeating character :");

                break;
            case 12:
                setLabel("Exercise 13 : Please enter the sentence you wish to inverse the meaning of (test the range of words is limited):");

                break;
            case 13:
                setLabel("Exercise Test : Please enter something");

                break;
            case 14:
                setLabel("Exercise Test : Please enter something");

                break;
            default:
                throw new UnsupportedOperationException("Selected conversion not supported yet");

        }
    }
}
