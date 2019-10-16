package game;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class gameSelectionPanelController implements Initializable {

    @FXML
    private Button flappyButton;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	 
		 flappyButton.setOnAction(this::startFlappyBird);

	 }
 
	public void startFlappyBird(ActionEvent event) {
    	Parent root;
    	try {
    		root=FXMLLoader.load(getClass().getResource("/flappyBird/view/flappyBirdPanel.fxml"));
    		Stage stage=new Stage();
    		stage.setScene(new Scene(root));
    		stage.show();
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    }

}
