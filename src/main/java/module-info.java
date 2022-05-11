module com.example.leetcodesolvingproblemsalgorithms {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.leetcodesolvingproblemsalgorithms to javafx.fxml;
    exports com.example.leetcodesolvingproblemsalgorithms;
}