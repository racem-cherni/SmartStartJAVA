/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import com.jfoenix.controls.JFXButton;
import entities.Session;
import entities.myInvestment;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import services.ServiceInvesstissement;
import services.ServiceProjet;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class AffichemyInvestmentController implements Initializable {

     @FXML
    private TableView<myInvestment> afficheInvestment;
      @FXML
    private TableColumn<myInvestment, String> nomprojet1;
    @FXML
    private TableColumn<myInvestment, String> NomInvestisseur_cl;
    @FXML
    private TableColumn<myInvestment, String> montant_cl;
    @FXML
    private TableColumn<myInvestment, String> comptebancaire_cl;
    @FXML
    private JFXButton myProjectInvestmentbut;
    @FXML
    private JFXButton myInvestmentbut;
   
     ObservableList<myInvestment> obser = FXCollections
            .observableArrayList();
    @FXML
    private AnchorPane aff_my_inv_anchorepane;
    @FXML
    private JFXButton Statistique;
    @FXML
    private AnchorPane anchorpane_statique;
    @FXML
    private BarChart<String, Integer> barchart_mesProojet;
    @FXML
    private BarChart<String, Integer> barchar_mes_invessti;
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        anchorpane_statique.setVisible(false);
        aff_my_inv_anchorepane.setVisible(true);
        ServiceInvesstissement s=new ServiceInvesstissement();
        try {
            List<myInvestment> list= s.getmyProjectInvesstissement(Session.getId());////////////////////////////////////////////////////////////////////////////////////////////////////
           
            obser.addAll(list);
        } catch (SQLException ex) {
            Logger.getLogger(AfficheProjectsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
 NomInvestisseur_cl.setCellValueFactory(new PropertyValueFactory<>("NomInvestisseur"));
 montant_cl.setCellValueFactory(new PropertyValueFactory<>("montant"));
comptebancaire_cl.setCellValueFactory(new PropertyValueFactory<>("comptebancaire"));
nomprojet1.setCellValueFactory(new PropertyValueFactory<>("nomprojet"));


     afficheInvestment.setItems(obser);
    }    

    @FXML
    private void myProjectInvestmentAction(ActionEvent event) {
        for(int i=0;i<afficheInvestment.getItems().size();i++)
            afficheInvestment.getItems().clear();
        ServiceInvesstissement s=new ServiceInvesstissement();
        try {
            List<myInvestment> list= s.getmyProjectInvesstissement(Session.getId());/////////////////////////////////////////////////////////////////////////////////////////////
           
            obser.addAll(list);
        } catch (SQLException ex) {
            Logger.getLogger(AfficheProjectsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        NomInvestisseur_cl.setCellValueFactory(new PropertyValueFactory<>("NomInvestisseur"));
 montant_cl.setCellValueFactory(new PropertyValueFactory<>("montant"));
comptebancaire_cl.setCellValueFactory(new PropertyValueFactory<>("comptebancaire"));
nomprojet1.setCellValueFactory(new PropertyValueFactory<>("nomprojet"));

     afficheInvestment.setItems(obser);
    }

    @FXML
    private void myInvestmentAction(ActionEvent event) {
        for(int i=0;i<afficheInvestment.getItems().size();i++)
            afficheInvestment.getItems().clear();
        ServiceInvesstissement s=new ServiceInvesstissement();
        try {
            List<myInvestment> list= s.getmyInvesstissement(Session.getId());///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           
            obser.addAll(list);
        } catch (SQLException ex) {
            Logger.getLogger(AfficheProjectsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        NomInvestisseur_cl.setCellValueFactory(new PropertyValueFactory<>("NomInvestisseur"));
 montant_cl.setCellValueFactory(new PropertyValueFactory<>("montant"));
comptebancaire_cl.setCellValueFactory(new PropertyValueFactory<>("comptebancaire"));
nomprojet1.setCellValueFactory(new PropertyValueFactory<>("nomprojet"));

     afficheInvestment.setItems(obser);
    }

    @FXML
    private void StatiqueAction(ActionEvent event) throws SQLException {
      
        anchorpane_statique.setVisible(true);
        aff_my_inv_anchorepane.setVisible(false);
        ServiceProjet s=new ServiceProjet();
        XYChart.Series<String, Integer> series = s.mesinvestisStat(Session.getId());
         XYChart.Series<String, Integer> series1 = s.myprojStatic(Session.getId());
        
        barchart_mesProojet.getData().add(series1); //(FXCollections.observableArrayList(series1));
        barchar_mes_invessti.getData().add(series);
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
