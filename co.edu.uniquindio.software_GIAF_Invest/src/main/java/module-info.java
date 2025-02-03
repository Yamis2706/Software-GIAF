module co.edu.uniquindio.software_giaf_invest.giaf_investigacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.software_giaf_invest.giaf_investigacion to javafx.fxml;
    exports co.edu.uniquindio.software_giaf_invest.giaf_investigacion;
}