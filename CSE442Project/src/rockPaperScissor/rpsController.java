package rockPaperScissor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
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
    private Label winState;
    
    @FXML
    private Label getWin;
    
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
    
    private int winGame=9;
    
    private String state0="Rock to win";
    private String state1="Paper to win";
    private String state2="Scissor to win";
    private String state3="Rock to lose";
    private String state4="Paper to lose";
    private String state5="Scissor to lose";
    private String state6="Rock for the tie";
    private String state7="Paper for the tie";
    private String state8="Scissor for the tie";

    
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
    	getWin.setText(String.valueOf(uMove)+" "+String.valueOf(oMove));
    	Random rand= new Random();
    	oMove= (int)(Math.random()*99)%3+1;
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
    	checkStates();
    	isWin();
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
		ifRockArr.add(ifRock0);
		ifRockArr.add(ifRock1);
		ifRockArr.add(ifRock2);
		ifPaperArr.add(ifPaper0);
		ifPaperArr.add(ifPaper1);
		ifPaperArr.add(ifPaper2);
		ifScissorArr.add(ifScissor0);
		ifScissorArr.add(ifScissor1);
		ifScissorArr.add(ifScissor2);

		for(int i=0;i<3;i++) {
			ifRockArr.get(i).getItems().setAll("None",state0, state1, state2, state3, state4
					,state5,state6,state7,state8);	
			ifPaperArr.get(i).getItems().setAll("None",state0, state1, state2, state3, state4
					,state5,state6,state7,state8);	
			ifScissorArr.get(i).getItems().setAll("None",state0, state1, state2, state3, state4
					,state5,state6,state7,state8);	
			ifRockArr.get(i).setValue("None");
			ifPaperArr.get(i).setValue("None");
			ifScissorArr.get(i).setValue("None");
		}
		
	}

	private void checkStates() {
		switch(oMove) {
		case 1:
			for(int i=0;i<ifRockArr.size();i++) {
				switch(uMove) {
				case 1:
					if(ifRockArr.get(i).getValue()==state0) {
						winGame=1;
					}
					else if(ifRockArr.get(i).getValue()==state3) {
						winGame=-1;
					}
					else if(ifRockArr.get(i).getValue()==state6) {
						winGame=0;
					}
					else winGame=9;
					break;
				case 2:
					if(ifPaperArr.get(i).getValue()==state1) {
						winGame=1;
					}
					else if(ifPaperArr.get(i).getValue()==state4) {
						winGame=-1;
					}
					else if(ifPaperArr.get(i).getValue()==state7) {
						winGame=0;
					}
					else winGame=9;
					break;
				case 3:
					if(ifScissorArr.get(i).getValue()==state2) {
						winGame=1;
					}
					else if(ifScissorArr.get(i).getValue()==state5) {
						winGame=-1;
					}
					else if(ifScissorArr.get(i).getValue()==state8) {
						winGame=0;
					}
					else winGame=9;
					break;
				}
			}
			break;
		case 2:
			for(int i=0;i<ifRockArr.size();i++) {
				switch(uMove) {
				case 1:
					if(ifPaperArr.get(i).getValue()==state0) {
						winGame=1;
					}
					else if(ifPaperArr.get(i).getValue()==state3) {
						winGame=-1;
					}
					else if(ifPaperArr.get(i).getValue()==state6) {
						winGame=0;
					}
					else winGame=9;
					break;
				case 2:
					if(ifPaperArr.get(i).getValue()==state1) {
						winGame=1;
					}
					else if(ifPaperArr.get(i).getValue()==state4) {
						winGame=-1;
					}
					else if(ifPaperArr.get(i).getValue()==state7) {
						winGame=0;
					}
					else winGame=9;
					break;
				case 3:
					if(ifPaperArr.get(i).getValue()==state2) {
						winGame=1;
					}
					else if(ifPaperArr.get(i).getValue()==state5) {
						winGame=-1;
					}
					
					else if(ifPaperArr.get(i).getValue()==state8) {
						winGame=0;
					}
					else winGame=9;
					break;
				}
			}
			break;
		case 3:
			for(int i=0;i<ifRockArr.size();i++) {
				switch(uMove) {
				case 1:
					if(ifScissorArr.get(i).getValue()==state0) {
						winGame=1;
					}
					else if(ifScissorArr.get(i).getValue()==state3) {
						winGame=-1;
					}
					else if(ifScissorArr.get(i).getValue()==state6) {
						winGame=0;
					}
					else winGame=9;
					break;
				case 2:
					if(ifScissorArr.get(i).getValue()==state1) {
						winGame=1;
					}
					else if(ifScissorArr.get(i).getValue()==state4) {
						winGame=-1;
					}
					else if(ifScissorArr.get(i).getValue()==state7) {
						winGame=0;
					}
					else winGame=9;
					break;
				case 3:
					if(ifScissorArr.get(i).getValue()==state2) {
						winGame=1;
					}
					else if(ifScissorArr.get(i).getValue()==state5) {
						winGame=-1;
					}
					else if(ifScissorArr.get(i).getValue()==state8) {
						winGame=0;
					}
					else winGame=9;
					break;
				}
			}
			break;
			
		}
	}
	
	private void isWin() {
		if(winGame==1) {
			winState.setText("You Win!");
		}
		else if(winGame==-1) {
			winState.setText("You Lose!");
			
		}
		else if(winGame==0) {
			winState.setText("It's a tie...!");
		}
		else winState.setText("Nothing Happened...");
		
	}

}
