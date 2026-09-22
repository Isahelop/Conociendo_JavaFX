module com.example.conociendojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.conociendojavafx to javafx.fxml;
    exports com.example.conociendojavafx;
}