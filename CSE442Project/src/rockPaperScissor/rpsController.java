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

	//label of winning or losing
    @FXML
    private Label winState;
    //label of both moves
    @FXML
    private Label getWin;
    //pane to display your move
    @FXML
    private Pane you;
    //pane to display opponent's move
    @FXML
    private Pane opp;
    //button for start play game
    @FXML
    private Button play;
    //option of rock
    @FXML
    private RadioButton selRock;
    //toggle to get rock paper scissor option together, avoids overlap
    @FXML
    private ToggleGroup rpst;
    //option of paper
    @FXML
    private RadioButton selPaper;
    //option of scissor
    @FXML
    private RadioButton selScissor;

    @FXML
    private ChoiceBox<String> opp1;

    @FXML
    private ChoiceBox<String> wchWin1;

    @FXML
    private ChoiceBox<String> winState1;

    @FXML
    private ChoiceBox<String> opp2;

    @FXML
    private ChoiceBox<String> wchWin2;

    @FXML
    private ChoiceBox<String> winState2;

    @FXML
    private ChoiceBox<String> opp3;

    @FXML
    private ChoiceBox<String> wchWin3;

    @FXML
    private ChoiceBox<String> winState3;


    //winning state, win if 1, tie if 0, lose if -1, initialized to 9 as nothing happened yet
    private int winGame=9;
    
    private String rock="rock";
    private String paper="paper";
    private String scissor="scissor";
    private String win="win";
    private String lose="lose";
    private String tie="tie";

    //image view of opponenet's move
    private ImageView oppV;
    //image view of your move
    private ImageView youV;
    //your choice in integer form, 1:rock, 2, paper, 3:scissor
    private int uMove;
    //oppoenent's move in integer form
    private int oMove;
    //array that contains all instruction if opponent's move is paper/rock/scissor
    private ArrayList<ChoiceBox<String>> if1=new ArrayList<>();
    private ArrayList<ChoiceBox<String>> if2=new ArrayList<>();
    private ArrayList<ChoiceBox<String>> if3=new ArrayList<>();
    
    /**
     * initializing button function and instruction functionality
     */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		play.setOnAction(this::play);
		addInstToButton();
	}

	/**
	 * button functionality to start playing
	 * call multiple function to set up both player and opponent's move
	 * do nothing if player's move is not set
	 * @param event action event
	 */
    @FXML
    void play(ActionEvent event) {
    	if(!whichMove()) {
    		return;
    	}
    	oMove= (int)(Math.random()*99)%3+1;
    	getWin.setText(String.valueOf(uMove)+" "+String.valueOf(oMove));
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

    /**
     * checking which move player selected
     * @return true if any of the move is selected, false if nothing is selected
     */
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
	
	/**
	 * display rock image if player chose rock
	 */
	private void showRock() {
		youV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\rock.jpg");
    	youV.setFitHeight(opp.getPrefHeight());
    	youV.setFitWidth(opp.getPrefWidth());
	}
	/**
	 * display paper image if player chose paper
	 */
	private void showPaper() {
		youV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\paper.jpg");
    	youV.setFitHeight(opp.getPrefHeight());
    	youV.setFitWidth(opp.getPrefWidth());		
	}
	/**
	 * display scissor image if player chose scissor
	 */
	private void showScissor() {
		youV=new ImageView("file:///C:\\Users\\yongh\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\scissors.jpg");
    	youV.setFitHeight(opp.getPrefHeight());
    	youV.setFitWidth(opp.getPrefWidth());
	}
	/**
	 * add buttons to proper array
	 * attach functionalities to each buttons
	 */
	private void addInstToButton() {
		if1.add(opp1);
		if1.add(wchWin1);
		if1.add(winState1);
		if2.add(opp2);
		if2.add(wchWin2);
		if2.add(winState2);
		if3.add(opp3);
		if3.add(wchWin3);
		if3.add(winState3);
		if1.get(0).getItems().setAll("none", rock, paper, scissor);
		if2.get(0).getItems().setAll("none", rock, paper, scissor);
		if3.get(0).getItems().setAll("none", rock, paper, scissor);
		if1.get(1).getItems().setAll("none", rock, paper, scissor);
		if2.get(1).getItems().setAll("none", rock, paper, scissor);
		if3.get(1).getItems().setAll("none", rock, paper, scissor);
		if1.get(2).getItems().setAll("none", win, lose, tie);
		if2.get(2).getItems().setAll("none", win, lose, tie);
		if3.get(2).getItems().setAll("none", win, lose, tie);
		for(int i=0;i<if1.size();i++) {
			if1.get(i).setValue("none");
			if2.get(i).setValue("none");
			if3.get(i).setValue("none");
		}
	}
	/**
	 * checking the moves and instructions selected
	 * set winGame to 1, 0, or -1 for checking winning state
	 */
	private void checkStates() {
		switch(oMove) {
			case 1:
				if(if1.get(0).getValue()!=rock&&if2.get(0).getValue()!=rock&&if3.get(0).getValue()!=rock) {
					break;
				}
				if(if1.get(0).getValue()==rock) {
					if(uMove==1) {
						if(if1.get(1).getValue()==rock) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
					else if(uMove==2) {
						if(if1.get(1).getValue()==paper) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
					else if(uMove==3) {
						if(if1.get(1).getValue()==scissor) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
				}
				break;
			case 2:
				if(if1.get(0).getValue()!=paper&&if2.get(0).getValue()!=paper&&if3.get(0).getValue()!=paper) {
					break;
				}
				if(if1.get(0).getValue()==rock) {
					if(uMove==1) {
						if(if1.get(1).getValue()==rock) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
					else if(uMove==2) {
						if(if1.get(1).getValue()==paper) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
					else if(uMove==3) {
						if(if1.get(1).getValue()==scissor) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
				}
				break;
			case 3:
				if(if1.get(0).getValue()!=scissor&&if2.get(0).getValue()!=scissor&&if3.get(0).getValue()!=scissor) {
					break;
				}
				if(if1.get(0).getValue()==rock) {
					if(uMove==1) {
						if(if1.get(1).getValue()==rock) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
					else if(uMove==2) {
						if(if1.get(1).getValue()==paper) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
					else if(uMove==3) {
						if(if1.get(1).getValue()==scissor) {
							if(if1.get(2).getValue()==win||if2.get(2).getValue()==win||if3.get(2).getValue()==win) {
								winGame=1;
							}
							else if(if1.get(2).getValue()==lose||if2.get(2).getValue()==lose||if3.get(2).getValue()==lose) {
								winGame=-1;
							}
							else if(if1.get(2).getValue()==tie||if2.get(2).getValue()==tie||if3.get(2).getValue()==tie) {
								winGame=0;
							}
						}
					}
				}
				break;
		}
	}
	
	
	/**
	 * checking whether player is winning, losing or a tie using winGame
	 * print nothing happened if instruction is not set properly
	 */
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
