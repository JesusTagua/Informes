/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

import Modelo.alumnos;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.fxutils.viewer.JasperViewerFX;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class VistaController implements Initializable {

    @FXML
    private Label Titulo;
    @FXML
    private Button BtnDI;
    @FXML
    private Button Salir;

    /**
     * Initializes the controller class.
     */
    private ArrayList<alumnos> alumno = new ArrayList<alumnos>();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       //10 matriculado en DI
       alumno.add(new alumnos("1112","DI",1,"Granada"));
       alumno.add(new alumnos("1113","DI",2,"Sevilla"));
       alumno.add(new alumnos("1114","DI",3,"Malaga"));
       alumno.add(new alumnos("1115","DI",4,"Almeria"));
       alumno.add(new alumnos("1116","DI",5,"Huelva"));
       alumno.add(new alumnos("1117","DI",6,"Granada"));
       alumno.add(new alumnos("1118","DI",7,"Sevilla"));
       alumno.add(new alumnos("1119","DI",8,"Jaén"));
       alumno.add(new alumnos("1122","DI",9,"Granada"));
       alumno.add(new alumnos("47426544S","DI",9,"Sevilla"));
       
       
       // Alumnos matriculados en PMDM
        alumno.add(new alumnos("1123", "PMDM", 1, "Cádiz"));
        alumno.add(new alumnos("1124", "PMDM", 2, "Huelva"));
        alumno.add(new alumnos("1125", "PMDM", 3, "Granada"));
        alumno.add(new alumnos("1126", "PMDM", 4, "Málaga"));
        alumno.add(new alumnos("1127", "PMDM", 5, "Sevilla"));
        alumno.add(new alumnos("1128", "PMDM", 6, "Córdoba"));
       
       // Alumnos matriculados en AD
        alumno.add(new alumnos("1129", "AD", 1, "Jaén"));
        alumno.add(new alumnos("1130", "AD", 2, "Granada"));
        alumno.add(new alumnos("1131", "AD", 3, "Almería"));
        alumno.add(new alumnos("1132", "AD", 4, "Cádiz"));
        alumno.add(new alumnos("1133", "AD", 5, "Sevilla"));

       // Alumnos matriculados en PSP
        alumno.add(new alumnos("1134", "PSP", 1, "Granada"));
        alumno.add(new alumnos("1135", "PSP", 2, "Huelva"));
        alumno.add(new alumnos("1136", "PSP", 3, "Málaga"));
    
       
         //Ordenamos el arrayList
        Collections.sort(alumno);
        
        System.out.println("24 alumnos creados correctamente"); 
    }    
    
    
    
    

    @FXML
    private void AlumMatricuDI(ActionEvent event) {
        try{
            //Definimos la coleccion de datos sobre la que se creará el informe           
            JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(alumno);
            
            Node source = (Node) event.getSource();
            
            Stage stage = (Stage) source.getScene().getWindow();
            
            JasperViewerFX viewerfx;
            
            viewerfx = new JasperViewerFX(stage,"informe","/informes/Informe.jasper",new HashMap(), beanColDataSource );
            
            viewerfx.show();
            
        }
        
       catch(Exception ex){
           System.out.println(ex.getMessage());
           
       }
    }
    
    
    

    @FXML
    private void SalirAPP(ActionEvent event) {
        System.exit(0);
    }
    
}
