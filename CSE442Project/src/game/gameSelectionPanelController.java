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

	
	//buttons to open flappy bird game
    @FXML
    private Button flappyButton;
    //initializing button to attach proper controller function
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		 flappyButton.setOnAction(this::startFlappyBird);

	 }
	/**
	 * opening flappy bird game
	 * create a new stage for the game and opens it
	 * @param event action event
	 */
	public void startFlappyBird(ActionEvent event) {
    	Parent root;
    	try {
    		root=FXMLLoader.load(getClass().getResource("/rockPaperScissor/view/RPSGame.fxml"));
    		Stage stage=new Stage();
    		stage.setScene(new Scene(root));
    		stage.show();
    	}
    	catch(IOException e) {
    		e.printStackTrace();
    	}
    }

}
