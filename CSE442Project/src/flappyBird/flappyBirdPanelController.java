package flappyBird;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;


/**
 * Class includes functionality of buttons and scenes
 * 
 */
public class flappyBirdPanelController implements Initializable {

	//array that contains buttons as instructions
	private ArrayList<ChoiceBox<String>> buttonArray= new ArrayList<>();
	
	//8 buttons each represents an instruction
    @FXML
    private ChoiceBox<String> instruction0;
    @FXML
    private ChoiceBox<String> instruction1;
    @FXML
    private ChoiceBox<String> instruction2;
    @FXML
    private ChoiceBox<String> instruction3;
    @FXML
    private ChoiceBox<String> instruction4;
    @FXML
    private ChoiceBox<String> instruction5;
    @FXML
    private ChoiceBox<String> instruction6;
    @FXML
    private ChoiceBox<String> instruction7;
    
    /**
     * adding the buttons to array in sequence as instructions
     */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		buttonArray.add(instruction0);
		buttonArray.add(instruction1);
		buttonArray.add(instruction2);
		buttonArray.add(instruction3);
		buttonArray.add(instruction4);
		buttonArray.add(instruction5);
		buttonArray.add(instruction6);
		buttonArray.add(instruction7);
		for(int i=0;i<buttonArray.size();i++) {
			choiceMenuInit(buttonArray.get(i));
		}
	}
	/**
	 * give value of instructions to each button
	 * @param instruction current instruction that adds to button
	 */
	private void choiceMenuInit(ChoiceBox<String> instruction) {
		instruction.getItems().add("(none)");
		instruction.getItems().add("flap");
		instruction.getItems().add("end");
		instruction.getItems().add("set speed to 10");
		instruction.setValue("(none)");
		
	}

    
    
}
