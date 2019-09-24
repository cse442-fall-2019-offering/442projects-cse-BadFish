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

public class trackprogresscontroller implements Initializable{
@FXML
private Button trackbutton1;

@FXML
private Button trackbutton2;

@FXML
private Button trackbutton3;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	 
		 trackbutton1.setOnAction(this::trackprogress);
		 trackbutton2.setOnAction(this::trackprogress);
		 trackbutton3.setOnAction(this::trackprogress);

	 }
			 
			 
			
public void trackprogress(ActionEvent event) {
	System.out.println("Retrieving your information right now...");
	Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("view/progress.fxml"));
	    Stage stage = new Stage();
	    stage.setTitle("My Progress");
	    stage.setScene(new Scene(root,400,400));
	    stage.show();
	}
	catch(IOException e) {
		e.printStackTrace();
	}	
}
	
	
	
}
