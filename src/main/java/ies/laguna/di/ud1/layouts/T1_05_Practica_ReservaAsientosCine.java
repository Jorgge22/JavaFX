package ies.laguna.di.ud1.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.lang.reflect.Array;

public class T1_05_Practica_ReservaAsientosCine extends Application {
    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        // Contenedor principal
        VBox contenedorPrincipal = new VBox();

        contenedorPrincipal.setSpacing(15);
        contenedorPrincipal.setPadding(new Insets(25));

        // Zona 1
        FlowPane flowPane1 = new FlowPane();

        Label titulo1 = new Label("1. Sala General (Acceso por Índice: getChildren().get(i) )");
        titulo1.setFont(Font.font("System", FontWeight.BOLD, 12));


        // 2. Configurar la separación horizontal/vertical
        flowPane1.setHgap(8);  // 8 px de separación entre controles vecinos
        flowPane1.setVgap(8);  // 8 px de separación entre filas que se creen
        flowPane1.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-padding: 10;");

        for (int i = 1; i <= 20; i++) {
            Button button = new Button("A-" + i);
            button.setStyle("-fx-background-color: #3498db; -fx-text-fill: white;");

            flowPane1.getChildren().add(button);
        }

        Button botonOcupado = (Button) flowPane1.getChildren().get(10);
        botonOcupado.setText("OCUPADO");
        botonOcupado.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; -fx-font-weight: bold;");

        // ZONA 2
        FlowPane flowPane2 = new FlowPane();
        flowPane2.setHgap(8);  // 8 px de separación entre controles vecinos
        flowPane2.setVgap(8);  // 8 px de separación entre filas que se creen
        flowPane2.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-padding: 10;");

        Label titulo2 = new Label("2. Zona VIP (Búsqueda por Selector CSS / ID: lookup(\"#id\") ):");
        titulo2.setFont(Font.font("System", FontWeight.BOLD, 12));

        for (int i = 1; i <= 20; i++) {
            Button butacas = new Button("VIP-" + i);
            butacas.setStyle("-fx-background-color: #f1c40f;");
            butacas.setId("vip_" + i);

            flowPane2.getChildren().add(butacas);
        }

        Button botonReservado = (Button) flowPane2.lookup("#vip_15");
        botonReservado.setText("RESERVADO");
        botonReservado.setStyle("-fx-background-color: #e67e22; -fx-text-fill: white; -fx-font-weight: bold;");

        // ZONA 3
        FlowPane flowPane3 = new FlowPane();
        flowPane3.setHgap(8);  // 8 px de separación entre controles vecinos
        flowPane3.setVgap(8);  // 8 px de separación entre filas que se creen
        flowPane3.setStyle("-fx-background-color: white; -fx-background-radius: 10; -fx-padding: 10;");

        Label titulo3 = new Label("3. Palcos Preferentes (Referencia Directa en Array: Button[] ):");
        titulo3.setFont(Font.font("System", FontWeight.BOLD, 12));

        Button[] palcos = new Button[20];

        for (int i = 0; i < palcos.length; i++) {
            palcos[i] = new Button("P-" + (i+1));
            palcos[i].setStyle("-fx-background-color: #2ecc71; -fx-text-fill: white;");
        }

        palcos[12].setText("SELECCIONADO");
        palcos[12].setStyle("-fx-background-color: #9b59b6; -fx-text-fill: white; -fx-font-weight: bold;");

        flowPane3.getChildren().addAll(palcos);

        contenedorPrincipal.getChildren().addAll(titulo1, flowPane1, titulo2, flowPane2, titulo3, flowPane3);

        // 5. Creación de la escena y despliegue del escenario
        Scene escena = new Scene(contenedorPrincipal, 650, 480);
        stage.setTitle("CineCentral - Mapa de Reserva de Asientos");
        stage.setScene(escena);
        stage.show();

    }
}
