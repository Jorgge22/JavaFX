package ies.laguna.di.ud1.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class T1_04_FlowPane extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FlowPane flowPane = new FlowPane();

        // 2. Configurar la separación horizontal/vertical, padding y alineación
        flowPane.setHgap(10);  // 10 px de separación entre controles vecinos
        flowPane.setVgap(10);  // 10 px de separación entre filas que se creen
        flowPane.setPadding(new Insets(15)); // 15 px de margen interno
        flowPane.setAlignment(Pos.CENTER);  // Alineación centrada

        flowPane.setStyle("-fx-background-color: #2b2d42; -fx-background-radius: 10");

        Button btn1 = new Button("JavaFX");
        Button btn2 = new Button("HTML5");
        Button btn3 = new Button("JavaScript");
        Button btn4 = new Button("Python");
        Button btn5 = new Button("SQL");
        Button btn6 = new Button("Git");
        Button btn7 = new Button("GitHub");

        String estiloBoton = "-fx-background-color: #edf2f4; -fx-text-fill: #2b2d42; -fx-font-weight: bold; -fx-background-radius: 15; -fx-padding: 8 15 8 15;";

        btn1.setStyle(estiloBoton);
        btn2.setStyle(estiloBoton);
        btn3.setStyle(estiloBoton);
        btn4.setStyle(estiloBoton);
        btn5.setStyle(estiloBoton);
        btn6.setStyle(estiloBoton);
        btn7.setStyle(estiloBoton);

        flowPane.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6, btn7);

        // 5. Creación de la escena (400x200 px) y despliegue del escenario
        Scene escena = new Scene(flowPane, 420, 220);
        stage.setTitle("Práctica FlowPane - Panel de Tecnologías");
        stage.setScene(escena);
        stage.show();

    }
}
