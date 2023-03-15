package com.example.homework11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Monitor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 336, 368);
        stage.setTitle("TestMonitor!");
        stage.setScene(scene);
        stage.show();

    }
        public static void main(String[] args) {
            launch();
        }
}