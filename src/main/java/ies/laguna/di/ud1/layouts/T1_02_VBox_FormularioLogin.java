package ies.laguna.di.ud1.layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T1_02_VBox_FormularioLogin extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox = new VBox(15);
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(25));

        Label lblTerminos = new Label("Acceso al Sistema");

        TextField txtUsuario = new TextField();
        txtUsuario.setPromptText("Introduce tu usuario");

        PasswordField pwdContrasena = new PasswordField();
        pwdContrasena.setPromptText("Introduce tu contraseña");

        Button btnLogin = new Button("Iniciar Sesión");

        vBox.getChildren().addAll(lblTerminos, txtUsuario, pwdContrasena, btnLogin);

        Scene escena = new Scene(vBox, 350, 300);
        stage.setScene(escena);
        stage.setTitle("Práctica VBox - Formulario de Acceso");
        stage.show();
    }
}
