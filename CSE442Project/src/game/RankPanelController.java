package game;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RankPanelController {

	@FXML
	private Button back;

	@FXML
	private Label game1;
	
	@FXML
	private Label game2;

	@FXML
	private Label game3;

	@FXML
	private Label game1First;
	
	@FXML
	private Label game1Second;
	
	@FXML
	private Label game1Third;
	
	@FXML
	private Label game2First;
	
	@FXML
	private Label game2Second;
	
	@FXML
	private Label game2Third;

	@FXML
	private Label game3First;

	@FXML
	private Label game3Second;

	@FXML
	private Label game3Third;
	
	@FXML
	void initialize() {
		
		back.setOnAction(this::back);	
		
		ArrayList<String> rank1 = generateRank(1);
		ArrayList<String> rank2 = generateRank(2);
		ArrayList<String> rank3 = generateRank(3);
		
		if(rank1.size()==1) {
			game1First.setText(rank1.get(0));
		}
		else if(rank1.size()==2) {
			game1First.setText(rank1.get(0));
			game1Second.setText(rank1.get(1));
		}
		else if(rank1.size()==3) {
			game1First.setText(rank1.get(0));
			game1Second.setText(rank1.get(1));
			game1Third.setText(rank1.get(2));
		}
		else {
			
		}
		
		if(rank2.size()==1) {
			game2First.setText(rank2.get(0));
		}
		else if(rank2.size()==2) {
			game2First.setText(rank2.get(0));
			game2Second.setText(rank2.get(1));
		}
		else if(rank2.size()==3) {
			game2First.setText(rank2.get(0));
			game2Second.setText(rank2.get(1));
			game2Third.setText(rank2.get(2));
		}
		else {
			
		}
		
		if(rank3.size()==1) {
			game3First.setText(rank3.get(0));
		}
		else if(rank3.size()==2) {
			game3First.setText(rank3.get(0));
			game3Second.setText(rank3.get(1));
		}
		else if(rank3.size()==3) {
			game3First.setText(rank3.get(0));
			game3Second.setText(rank3.get(1));
			game3Third.setText(rank3.get(2));
		}
		else {
			
		}
		
	}
	
	@FXML
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
	
	public ArrayList<String> generateRank(int gameNumber){
		ArrayList<String> retVal = new ArrayList<String>();
		
		DataAccess x = new DataAccess();
		
		int maxPlayers = 3;
		
		ArrayList<Profile> inProgressPlayers = new ArrayList<Profile>();
		
		for(int i=0; i<maxPlayers; i++) {
			if(x.getProfile(i).getGameStatus(gameNumber)) {
				inProgressPlayers.add(x.getProfile(i));
			}
		}
		
		if(inProgressPlayers.size()==1) {
			retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
			return retVal;
		}
		if(inProgressPlayers.size()==2) {
			if(inProgressPlayers.get(0).getGameScore(gameNumber)>inProgressPlayers.get(1).getGameScore(gameNumber)){
				retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
				retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
				return retVal;
			}
			else {
				retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
				retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
				return retVal;
			}
		}
		if(inProgressPlayers.size()==3) {
			if((inProgressPlayers.get(0).getGameScore(gameNumber)>=inProgressPlayers.get(1).getGameScore(gameNumber))&&(inProgressPlayers.get(0).getGameScore(gameNumber)>=inProgressPlayers.get(2).getGameScore(gameNumber))){
				retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
				if((inProgressPlayers.get(1).getGameScore(gameNumber)>=inProgressPlayers.get(2).getGameScore(gameNumber))) {
					retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
					retVal.add(inProgressPlayers.get(2).getNickName()+" "+Integer.toString(inProgressPlayers.get(2).getGameScore(gameNumber)));
					return retVal;
				}
				else {
					retVal.add(inProgressPlayers.get(2).getNickName()+" "+Integer.toString(inProgressPlayers.get(2).getGameScore(gameNumber)));
					retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
					return retVal;
				}
			}
			else if((inProgressPlayers.get(1).getGameScore(gameNumber)>=inProgressPlayers.get(0).getGameScore(gameNumber))&&(inProgressPlayers.get(1).getGameScore(gameNumber)>=inProgressPlayers.get(2).getGameScore(gameNumber))){
				retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
				if((inProgressPlayers.get(0).getGameScore(gameNumber)>=inProgressPlayers.get(2).getGameScore(gameNumber))) {
					retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
					retVal.add(inProgressPlayers.get(2).getNickName()+" "+Integer.toString(inProgressPlayers.get(2).getGameScore(gameNumber)));
					return retVal;
				}
				else {
					retVal.add(inProgressPlayers.get(2).getNickName()+" "+Integer.toString(inProgressPlayers.get(2).getGameScore(gameNumber)));
					retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
					return retVal;
				}
			}
			else {
				retVal.add(inProgressPlayers.get(2).getNickName()+" "+Integer.toString(inProgressPlayers.get(2).getGameScore(gameNumber)));
				if((inProgressPlayers.get(0).getGameScore(gameNumber)>=inProgressPlayers.get(1).getGameScore(gameNumber))) {
					retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
					retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
					return retVal;
				}
				else {
					retVal.add(inProgressPlayers.get(1).getNickName()+" "+Integer.toString(inProgressPlayers.get(1).getGameScore(gameNumber)));
					retVal.add(inProgressPlayers.get(0).getNickName()+" "+Integer.toString(inProgressPlayers.get(0).getGameScore(gameNumber)));
					return retVal;
				}
			}
		}
		return retVal;	
	}
}