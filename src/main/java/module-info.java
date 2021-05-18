module com.uni.edu.ni.gestiontaller {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.uni.edu.ni.gestiontaller to javafx.fxml;
    exports com.uni.edu.ni.gestiontaller;
}
