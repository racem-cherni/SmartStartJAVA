/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lenovo
 */
public class MainWindowEntrepriseController implements Initializable {

    @FXML
    private JFXButton Quit;
    @FXML
    private TitledPane monespace;
    @FXML
    private JFXButton deconnect1;
    @FXML
    private JFXButton mes_formations_btn;
    @FXML
    private TitledPane offrebtn;
    @FXML
    private JFXButton creeroffre;
    @FXML
    private JFXButton mesoffres;
    @FXML
    private JFXButton creer_formation_btn;
    @FXML
    private JFXButton afficher_formation_btn;
    @FXML
    private BorderPane borderpane;
    @FXML
    private JFXButton forum;
    @FXML
    private JFXButton MesentretiensBtn;
    @FXML
    private JFXButton myProjectButton1;
    @FXML
    private JFXButton ProjectsButton;
    @FXML
    private JFXButton myInvestmentButton;
    @FXML
    private JFXButton AjouterProjectButton;
    @FXML
    private JFXButton deconnect;
    @FXML
    private JFXButton statistiques_formation_btn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void quitAction(ActionEvent event) {
          Stage stage = (Stage) Quit.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void returntologin(ActionEvent event) throws IOException {
          /* Stage stage;
      //  Parent signUpPage = FXMLLoader.load(getClass().getResource("/fxml/Forum.fxml"));
       // borderpane.setCenter(signUpPage);
        Scene scene = new Scene(signUpPage);
        stage = (Stage)Quit.getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();*/
           
     //   Parent root = FXMLLoader.load(getClass().getResource("/fxml/LesOffres.fxml"));
    }

    @FXML
    private void afficher_mesformation_action(ActionEvent event) throws IOException {
     Parent root = FXMLLoader.load(getClass().getResource("/fxml/affich_mes_formation.fxml"));
        borderpane.setCenter(root);
    }
    

    @FXML
    private void createoffreAction(ActionEvent event) throws IOException {
          Parent root = FXMLLoader.load(getClass().getResource("/fxml/AjouterOffre.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void mesoffresAction(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/fxml/MesOffre.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void offrebtnAction(MouseEvent event) {
    }

    @FXML
    private void creer_formation_action(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/fxml/ajoutformation.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void afficher_formation_action(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("/fxml/affich_formation.fxml"));
        borderpane.setCenter(root);
    }


    @FXML
    private void forumAction(ActionEvent event) throws IOException {
        
        Parent signUpPage = FXMLLoader.load(getClass().getResource("/fxml/Forum.fxml"));
        borderpane.setCenter(signUpPage);
    }

    @FXML
    private void Mesentretiens_btn_Action(ActionEvent event) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("/fxml/afficher_entretien.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void myProjectAction(ActionEvent event) throws IOException {
         Parent root=(AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/afficheMyproject.fxml"));
        borderpane.setCenter(root);
    }

    @FXML
    private void ProjectsAction(ActionEvent event) throws IOException {
        Parent root=(AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/afficheProjects.fxml"));
        borderpane.setCenter(root);
        
        
        
    }

    @FXML
    private void myInvestmentAction(ActionEvent event) throws IOException {
        Parent root=(AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/affichemyInvestment.fxml"));
        borderpane.setCenter(root);
        
        
    }

    @FXML
    private void AjouterProjectAction(ActionEvent event) throws IOException {
         Parent root=(AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/AjouteProjet2.fxml"));
        borderpane.setCenter(root);
        
        
    }

    @FXML
    private void decconectAction(ActionEvent event) throws IOException {
        Stage stage;
        Parent signUpPage = FXMLLoader.load(getClass().getResource("/fxml/Login_1.fxml"));
        // borderpane.setCenter(signUpPage);
        Scene scene = new Scene(signUpPage);
        stage = (Stage)Quit.getScene().getWindow();
        stage.hide();
        stage.setScene(scene);
        stage.show();
        
        
    }

    @FXML
    private void statistique_formation_action(ActionEvent event) throws IOException {
           Parent root=(AnchorPane) FXMLLoader.load(getClass().getResource("/fxml/statisque_formation.fxml"));
        borderpane.setCenter(root);
    }
    
}
