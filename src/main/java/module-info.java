module com.example.javafxentornos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javafxentornos to javafx.fxml;
    exports com.example.javafxentornos;
}