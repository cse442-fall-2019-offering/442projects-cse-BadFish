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


public class MenuController implements Initializable {
	//button for adding new plyer
	@FXML
	private Button newplayer;

	//button for accessing user profile
	@FXML
	private Button userprofile;
	
	//button to exit current stage
	@FXML
	private Button rankstatus;
	
	@FXML
	private Button exit;
	
	//initializing button to attach proper functionality
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		newplayer.setOnAction(this::adduser);
		userprofile.setOnAction(this::showuser);
		rankstatus.setOnAction(this::showrank);
	}
	/**
	 * function attach to new user button, opens adding user panel
	 * @param event
	 */
	public void adduser(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/AddNewUserPanel.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) newplayer.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * function attached to show user button, opens show user panel
	 * @param event action event
	 */
	public void showuser(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/SelectUserProfilePanel.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) userprofile.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showrank(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/RankPanel.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) rankstatus.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void exit(ActionEvent event) {
		Stage oldstage = (Stage) userprofile.getScene().getWindow();
		oldstage.close();
	}

}
