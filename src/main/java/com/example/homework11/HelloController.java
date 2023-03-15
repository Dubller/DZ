package com.example.homework11;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TextField;

import java.util.*;

public class HelloController {
    public TextField input;
    public ListView<String> output;
    private MultipleSelectionModel<String> Model;

    public ObservableList<String> list = FXCollections.observableArrayList();

    public void btnClickedAdd(ActionEvent actionEvent) {
        if (!input.getText().trim().isEmpty()) {
            if (!checkList(input.getText())) {
                list.add(input.getText().trim());
                showAllList();
            }
        }
        input.clear();
    }

    private boolean checkList(String value) {
        return list.contains(value);
    }

    public void btnClickedDel(ActionEvent actionEvent) {
        Model = output.getSelectionModel();
        list.remove(Model.getSelectedItem());
        showAllList();
    }

    private void showAllList() {
        Collections.sort(list);
        output.setItems(list);
    }
}