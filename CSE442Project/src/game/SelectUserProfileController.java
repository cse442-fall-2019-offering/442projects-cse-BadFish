package game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class SelectUserProfileController {

	@FXML
	private Button profileButton2;

	@FXML
	private Button profileButton1;

	@FXML
	private Button profileButton0;

	@FXML
	private Label profileName2;

	@FXML
	private Label profileName1;

	@FXML
	private Label profileName0;

	@FXML
	private ProgressBar profileProgress0;

	@FXML
	private ProgressBar profileProgress1;

	@FXML
	private ProgressBar profileProgress2;

	@FXML
	private Button profileProgressButton1;

	@FXML
	private Button profileProgressButton0;

	@FXML
	private Button profileProgressButton2;

	@FXML
	private Button back;

	@FXML
	void initialize() {

		profileButton2.setOnAction(this::profileButton2);
		profileButton1.setOnAction(this::profileButton1);
		profileButton0.setOnAction(this::profileButton0);

		DataAccess x = new DataAccess();

		if (x.getProfile(0) != null) {
			profileName0.setText(x.getProfile(0).getFullName());
			profileButton0.setText(x.getProfile(0).getNickName());

			int progress = 0;
			for (int i = 0; i < 3; i++) {
				if (x.getProfile(0).getGameStatus(i)) {
					progress++;
				}
			}

			profileProgress0.setProgress((double) progress / 3);

		} else {
			profileName0.setText("Empty");
			profileButton0.setText("Empty");
		}

		if (x.getProfile(1) != null) {
			profileName1.setText(x.getProfile(1).getFullName());
			profileButton1.setText(x.getProfile(1).getNickName());

			int progress = 0;
			for (int i = 0; i < 3; i++) {
				if (x.getProfile(1).getGameStatus(i)) {
					progress++;
				}
			}

			profileProgress1.setProgress((double) progress / 3);

		} else {
			profileName1.setText("Empty");
			profileButton1.setText("Empty");
		}

		if (x.getProfile(2) != null) {
			profileName2.setText(x.getProfile(2).getFullName());
			profileButton2.setText(x.getProfile(2).getNickName());

			int progress = 0;
			for (int i = 0; i < 3; i++) {
				if (x.getProfile(2).getGameStatus(i)) {
					progress++;
				}
			}

			profileProgress2.setProgress((double) progress / 3);

		} else {
			profileName2.setText("Empty");
			profileButton2.setText("Empty");
		}
	}

	@FXML
	void back(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/MenuPanel.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) back.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@FXML
	void profileButton0(ActionEvent event) {
		
	}

	@FXML
	void profileButton1(ActionEvent event) {
		
	}

	@FXML
	void profileButton2(ActionEvent event) {
		
	}
	
	@FXML
	void profileProgressButton0(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/UserProfilePanel0.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) profileButton0.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	void profileProgressButton1(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/UserProfilePanel1.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) profileButton1.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FXML
	void profileProgressButton2(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/UserProfilePanel2.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) profileButton2.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
