package model;

import com.formdev.flatlaf.FlatLightLaf;
import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class JasperSetUp {

    public static void main(String[] args) {

        try {

//            FlatLightLaf.setup();

            //String filePath = "src//reports//test.jasper";
            String filePath = "src//reports//shop_grn.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(filePath);

            HashMap parameters = new HashMap();

            Connection dataSource = MySql.getConnection();

            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSource);
            JasperViewer.viewReport(jp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
