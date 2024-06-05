module com.example.flowcharttocodemenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flowcharttocodemenu to javafx.fxml;
    exports com.example.flowcharttocodemenu;
}