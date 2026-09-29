package ies.laguna.di.ud1.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class T1_01_HBoxV3_BarraBusqueda extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Creación de componentes
        Label lblTerminos = new Label("Términos de búsqueda: ");
        TextField txtBusqueda = new TextField();
        txtBusqueda.setPromptText("Escribe aquí...");
        Button btnBuscar = new Button("Buscar");

        // Configuración del HBox con espaciado interno de 10px entre componentes
        HBox hBox = new HBox(10);
        hBox.getChildren().addAll(lblTerminos, txtBusqueda, btnBuscar);

        // Padding de 15px en todos los bordes
        hBox.setPadding(new Insets(15,10,15,10));

        // Alineación centrada a la izquierda
        hBox.setAlignment(Pos.CENTER_LEFT);

        // TextField se estira horizontalmente
        HBox.setHgrow(txtBusqueda, Priority.ALWAYS);

        // Configuración de la Scene y Stage
        Scene escena = new Scene(hBox, 550, 120);
        stage.setScene(escena);
        stage.setTitle("Práctica HBox - Barra de Búsqueda");
        stage.show();
    }
}
