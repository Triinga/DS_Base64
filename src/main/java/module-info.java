module com.example.ds_base64 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ds_base64 to javafx.fxml;
    exports com.example.ds_base64;
}