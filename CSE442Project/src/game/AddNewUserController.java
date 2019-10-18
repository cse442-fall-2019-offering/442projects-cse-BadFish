package game;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddNewUserController {

	@FXML
	private Button back;

	@FXML
	private Button addUser;

	@FXML
	private TextField firstName;

	@FXML
	private TextField lastName;

	@FXML
	private TextField nickName;

	@FXML
	private TextField age;

	@FXML
	private Label promptBox;

	public void back(ActionEvent event) {
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

	public void addUser(ActionEvent event) {
		String FirstName = firstName.getText();
		String LastName = lastName.getText();
		String NickName = nickName.getText();
		String Age = age.getText();

		if (FirstName.length() == 0 || FirstName.indexOf(' ') != -1) {
			if (FirstName.indexOf(' ') != -1) {
				promptBox.setText("Error Last Name: delete white space");
			} else {
				promptBox.setText("Error Last Name: no entry");
			}
		} else if (LastName.length() == 0 || LastName.indexOf(' ') != -1) {
			if (LastName.indexOf(' ') != -1) {
				promptBox.setText("Error Last Name: delete white space");
			} else {
				promptBox.setText("Error Last Name: no entry");
			}
		} else if (NickName.length() == 0 || NickName.indexOf(' ') != -1) {
			if (NickName.indexOf(' ') != -1) {
				promptBox.setText("Error Nickname: delete white space");
			} else {
				promptBox.setText("Error Nickname: no entry");
			}
		} else {

			boolean isInt = true;

			for (int i = 0; i < Age.length(); i++) {
				if (Age.charAt(i) == '0' || Age.charAt(i) == '1' || Age.charAt(i) == '2' || Age.charAt(i) == '3'
						|| Age.charAt(i) == '4' || Age.charAt(i) == '5' || Age.charAt(i) == '6' || Age.charAt(i) == '7'
						|| Age.charAt(i) == '8' || Age.charAt(i) == '9') {
					// Do Nothing
				} else {
					isInt = false;
					break;
				}
			}

			if (isInt) {
				DataAccess x = new DataAccess();
				int slot = x.getEmptyProfile();
				if (slot == -1) {
					promptBox.setText("Error: no empty space");
				} else {
					x.setProfile(slot, FirstName, LastName, NickName, Integer.parseInt(Age), false, 0, false, 0, false,
							0, 0);

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

					x.saveData();

				}

			} else {
				promptBox.setText("Error: Age");
			}

		}

	}

}
