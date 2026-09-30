package ies.laguna.di.ud1.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class T1_03_StackPane extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        stackPane.setPadding(new Insets(20));

        Rectangle fondo = new Rectangle(320, 180, Color.valueOf("#3a86ef"));
        fondo.setArcWidth(20);
        fondo.setArcHeight(20);

        Label lblTexto = new Label("OFERTA ESPECIAL");
        lblTexto.setAlignment(Pos.TOP_LEFT);
        lblTexto.setFont(Font.font("System", FontWeight.BOLD, 16));
        lblTexto.setTextFill(Color.WHITE);
        StackPane.setAlignment(lblTexto, Pos.TOP_LEFT);
        StackPane.setMargin(lblTexto, new Insets(35,0,0,35));

        Button btnDetalles = new Button("Ver Detalles");
        btnDetalles.setAlignment(Pos.BOTTOM_RIGHT);
        btnDetalles.setFont(Font.font("System", FontWeight.BOLD, 10));
        btnDetalles.setStyle("-fx-background-color: white;");
        btnDetalles.setTextFill(Color.BLUE);
        StackPane.setAlignment(btnDetalles, Pos.BOTTOM_RIGHT);
        StackPane.setMargin(btnDetalles, new Insets(0,35,35,0));

        stackPane.getChildren().addAll(fondo, lblTexto, btnDetalles);

        Scene escena = new Scene(stackPane, 400, 260);
        stage.setScene(escena);
        stage.setTitle("Práctica StackPane - Tarjeta Promocional");
        stage.show();
    }
}
