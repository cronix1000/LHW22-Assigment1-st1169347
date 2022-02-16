module com.example.lhw22assigment1st1169347 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.lhw22assigment1st1169347 to javafx.fxml;
    exports com.example.lhw22assigment1st1169347;
}