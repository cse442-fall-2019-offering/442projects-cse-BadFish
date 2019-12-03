package rockPaperScissor;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class rpsGameController implements Initializable {	
@FXML    
private Button startgame;

@FXML
private Label t;

@FXML
private Label howtoplay;

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


private String lvalue  = "";

private String rvalue = "";

private boolean choicemadeleft = false; 

private boolean choicemaderight = false;

private boolean gameend = false;

private int round = 0;

public ComboBox<String> getleftbox(){
	return this.left;
}

public ComboBox<String> getrightbox(){
	return this.right;
}

public String getleftvalue() {
	return this.lvalue;
}

public String getrightvalue() {
	return this.rvalue;
}

public boolean getchoicemadeleft() {
	return this.choicemadeleft;
}

public boolean getchoicemaderight() {
	return this.choicemaderight;
}

public boolean checkifgameends() {
	return this.gameend;
}

public int getcurrentround() {
	return this.round;
}

public void setleftvalue(String l) {
	this.lvalue = l;
}

public void setrightvalue(String r) {
	this.rvalue = r;
}

public void setchoicemadeleft(boolean choiceleft) {
	this.choicemadeleft = choiceleft;
}

public void setchoicemaderight(boolean choiceright) {
	this.choicemaderight = choiceright;
}

public void setgameend(boolean b) {
	this.gameend = b;
}

public void setcurrentround(int r) {
	this.round = r;
}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		howtoplay.setText("Welcome to Rock Paper Scissors Game!\n"
				+ "From the command given on the top, choose the correct expression in the left\n"
				+ "and right choice box to match the state shown above.\n"
				+ "Ex: If the left image is rock, and the right image is paper.\n"
				+ "Rock cannot beat paper, so what you put in paper happens first, and what you put\n"
				+ "in rock hapeens later. Therefore, when you put 'if' in paper, 'else' in rock,\n"
				+ " you will find that this shows the order of if-else statement in java.");
		startgame.setOnAction(this::startrps);
        left.setOnAction(this::leftchosen);
        right.setOnAction(this::rightchosen);
		// TODO Auto-generated method stub	 		
		startscene.setVisible(true);
		left.setVisible(false);
		right.setVisible(false);
		left.getItems().setAll("if","else","a","char","String");
		right.getItems().setAll("else","if","int","a","a");
	}
	
	
	public void processresult() throws NullPointerException,IndexOutOfBoundsException {
    	if(checkresult()==-1) {
    		switch(round) {
    		case 1:
    			t.setText("Try again!\nWhen you initializes a new variable with type char:");
    			choicemadeleft = false;
    			choicemaderight = false;   
    			lvalue = "";
    			rvalue = "";
    			break;
    		case 2:
    			t.setText("Try again!\nWhen you initializes a new variable with type String:");
    			choicemadeleft = false;
    			choicemaderight = false;  
    			lvalue = "";
    			rvalue = "";
    			left.setValue(" ");
    			right.setValue(" ");
    			break;    			
    		case 3:	
    			t.setText("Try again!\nWhen you create a conditional statement:");
    			choicemadeleft = false;
    			choicemaderight = false;  
    			lvalue = "";
    			rvalue = "";
    			left.setValue(" ");
    			right.setValue(" ");
    			break;	
    			
    		default:
    			break;
    		
    		}
    	}
    	else if(checkresult()==1) {
    		switch(round) {
    		case 1:
    			check.setVisible(true);
    			t.setText("You got it!");
    			check.setVisible(false);
    			lrock.setVisible(false);
    			rscissor.setVisible(false);
    			choicemadeleft = false;
    			choicemaderight = false; 
    			lvalue = "";
    			rvalue = "";
    			round = round + 1;
    			break;
    			
    		case 2:
   			    check.setVisible(true);
   			    t.setText("You got it!");
   			    check.setVisible(false);
    			lscissor.setVisible(false);
    			rpaper.setVisible(false);  
    			choicemadeleft = false;
    			choicemaderight = false;
    			lvalue = "";
    			rvalue = "";
   			    round = round + 1;
   			    break;
   			    
    		case 3:
   			    check.setVisible(true);
   			    t.setText("Congratulations!You finished this game!");
   			    gameend = true;
    			left.setVisible(false);
    			right.setVisible(false);
    			lpaper.setVisible(false);
    			rscissor.setVisible(false); 
    			lvalue = "";
    			rvalue = "";
   			    break;
   			default:
   				break;
    		}
    		switch(round){
    		
    		case 2:
    			t.setText("Round 2: When you initializes a new variable with type String:");
    			lscissor.setVisible(true);
    			rpaper.setVisible(true);
    			left.setValue("");
    			right.setValue("");
    			break;
    		case 3:
    			if(gameend) {   			    
   			    break;}
    			else {
       			t.setText("Round 3:When you create a conditional statement:");
    			lpaper.setVisible(true);
    			rscissor.setVisible(true); 
    			left.setValue("");
    			right.setValue("");
    			break;
    			}
    			default:
    				break;
    		}
    	}		
	}
	
    public void leftchosen(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException {
    	choicemadeleft = true;
    	lvalue = left.getValue();
        processresult();
    }
	
    public void rightchosen(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException {
    	choicemaderight = true;
    	rvalue = right.getValue();
        processresult();
    }
	
	public void startrps(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException {		
		startscene.setVisible(false);
		startgame.setVisible(false);
		left.setVisible(true);
		right.setVisible(true);
		round = 1;
		t.setText("Round 1:When you initializes a new variable with type char:");
		lrock.setVisible(true);
		rscissor.setVisible(true);		
	}
	
	public int checkresult() throws NullPointerException,IndexOutOfBoundsException{
		switch(round) {
		case 1:
			if(choicemadeleft && choicemaderight){
				if(lvalue.equals("char")&& rvalue.equals("a")) {
					return 1;
				}
				else {
					return -1;
				}
			}
		    break;
		
		case 2:
			if(choicemadeleft && choicemaderight) {
				if(lvalue.equals("String")&& rvalue.equals("a")) {
					return 1;
				}
				else {
					return -1;
				}
			}	
			break;
		
		case 3:
			if(choicemadeleft && choicemaderight) {
				if(lvalue.equals("else")&& rvalue.equals("if")) {
					return 1;
				}
				else {
					return -1;
				}
			}
			break;
		default:
			break;
		}
		return 0;
		
	}
	

}