module com.example.demodevice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demodevice to javafx.fxml;
    exports com.example.demodevice;
}