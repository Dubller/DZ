package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.util.FXPermission;

import java.util.Map;
import java.util.TreeMap;

public class HelloController {
    Model model = new Model();
    private MultipleSelectionModel<String> engList;
    public ListView outPutEng;

    public TextField input;
    public ListView outPutRuss;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void btnAdd(ActionEvent actionEvent) {
        if (!input.getText().trim().isEmpty()) {
            if (model.unit(input.getText())) {
                clearView();
                showAllValue();
            }
        }
    }

    public void btnRed(ActionEvent actionEvent) {
        engList = outPutEng.getSelectionModel();
        if (engList.getSelectedItems() != null) {
            input.setText(model.editorByKey(engList.getSelectedItem()));
            clearView();
            showAllValue();
        }
    }

    public void btnDell(ActionEvent actionEvent) {
        engList = outPutEng.getSelectionModel();
        if (engList.getSelectedItem() != null) {
            model.removeElementKeyValue(engList.getSelectedItem());
            clearView();
            showAllValue();
        }
    }

    public void showAllValue() {
        for (Map.Entry<String, String> value : model.elementKeyValue.entrySet()) {
            outPutEng.getItems().add(value.getKey());
            outPutRuss.getItems().add(value.getValue());
        }
    }

    public void clearView() {
        outPutEng.getItems().clear();
        outPutRuss.getItems().clear();
    }


    public void closeProgram(ActionEvent actionEvent) {
        {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Закрыть приложение?");

            alert.showAndWait().ifPresent(response -> {
                if (response == ButtonType.OK) {
                    System.exit(0);
                }
            });
        }
    }
}
