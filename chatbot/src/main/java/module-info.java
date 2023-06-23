module com.example.demohf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demohf to javafx.fxml;
    exports com.example.demohf;
}