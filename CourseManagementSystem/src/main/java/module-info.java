module com.example.coursemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coursemanagementsystem to javafx.fxml;
    exports com.example.coursemanagementsystem;
}