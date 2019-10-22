package game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class UserProfile2Controller {

	//back button to previous stage
		@FXML
		private Button back;
		//name label
		@FXML
		private Label name;
		//nick name label
		@FXML
		private Label nickName;
		//total games label
		@FXML
		private Label totalGames;
		//label for game completed
		@FXML
		private Label gameFinished;
		//label for game that is in progress
		@FXML
		private Label gameInProgress;
		//label to time spent
		@FXML
		private Label spendTime;
		//score1 label
		@FXML
		private Label score1;
		//score2 label
		@FXML
		private Label score2;
		//score3 label
		@FXML
		private Label score3;
		/**
		 * initializing the button functionality and initialize profiles
		 */
	@FXML
	void initialize() {
		
		back.setOnAction(this::back);
		
		DataAccess x = new DataAccess();
		Profile profile = x.getProfile(2);
		
		int totalGames = 3;

		if (profile != null) {
			name.setText(profile.getFullName());
			nickName.setText(profile.getNickName());
			this.totalGames.setText("Total Games: " + totalGames);
			
			int finished = 0;
			for(int i = 0; i < totalGames; i++) {
				if(profile.getGameStatus(i)) {
					finished++;
				}
			}
			
			gameFinished.setText("Game Finished: " + finished);
			gameInProgress.setText("Game In Progress: " + (totalGames - finished));
			if(profile.getGameTime() == 1) {
				spendTime.setText("You spent " + profile.getGameTime() + " hour");
			}
			else {
				spendTime.setText("You spent " + profile.getGameTime() + " hours");
			}

			score1.setText("Game1: " + profile.getGameScore(1));
			score2.setText("Game2: " + profile.getGameScore(2));
			score3.setText("Game3: " + profile.getGameScore(3));

			
		} else {
			name.setText("Empty");
			this.totalGames.setText("Total Games: Nan");
			gameFinished.setText("Total Games: Nan");
			gameInProgress.setText("Total Games: Nan");
			spendTime.setText("You spent 0 hour");
			score1.setText("Game1: Nan");
			score2.setText("Game1: Nan");
			score3.setText("Game1: Nan");

		}
	}
	/**
	 * return to previous stage
	 * @param event action event
	 */
	@FXML
	public void back(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("view/SelectUserProfilePanel.fxml"));
			Stage stage = new Stage();
			stage.setScene(new Scene(root));
			stage.show();
			Stage oldstage = (Stage) back.getScene().getWindow();
			oldstage.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}