package game;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuPanelController {

    @FXML
    private Button NewPlayerButton;

    @FXML
    void gotoAddNewUserPanel(MouseEvent event) throws IOException {
    	Parent addNewUserPanelParent = FXMLLoader.load(getClass().getResource("view/AddNewUserPanel.fxml"));
    	Scene addNewUserPanelScene = new Scene(addNewUserPanelParent);
    	Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	window.setScene(addNewUserPanelScene);
    	window.show();
    }

}


