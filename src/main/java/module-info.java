module dk.easv.exercise403 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.exercise403 to javafx.fxml;
    exports dk.easv.exercise403;
}