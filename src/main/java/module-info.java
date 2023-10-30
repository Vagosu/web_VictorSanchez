module com.example.web_victorsanchez {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.web_victorsanchez to javafx.fxml;
    exports com.example.web_victorsanchez;
}