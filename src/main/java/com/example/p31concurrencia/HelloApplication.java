package com.example.p31concurrencia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.ExecutorService;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
        PrintTask task1 = new PrintTask("Tarea 1");
        PrintTask task2 = new PrintTask("Tarea 2");
        PrintTask task3 = new PrintTask("Tarea 3");

        System.out.println("Starting Executor");
        ExecutorService executorService = ExecutorService.newCachedThreadPool();
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);

        executorService.shutdown();
        System.out.println("Tasks started, main end. %n%n");
    }
}