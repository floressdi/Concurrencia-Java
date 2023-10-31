module com.example.p31concurrencia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.p31concurrencia to javafx.fxml;
    exports com.example.p31concurrencia;
}