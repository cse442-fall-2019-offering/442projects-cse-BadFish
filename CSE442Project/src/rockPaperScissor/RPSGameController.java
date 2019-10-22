package rockPaperScissor;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class RPSGameController implements Initializable {	
@FXML    
private Button startgame;

@FXML
private Label l;

@FXML 
private Label r; 


@FXML
private ImageView startscene;

@FXML
private ImageView lrock;

@FXML
private ImageView lpaper;

@FXML
private ImageView lscissor;

@FXML
private ImageView rrock;

@FXML
private ImageView rpaper;

@FXML
private ImageView rscissor;

@FXML
private ImageView x;

@FXML
private ImageView check;

@FXML
private ComboBox<String> left;

@FXML
private ComboBox<String> right;

private int leftimage = 0;

private int rightimage = 0;

private boolean gamestart = false;

private boolean choicemadeleft = false; 

private boolean choicemaderight = false;

private int count = 0;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		startgame.setOnAction(this::startrps);
        left.setOnAction(this::leftchosen);
        right.setOnAction(this::rightchosen);
		// TODO Auto-generated method stub	 		
		startscene.setVisible(true);
		l.setText("");
		r.setText("");
		left.getItems().setAll("if","else","a","char");
		right.getItems().setAll("else","if","int","a");
	}
    public void leftchosen(ActionEvent event) {
    	choicemadeleft = true;
    	l.setText(left.getValue());
    }
	
    public void rightchosen(ActionEvent event) {
    	choicemaderight = true;
    	r.setText(right.getValue());
    }
	


    
	public void startrps(ActionEvent event) {
		gamestart = true;
		
		startscene.setVisible(false);
		startgame.setVisible(false);
		
		lrock.setVisible(true);
		rscissor.setVisible(true);
	}
	
}