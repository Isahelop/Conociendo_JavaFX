package com.example.conociendojavafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage){
        Label lblNombre = new Label("Ingresa el Nombre:");
        TextField txtNombre = new TextField();

        Label lblMatricula = new Label("Ingrese Matricula");
        TextField txtMatricula = new TextField();

        Button btnRegistrar = new Button("Registrar Estudiante");
        Label lblResultado = new Label();

        btnRegistrar.setOnAction(event -> {
            String nombreIngresado = txtNombre.getText();
            String matriculaIngresada = txtMatricula.getText();

            Estudiante estudiante = new Estudiante(nombreIngresado,matriculaIngresada);

            lblResultado.setText("Registro exitoso\nNombre: " +
                    estudiante.getNombre() + "\nMatricula: " + estudiante.getMatricula());
        });
        //3. Layout: VBox implementado
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        root.getChildren().addAll(lblNombre,txtNombre,lblMatricula,txtMatricula,btnRegistrar, lblResultado );

        Scene scene = new Scene(root,300,250);
        primaryStage.setTitle("Actividad JavaFX - POO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        launch();
    }
}
