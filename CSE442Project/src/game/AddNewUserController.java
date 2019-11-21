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


/**
 * class of controlling adding new user to program
 *
 */
public class AddNewUserController {

	//button stores previous stage
	@FXML
	private Button back;
	//button to add user
	@FXML
	private Button addUser;
	//text field for type in first name
	@FXML
	private TextField firstName;
	//text field to type in last name
	@FXML
	private TextField lastName;
	//text field to type in nick name
	@FXML
	private TextField nickName;
	//text field for type in age
	@FXML
	private TextField age;
	//label of prompt box
	@FXML
	private Label promptBox;

	/**
	 * returns back to previous stage by closing current stage and
	 * reopen previous stage
	 * @param event action event
	 */
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
	
	/**
	 * adding the new user to the program if space is available
	 * @param event action event
	 */
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
					promptBox.setText("No Profile Slots Avalible");
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
