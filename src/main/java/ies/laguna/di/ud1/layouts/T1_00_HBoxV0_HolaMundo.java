package ies.laguna.di.ud1.layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class T1_00_HBoxV0_HolaMundo extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        HBox hBox = new HBox();
        hBox.getChildren().add(new Label("Hola Mundo"));
        hBox.setAlignment(Pos.CENTER);
        Scene escena = new Scene(hBox, 400, 200);
        stage.setScene(escena);

        stage.setTitle("Ejercicio 0- Pantalla con Label");
        stage.show();
    }
}
