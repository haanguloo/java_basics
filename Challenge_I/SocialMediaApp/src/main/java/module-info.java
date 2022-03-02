module com.haanguloo.socialmediaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.haanguloo.socialmediaapp to javafx.fxml;
    exports com.haanguloo.socialmediaapp;
}