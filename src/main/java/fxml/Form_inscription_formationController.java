/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxml;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import entities.Session;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javax.mail.MessagingException;
import javax.swing.JOptionPane;
import services.InscriptionService;
import services.emailSend;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class Form_inscription_formationController implements Initializable {

    @FXML
    private Button btn_inscrire_formation;
    @FXML
    private JFXTextArea lettre_txt;
    @FXML
    private AnchorPane inscrption_pane;

    /**
     * Initializes the controller class.
     */
     emailSend s = new emailSend();
    @FXML
    private JFXTextField text_specialité;
    @FXML
    private JFXTextField text_ecole;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void inscrire_formation_action(ActionEvent event) throws IOException, SQLException  {
         InscriptionService ms = new InscriptionService();
      java.util.Date date=new java.util.Date();  
        java.sql.Date ddd = new Date(date.getTime());
           int id = Affiche_formations_usersController.i;
       // String ch=Detail_inscrire_formationController.mission.getNom();
        ////////////////////////////////////////////////////////////////////////session.get(id)
              // int  ids =  ms.getID_formationByNom (ch);  
    
           ms.creerInscription(Session.getId(),id,lettre_txt.getText(),text_specialité.getText(),text_ecole.getText(),ddd,2);
ms.update_nombreins(id, 1);
            

      //  s.Sender("racemcherni1","Azerty1234567890","koussay.sgahier@esprit.tn","","acceptation pour une formation","vous etes les bienvenus pour une formation");
    
          JOptionPane.showMessageDialog(null, " inscription réussi");
          Parent root=(AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/affich_inscription.fxml"));
     inscrption_pane.getChildren().clear();
     inscrption_pane.getChildren().add(root);
    }
    
}
