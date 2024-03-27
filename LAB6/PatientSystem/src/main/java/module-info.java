module com.example.patientsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.patientsystem to javafx.fxml;
    exports com.example.patientsystem;
}