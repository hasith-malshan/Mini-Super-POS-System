package model;

import java.util.HashMap;
import java.util.Vector;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class BarCode {

    public static void main(String[] args) {

        try {

            String filePath = "src//reports//BarCode.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(filePath);

            HashMap parameters = new HashMap();

            Vector v = new Vector();
            v.add(new X("12342442"));
            v.add(new X("45242452"));
            v.add(new X("78275272"));
            v.add(new X("78375235"));
            v.add(new X("45275752"));

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(v);

            JasperPrint jp = JasperFillManager.fillReport(jr, parameters, dataSource);
            JasperViewer.viewReport(jp, false);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

