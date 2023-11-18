package com.example.excercise9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class calController {
    public TextField txt;
    public int valueclick = 0;
    public String operation;
    public double value1 = 0;
    public double result = 0;


    @FXML


    public void handlerDigAct(ActionEvent event) {
        String dig = ((Button)event.getSource()).getText();
        if(result != 0){
            txt.clear();
            result = 0;
        }
        String oldtext = txt.getText();
        String newtext = oldtext + dig;
        txt.setText(newtext);

    }

    public void handlerOpeAct(ActionEvent event) {
        operation = ((Button)event.getSource()).getText();
        switch (operation){
            case "C":
                txt.setText("");
                valueclick = 0;
                break;

            case "+":
            case "-":
            case "*":
            case "/":
                String text = txt.getText();
                value1 = Double.parseDouble(text);
                txt.setText("");
                valueclick = 0;
                break;

            default:


        }
    }

    public void handlerEquAct(ActionEvent event) {

        double value2;
        String text2 = txt.getText();
        if (!text2.isEmpty()) {
            value2 = Double.parseDouble(text2);

            switch (operation) {
                case "+":
                    result = value1 + value2;
                    break;
                case "-":
                    result = value1 - value2;
                    break;
                case "*":
                    result = value1 * value2;
                    break;
                case "/":
                    if (value2 != 0) {
                        result = value1 / value2;
                    } else {
                        txt.setText("Error");
                        return;
                    }
                    break;
            }
            String format = String.format("%.1f", result);
            txt.setText(format);
            value1 = result;

        }
    }
}