package chopsticks;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ChopsticksController implements Initializable{
	
	private Image finger0 = new Image((new File("/Users/markbalazon/git/442projects-cse-BadFish/CSE442Project/Images/fingers/finger0.png")).toURI().toString());
	
	private Image finger1 = new Image((new File("/Users/markbalazon/git/442projects-cse-BadFish/CSE442Project/Images/fingers/one.png")).toURI().toString());
	
	private Image finger2 = new Image((new File("/Users/markbalazon/git/442projects-cse-BadFish/CSE442Project/Images/fingers/two.png")).toURI().toString());
	
	private Image finger3 = new Image((new File("/Users/markbalazon/git/442projects-cse-BadFish/CSE442Project/Images/fingers/three.png")).toURI().toString());
	
	private Image finger4 = new Image((new File("/Users/markbalazon/git/442projects-cse-BadFish/CSE442Project/Images/fingers/four.png")).toURI().toString());
	
	private Image finger5 = new Image((new File("/Users/markbalazon/git/442projects-cse-BadFish/CSE442Project/Images/fingers/five.png")).toURI().toString());

	@FXML
	private Label Turn;
	
	@FXML
    private Label b_left_dead;

    @FXML
	private Label b_right_dead;
    
    @FXML
    private Label a_left_dead;

    @FXML
	private Label a_right_dead;
	
	@FXML
    private ImageView p2_left_image;

    @FXML
    private ChoiceBox<String> b_compare;

    @FXML
    private ChoiceBox<String> a_compare;

    @FXML
    private Button b_hit;

    @FXML
    private TextField a_total;

//    @FXML
//    private ChoiceBox<String> p1_hand_total;

    @FXML
    private ImageView p1_left_image;

//    @FXML
//    private ComboBox<String> b_action_drop_down;

    @FXML
    private ChoiceBox<String> a_p1_hand;

//    @FXML
//    private ComboBox<String> a_action_drop_down;

    @FXML
    private TextField b_total;

    @FXML
    private ImageView p2_right_image;

    @FXML
    private ChoiceBox<String> b_p1_hand;

    @FXML
    private ImageView p1_right_image;

    @FXML
    private Button a_hit;

    @FXML
    private ChoiceBox<String> b_p2_hand;

//    @FXML
//    private ChoiceBox<String> p2_hand_total;

    @FXML
    private ChoiceBox<String> a_p2_hand;
    
    public int p1_left_count = 1;
    public int p1_right_count = 1;
    
    public int p2_left_count = 1;
    public int p2_right_count = 1;
    
    public Boolean p1LeftAlive = true;
    public Boolean p1RightAlive = true;
    
    public Boolean p2LeftAlive = true;
    public Boolean p2RightAlive = true;
    
    private Boolean p1Turn = true;
    
    										// P1 implementation getters
    public String getP1handChoice(){
    	return this.a_p1_hand.getValue();
    }
    
    public String getP1hitHandChoice(){
    	return this.a_p2_hand.getValue();
    }
    
    public String getP1CompareChoice(){
    	return this.a_compare.getValue();
    }
    
    public String getP1total() {
    	return this.a_total.getText();
    }
    


    
    										//P2 implementation getters
    public String getP2handChoice(){
    	return this.b_p2_hand.getValue();
    }
    
    public String getP2hitHandChoice(){
    	return this.b_p1_hand.getValue();
    }
    
    public String getP2CompareChoice(){
    	return this.b_compare.getValue();
    }
    
    public String getP2total() {
    	return this.b_total.getText();
    }
    

    
    
    
    										//init
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		this.a_p1_hand.getItems().setAll("P1 left hand", "P1 right hand");
    	this.a_p2_hand.getItems().setAll("P2 left hand", "P2 right hand");
    	this.a_compare.getItems().setAll(">", "<", "<=", ">=", "==");    	
    	//init p2 implementation
    	this.b_p2_hand.getItems().setAll("P2 left hand", "P2 right hand");
    	this.b_p1_hand.getItems().setAll("P1 left hand", "P1 right hand");
    	this.b_compare.getItems().setAll(">", "<", "<=", ">=", "==");
    	
    	this.p1_left_image.setImage(finger1);
    	this.p1_right_image.setImage(finger1);
    	
    	this.p2_left_image.setImage(finger1);
    	this.p2_right_image.setImage(finger1);
    	
		
	}
	
	@FXML
	public void p1Hit(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException {
		if(p1Turn == false) {
			return;
		}
		
		if(p2LeftAlive && p2RightAlive) {
		
    	String hittingHand = getP1handChoice();
    	String handToHit = getP1hitHandChoice();
    	String compare = getP1CompareChoice();
    	int textFieldValue = Integer.parseInt(getP1total());
    	
    	if(compare == "<") {
    		if(hittingHand == "P1 left hand" && handToHit == "P2 left hand") {
    			if(p1_left_count + p2_left_count < textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				b_left_dead.setText("Dead");
    				p2LeftAlive = false;
    			}else {		
    				p2_left_count = p1_left_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 right hand" && handToHit == "P2 left hand") {
    			if(p1_right_count + p2_left_count < textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {		
    				p2_left_count = p1_right_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 left hand" && handToHit == "P2 right hand") {
    			if(p1_left_count + p2_right_count < textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				p2_right_count = p1_left_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count < textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    				
    			}else {
    				p2_right_count = p1_right_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    			
    		}
    	}
    	else if(compare == ">") {
    		if(hittingHand == "P1 left hand" && handToHit == "P2 left hand") {
    			if(p1_left_count + p2_left_count > textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_left_count + p2_right_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 right hand" && handToHit == "P2 left hand") {
    			if(p1_right_count + p2_left_count > textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_right_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 left hand" && handToHit == "P2 right hand") {
    			if(p1_left_count + p2_right_count > textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_left_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count > textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_right_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    		
    	}
    	else if(compare == "<=") {
    		if(hittingHand == "P1 left hand" && handToHit == "P2 left hand") {
    			if(p1_left_count + p2_left_count <= textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_left_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 right hand" && handToHit == "P2 left hand") {
    			if(p1_right_count + p2_left_count <= textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_right_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 left hand" && handToHit == "P2 right hand") {
    			if(p1_left_count + p2_right_count <= textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_left_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count <= textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_right_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    	}
    	else if(compare == ">=") {
    		if(hittingHand == "P1 left hand" && handToHit == "P2 left hand") {
    			if(p1_left_count + p2_left_count >= textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_left_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 right hand" && handToHit == "P2 left hand") {
    			if(p1_right_count + p2_left_count >= textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_right_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 left hand" && handToHit == "P2 right hand") {
    			if(p1_left_count + p2_right_count >= textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_left_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count >= textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_right_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    	}
    	else if(compare == "==") {
    		if(hittingHand == "P1 left hand" && handToHit == "P2 left hand") {
    			if(p1_left_count + p2_left_count == textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_left_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 right hand" && handToHit == "P2 left hand") {
    			if(p1_right_count + p2_left_count == textFieldValue) {
    				this.p2_left_image.setImage(finger0);
    				p2LeftAlive = false;
    				b_left_dead.setText("Dead");
    			}else {
    				
    				p2_left_count = p1_right_count + p2_left_count;
    				if(p2_left_count == 2) {
    					this.p2_left_image.setImage(finger2);
    				}
    				if(p2_left_count == 3) {
    					this.p2_left_image.setImage(finger3);
    				}
    				if(p2_left_count == 4) {
    					this.p2_left_image.setImage(finger4);
    				}
    				if(p2_left_count == 5) {
    					this.p2_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P1 left hand" && handToHit == "P2 right hand") {
    			if(p1_left_count + p2_right_count == textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_left_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count == textFieldValue) {
    				this.p2_right_image.setImage(finger0);
    				p2RightAlive = false;
    				b_right_dead.setText("Dead");
    			}else {
    				
    				p2_right_count = p1_right_count + p2_right_count;
    				if(p2_right_count == 2) {
    					this.p2_right_image.setImage(finger2);
    				}
    				if(p2_right_count == 3) {
    					this.p2_right_image.setImage(finger3);
    				}
    				if(p2_right_count == 4) {
    					this.p2_right_image.setImage(finger4);
    				}
    				if(p2_right_count == 5) {
    					this.p2_right_image.setImage(finger5);
    				}
    			}
    		}
    	}
		
    	p1Turn = false;
    	Turn.setText("Player 2 Turn");
		}
		else {
			Turn.setText("Player 1 Wins!");
			return;
		}
    }
	
	@FXML
	public void p2Hit(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException {
		if(p1Turn == true) {
			return;
		}
		if(p1LeftAlive && p1RightAlive) {
		String hittingHand = getP2handChoice();
    	String handToHit = getP2hitHandChoice();
    	String compare = getP2CompareChoice();
    	int textFieldValue = Integer.parseInt(getP2total());
    	
    	if(compare == "<") {
    		if(hittingHand == "P2 left hand" && handToHit == "P1 left hand") {
    			if(p2_left_count + p1_left_count < textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");
    			}else {		
    				p1_left_count = p2_left_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 right hand" && handToHit == "P1 left hand") {
    			if(p2_right_count + p1_left_count < textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {		
    				p1_left_count = p2_right_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 left hand" && handToHit == "P1 right hand") {
    			if(p2_left_count + p1_right_count < textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				p1_right_count = p2_left_count + p1_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p2_right_count + p1_right_count < textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    				
    			}else {
    				p1_right_count = p2_right_count + p1_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    			
    		}
    	}
    	else if(compare == ">") {
    		if(hittingHand == "P2 left hand" && handToHit == "P1 left hand") {
    			if(p2_left_count + p1_left_count > textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p2_left_count + p1_right_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 right hand" && handToHit == "P1 left hand") {
    			if(p2_right_count + p1_left_count > textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p2_right_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 left hand" && handToHit == "P1 right hand") {
    			if(p2_left_count + p1_right_count > textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p2_left_count + p1_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p2_right_count + p1_right_count > textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p1_right_count + p2_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    		
    	}
    	else if(compare == "<=") {
    		if(hittingHand == "P2 left hand" && handToHit == "P1 left hand") {
    			if(p2_left_count + p1_left_count <= textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p2_left_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 right hand" && handToHit == "P1 left hand") {
    			if(p2_right_count + p1_left_count <= textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p2_right_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 left hand" && handToHit == "P1 right hand") {
    			if(p2_left_count + p1_right_count <= textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p2_left_count + p1_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p2_right_count + p1_right_count <= textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p1_right_count + p2_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    	}
    	else if(compare == ">=") {
    		if(hittingHand == "P2 left hand" && handToHit == "P1 left hand") {
    			if(p2_left_count + p1_left_count >= textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p1_left_count + p2_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 right hand" && handToHit == "P1 left hand") {
    			if(p2_right_count + p1_left_count >= textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p2_right_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 left hand" && handToHit == "P1 right hand") {
    			if(p2_left_count + p1_right_count >= textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p2_left_count + p1_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count >= textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p1_right_count + p2_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    	}
    	else if(compare == "==") {
    		if(hittingHand == "P2 left hand" && handToHit == "P1 left hand") {
    			if(p2_left_count + p1_left_count == textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p1_left_count + p2_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 right hand" && handToHit == "P1 left hand") {
    			if(p2_right_count + p1_left_count == textFieldValue) {
    				this.p1_left_image.setImage(finger0);
    				p1LeftAlive = false;
    				a_left_dead.setText("Dead");

    			}else {
    				
    				p1_left_count = p2_right_count + p1_left_count;
    				if(p1_left_count == 2) {
    					this.p1_left_image.setImage(finger2);
    				}
    				if(p1_left_count == 3) {
    					this.p1_left_image.setImage(finger3);
    				}
    				if(p1_left_count == 4) {
    					this.p1_left_image.setImage(finger4);
    				}
    				if(p1_left_count == 5) {
    					this.p1_left_image.setImage(finger5);
    				}
    			}
    		}
    		else if(hittingHand == "P2 left hand" && handToHit == "P1 right hand") {
    			if(p2_left_count + p1_right_count == textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p2_left_count + p1_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    		else {
    			if(p1_right_count + p2_right_count == textFieldValue) {
    				this.p1_right_image.setImage(finger0);
    				p1RightAlive = false;
    				a_right_dead.setText("Dead");

    			}else {
    				
    				p1_right_count = p1_right_count + p2_right_count;
    				if(p1_right_count == 2) {
    					this.p1_right_image.setImage(finger2);
    				}
    				if(p1_right_count == 3) {
    					this.p1_right_image.setImage(finger3);
    				}
    				if(p1_right_count == 4) {
    					this.p1_right_image.setImage(finger4);
    				}
    				if(p1_right_count == 5) {
    					this.p1_right_image.setImage(finger5);
    				}
    			}
    		}
    	}
    	p1Turn = true;
    	Turn.setText("Player 1 Turn");
		}else {
			Turn.setText("Player 2 Wins!");
			return;
		}
    }
    
}
