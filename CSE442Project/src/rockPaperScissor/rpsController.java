package rockPaperScissor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class rpsController implements Initializable{

    @FXML
    private Pane you;

    @FXML
    private Pane opp;

    @FXML
    private Button play;
    
    @FXML
    private RadioButton selRock;

    @FXML
    private ToggleGroup rpst;

    @FXML
    private RadioButton selPaper;

    @FXML
    private RadioButton selScissor;

    @FXML
    private ChoiceBox<String> ifRock0;

    @FXML
    private ChoiceBox<String> ifRock1;

    @FXML
    private ChoiceBox<String> ifRock2;
    
    @FXML
    private ChoiceBox<String> ifPaper0;

    @FXML
    private ChoiceBox<String> ifPaper1;

    @FXML
    private ChoiceBox<String> ifPaper2;

    @FXML
    private ChoiceBox<String> ifScissor0;

    @FXML
    private ChoiceBox<String> ifScissor1;

    @FXML
    private ChoiceBox<String> ifScissor2;

    
    private ImageView oppV;
    private ImageView youV;
    
    private int uMove;
    private int oMove;
    private ArrayList<ChoiceBox<String>> ifRockArr=new ArrayList<>();
    private ArrayList<ChoiceBox<String>> ifPaperArr=new ArrayList<>();
    private ArrayList<ChoiceBox<String>> ifScissorArr=new ArrayList<>();
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		play.setOnAction(this::play);
		addInstToButton();
	}

    @FXML
    void play(ActionEvent event) {
    	if(!whichMove()) {
    		return;
    	}
    	Random rand= new Random();
    	oMove= rand.nextInt()%3+1;
    	switch(oMove) {
    	case 1:
    		oppV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\rock.jpg");
    		oppV.setFitHeight(opp.getPrefHeight());
    		oppV.setFitWidth(opp.getPrefWidth());
    		break;
    	case 2:
    		oppV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\paper.jpg");
    		oppV.setFitHeight(opp.getPrefHeight());
    		oppV.setFitWidth(opp.getPrefWidth());
    		break;
    	case 3:
    		oppV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\scissors.jpg");
    		oppV.setFitHeight(opp.getPrefHeight());
    		oppV.setFitWidth(opp.getPrefWidth());
    		break;
    	}
    	you.getChildren().clear();
    	if(youV==null) {
    		youV=new ImageView();
    	}
    	you.getChildren().add(youV);
    	opp.getChildren().clear();
    	if(oppV==null) {
    		oppV=new ImageView();
    	}
    	opp.getChildren().add(oppV);
    }

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private boolean whichMove() {
		if(selRock.isSelected()) {
			uMove=1;
			showRock();
			return true;
		}
		else if(selPaper.isSelected()) {
			uMove=2;
			showPaper();
			return true;
		}
		else if(selScissor.isSelected()) {
			uMove=3;
			showScissor();
			return true;
		}
		else return false;
	}
	private void showRock() {
		youV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\rock.jpg");
    	youV.setFitHeight(opp.getPrefHeight());
    	youV.setFitWidth(opp.getPrefWidth());
	}
	private void showPaper() {
		youV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\paper.jpg");
    	youV.setFitHeight(opp.getPrefHeight());
    	youV.setFitWidth(opp.getPrefWidth());		
	}
	private void showScissor() {
		youV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\scissors.jpg");
    	youV.setFitHeight(opp.getPrefHeight());
    	youV.setFitWidth(opp.getPrefWidth());
	}
	
	private void addInstToButton() {
		if(ifRock0==null) {
			ifRock0=new ChoiceBox<String>();
		}
		ifRockArr.add(ifRock0);
		if(ifRock1==null) {
			ifRock1=new ChoiceBox<String>();
		}
		ifRockArr.add(ifRock1);
		if(ifRock2==null) {
			ifRock2=new ChoiceBox<String>();
		}
		ifRockArr.add(ifRock2);
		if(ifPaper0==null) {
			ifPaper0=new ChoiceBox<String>();
		}
		ifPaperArr.add(ifPaper0);
		if(ifPaper1==null) {
			ifPaper1=new ChoiceBox<String>();
		}
		ifPaperArr.add(ifPaper1);
		if(ifPaper2==null) {
			ifPaper2=new ChoiceBox<String>();
		}
		ifPaperArr.add(ifPaper2);
		if(ifScissor0==null) {
			ifScissor0=new ChoiceBox<String>();
		}
		ifScissorArr.add(ifScissor0);
		if(ifScissor1==null) {
			ifScissor1=new ChoiceBox<String>();
		}
		ifScissorArr.add(ifScissor1);
		if(ifScissor2==null) {
			ifScissor2=new ChoiceBox<String>();
		}
		ifScissorArr.add(ifScissor2);

		for(int i=0;i<3;i++) {
			ifRockArr.get(i).getItems().setAll("None","Rock to win", "Paper to win", "Scissor to win",
					"Rock to lose","Paper to lose","Scissor to loose","Rock for tie","Paper for tie", "Scissor for tie");	
			ifPaperArr.get(i).getItems().setAll("None","Rock to win", "Paper to win", "Scissor to win",
					"Rock to lose","Paper to lose","Scissor to loose","Rock for tie","Paper for tie", "Scissor for tie");	
			ifScissorArr.get(i).getItems().setAll("None","Rock to win", "Paper to win", "Scissor to win",
					"Rock to lose","Paper to lose","Scissor to loose","Rock for tie","Paper for tie", "Scissor for tie");	
			ifRockArr.get(i).setValue("None");
			ifPaperArr.get(i).setValue("None");
			ifScissorArr.get(i).setValue("None");
		}
		
	}


}
