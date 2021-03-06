package org.loose.fis.sre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.loose.fis.sre.model.ProductName;
import org.loose.fis.sre.services.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        UserService.initDatabase();
        ProductNameService.initDatabase();
        OrderService.initDatabase();
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("login.fxml")));
        primaryStage.setTitle("Bookstore App Login");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
