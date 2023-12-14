module com.example.finalprojectimagemanagementtool {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.finalprojectimagemanagementtool to javafx.fxml;
    exports com.example.finalprojectimagemanagementtool;
}