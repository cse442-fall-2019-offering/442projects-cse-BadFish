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
	@FXML
	private Button newplayer;

	@FXML
	private Button userprofile;
	
	@FXML
	private Button exit;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		newplayer.setOnAction(this::adduser);
		userprofile.setOnAction(this::showuser);
	}

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
	
	public void exit(ActionEvent event) {
		Stage oldstage = (Stage) userprofile.getScene().getWindow();
		oldstage.close();
	}

}
