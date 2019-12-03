package stacker;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.animation.*;

public class StackerGameController implements Initializable {
	
	
	@FXML
	private Button hitButton;
	
	@FXML    
	private Button button;

	@FXML
	private Label instruction;
	
	@FXML
	private ImageView zero0;
	
	@FXML
	private ImageView one0;
	
	@FXML
	private ImageView two0;
	
	@FXML
	private ImageView three0;
	
	@FXML
	private ImageView four0;
	
	@FXML
	private ImageView five0;
	
	@FXML
	private ImageView six0;
	
	@FXML
	private ImageView seven0;
	
	@FXML
	private ImageView eight0;
	
	@FXML
	private ImageView zero1;
	
	@FXML
	private ImageView one1;
	
	@FXML
	private ImageView two1;
	
	@FXML
	private ImageView three1;
	
	@FXML
	private ImageView four1;
	
	@FXML
	private ImageView five1;
	
	@FXML
	private ImageView six1;
	
	@FXML
	private ImageView seven1;
	
	@FXML
	private ImageView eight1;
	
	@FXML
	private ImageView zero2;
	
	@FXML
	private ImageView one2;
	
	@FXML
	private ImageView two2;
	
	@FXML
	private ImageView three2;
	
	@FXML
	private ImageView four2;
	
	@FXML
	private ImageView five2;
	
	@FXML
	private ImageView six2;
	
	@FXML
	private ImageView seven2;
	
	@FXML
	private ImageView eight2;
	
	@FXML
	private ImageView zero3;
	
	@FXML
	private ImageView one3;
	
	@FXML
	private ImageView two3;
	
	@FXML
	private ImageView three3;
	
	@FXML
	private ImageView four3;
	
	@FXML
	private ImageView five3;
	
	@FXML
	private ImageView six3;
	
	@FXML
	private ImageView seven3;
	
	@FXML
	private ImageView eight3;
	
	@FXML
	private ImageView zero4;
	
	@FXML
	private ImageView one4;
	
	@FXML
	private ImageView two4;
	
	@FXML
	private ImageView three4;
	
	@FXML
	private ImageView four4;
	
	@FXML
	private ImageView five4;
	
	@FXML
	private ImageView six4;
	
	@FXML
	private ImageView seven4;
	
	@FXML
	private ImageView eight4;
	
	@FXML
	private ImageView zero5;
	
	@FXML
	private ImageView one5;
	
	@FXML
	private ImageView two5;
	
	@FXML
	private ImageView three5;
	
	@FXML
	private ImageView four5;
	
	@FXML
	private ImageView five5;
	
	@FXML
	private ImageView six5;
	
	@FXML
	private ImageView seven5;
	
	@FXML
	private ImageView eight5;
	
	@FXML
	private ImageView zero6;
	
	@FXML
	private ImageView one6;
	
	@FXML
	private ImageView two6;
	
	@FXML
	private ImageView three6;
	
	@FXML
	private ImageView four6;
	
	@FXML
	private ImageView five6;
	
	@FXML
	private ImageView six6;
	
	@FXML
	private ImageView seven6;
	
	@FXML
	private ImageView eight6;
	
	@FXML
	private ImageView zero7;
	
	@FXML
	private ImageView one7;
	
	@FXML
	private ImageView two7;
	
	@FXML
	private ImageView three7;
	
	@FXML
	private ImageView four7;
	
	@FXML
	private ImageView five7;
	
	@FXML
	private ImageView six7;
	
	@FXML
	private ImageView seven7;
	
	@FXML
	private ImageView eight7;
	
	@FXML
	private ImageView zero8;
	
	@FXML
	private ImageView one8;
	
	@FXML
	private ImageView two8;
	
	@FXML
	private ImageView three8;
	
	@FXML
	private ImageView four8;
	
	@FXML
	private ImageView five8;
	
	@FXML
	private ImageView six8;
	
	@FXML
	private ImageView seven8;
	
	@FXML
	private ImageView eight8;
	
	@FXML
	private ImageView zero9;
	
	@FXML
	private ImageView one9;
	
	@FXML
	private ImageView two9;
	
	@FXML
	private ImageView three9;
	
	@FXML
	private ImageView four9;
	
	@FXML
	private ImageView five9;
	
	@FXML
	private ImageView six9;
	
	@FXML
	private ImageView seven9;
	
	@FXML
	private ImageView eight9;
	
	@FXML
	private ImageView zero10;
	
	@FXML
	private ImageView one10;
	
	@FXML
	private ImageView two10;
	
	@FXML
	private ImageView three10;
	
	@FXML
	private ImageView four10;
	
	@FXML
	private ImageView five10;
	
	@FXML
	private ImageView six10;
	
	@FXML
	private ImageView seven10;
	
	@FXML
	private ImageView eight10;
	
	@FXML
	private ImageView zero11;
	
	@FXML
	private ImageView one11;
	
	@FXML
	private ImageView two11;
	
	@FXML
	private ImageView three11;
	
	@FXML
	private ImageView four11;
	
	@FXML
	private ImageView five11;
	
	@FXML
	private ImageView six11;
	
	@FXML
	private ImageView seven11;
	
	@FXML
	private ImageView eight11;
	
    private Timeline timeline;
    private ImageView grid[][] = new ImageView[12][9];
	private Integer layer = 0;
    private Boolean check[] = new Boolean[9];
    private Boolean base[] = new Boolean[9];
    private Integer head;
    private Integer tail;

    
	@Override
	public void initialize(URL location, ResourceBundle resources) {   
		
        timeline = new Timeline();

        for(int i=0; i<check.length; i++) {
        	check[i] = false;
        	base [i] = true;
        }
	
		instruction.setText("Instructions Go Here:");
		button.setOnAction(arg0 -> {
			try {
				buttonFunction(arg0);
			} catch (NullPointerException | IndexOutOfBoundsException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		
		grid[0][0] = zero11;
		grid[0][1] = one11;
		grid[0][2] = two11;
		grid[0][3] = three11;
		grid[0][4] = four11;
		grid[0][5] = five11;
		grid[0][6] = six11;
		grid[0][7] = seven11;
		grid[0][8] = eight11;
		grid[1][0] = zero10;
		grid[1][1] = one10;
		grid[1][2] = two10;
		grid[1][3] = three10;
		grid[1][4] = four10;
		grid[1][5] = five10;
		grid[1][6] = six10;
		grid[1][7] = seven10;
		grid[1][8] = eight10;
		grid[2][0] = zero9;
		grid[2][1] = one9;
		grid[2][2] = two9;
		grid[2][3] = three9;
		grid[2][4] = four9;
		grid[2][5] = five9;
		grid[2][6] = six9;
		grid[2][7] = seven9;
		grid[2][8] = eight9;
		grid[3][0] = zero8;
		grid[3][1] = one8;
		grid[3][2] = two8;
		grid[3][3] = three8;
		grid[3][4] = four8;
		grid[3][5] = five8;
		grid[3][6] = six8;
		grid[3][7] = seven8;
		grid[3][8] = eight8;
		grid[4][0] = zero7;
		grid[4][1] = one7;
		grid[4][2] = two7;
		grid[4][3] = three7;
		grid[4][4] = four7;
		grid[4][5] = five7;
		grid[4][6] = six7;
		grid[4][7] = seven7;
		grid[4][8] = eight7;
		grid[5][0] = zero6;
		grid[5][1] = one6;
		grid[5][2] = two6;
		grid[5][3] = three6;
		grid[5][4] = four6;
		grid[5][5] = five6;
		grid[5][6] = six6;
		grid[5][7] = seven6;
		grid[5][8] = eight6;
		grid[6][0] = zero5;
		grid[6][1] = one5;
		grid[6][2] = two5;
		grid[6][3] = three5;
		grid[6][4] = four5;
		grid[6][5] = five5;
		grid[6][6] = six5;
		grid[6][7] = seven5;
		grid[6][8] = eight5;
		grid[7][0] = zero4;
		grid[7][1] = one4;
		grid[7][2] = two4;
		grid[7][3] = three4;
		grid[7][4] = four4;
		grid[7][5] = five4;
		grid[7][6] = six4;
		grid[7][7] = seven4;
		grid[7][8] = eight4;
		grid[8][0] = zero3;
		grid[8][1] = one3;
		grid[8][2] = two3;
		grid[8][3] = three3;
		grid[8][4] = four3;
		grid[8][5] = five3;
		grid[8][6] = six3;
		grid[8][7] = seven3;
		grid[8][8] = eight3;
		grid[9][0] = zero2;
		grid[9][1] = one2;
		grid[9][2] = two2;
		grid[9][3] = three2;
		grid[9][4] = four2;
		grid[9][5] = five2;
		grid[9][6] = six2;
		grid[9][7] = seven2;
		grid[9][8] = eight2;
		grid[10][0] = zero1;
		grid[10][1] = one1;
		grid[10][2] = two1;
		grid[10][3] = three1;
		grid[10][4] = four1;
		grid[10][5] = five1;
		grid[10][6] = six1;
		grid[10][7] = seven1;
		grid[10][8] = eight1;
		grid[11][0] = zero0;
		grid[11][1] = one0;
		grid[11][2] = two0;
		grid[11][3] = three0;
		grid[11][4] = four0;
		grid[11][5] = five0;
		grid[11][6] = six0;
		grid[11][7] = seven0;
		grid[11][8] = eight0;
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<12; j++) {
				grid[j][i].setVisible(false);
			}
		}

		for(int i=0; i<5; i++) {
			grid[layer][i].setVisible(true);
			check[i] = true;
		}

		move(5);
		
	}
	
	

	
	public void buttonFunction(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException,InterruptedException {
		timeline.stop();
		layer++;
		boolean first = true;
		for(int i=0; i<base.length; i++) {
			if(first&&base[i]&&check[i]) {
				head = i;
				System.out.println(head+"h");
				first = false;
			}
			if(base[i]&&check[i]) {
				tail = i;
				System.out.println(tail);
			}
		}
		
		for(int i=0; i<base.length;i++) {
			if(check[i]) {
				base[i]=true;
			}
			else {
				base[i]=false;
			}
		}
		System.out.println(head+"h2");
		System.out.println(tail+"t1");
		move(tail-head+1);



    }
	
	public void move(int length) {

        timeline = new Timeline();
		timeline.setCycleCount(Timeline.INDEFINITE);

		for(int i=0;i<length;i++) {
			grid[layer][i].setVisible(true);
		}
		if(length==5) {
			KeyFrame KF1 = new KeyFrame(Duration.seconds(0.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][0].setVisible(false);
	        		check[0] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF2 = new KeyFrame(Duration.seconds(1), new EventHandler() {
	        	public void handle(Event event) {        		
	        		grid[layer][1].setVisible(false);
	        		check[1] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF3 = new KeyFrame(Duration.seconds(1.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][7].setVisible(true);
	        		check[7] = true;
	        	}});
			KeyFrame KF4 = new KeyFrame(Duration.seconds(2), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][8].setVisible(true);
	        		check[8] = true;
	        	}});
			KeyFrame KF5 = new KeyFrame(Duration.seconds(2.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][8].setVisible(false);
	        		check[8] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF6 = new KeyFrame(Duration.seconds(3), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][7].setVisible(false);
	        		check[7] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF7 = new KeyFrame(Duration.seconds(3.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][1].setVisible(true);
	        		check[1] = true;
	        	}}); 
			KeyFrame KF8 = new KeyFrame(Duration.seconds(4), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][0].setVisible(true);
	        		check[0] = true;
	        	}});

			timeline.getKeyFrames().addAll(KF1,KF2,KF3,KF4,KF5,KF6,KF7,KF8);
			timeline.playFromStart();
		}
		else if(length==4) {

			KeyFrame KF1 = new KeyFrame(Duration.seconds(0.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][0].setVisible(false);
	        		check[0] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF2 = new KeyFrame(Duration.seconds(1), new EventHandler() {
	        	public void handle(Event event) {        		
	        		grid[layer][1].setVisible(false);
	        		check[1] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF3 = new KeyFrame(Duration.seconds(1.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF4 = new KeyFrame(Duration.seconds(2), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][7].setVisible(true);
	        		check[7] = true;
	        	}});
			KeyFrame KF5 = new KeyFrame(Duration.seconds(2.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][8].setVisible(true);
	        		check[8] = true;
	        	}});
			KeyFrame KF6 = new KeyFrame(Duration.seconds(3), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][8].setVisible(false);
	        		check[8] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF7 = new KeyFrame(Duration.seconds(3.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][7].setVisible(false);
	        		check[7] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF8 = new KeyFrame(Duration.seconds(4), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF9 = new KeyFrame(Duration.seconds(4.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][1].setVisible(true);
	        		check[1] = true;
	        	}}); 
			KeyFrame KF10 = new KeyFrame(Duration.seconds(5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][0].setVisible(true);
	        		check[0] = true;
	        	}});

			timeline.getKeyFrames().addAll(KF1,KF2,KF3,KF4,KF5,KF6,KF7,KF8,KF9,KF10);
			timeline.playFromStart();
		}
		else if(length==3) {

			KeyFrame KF1 = new KeyFrame(Duration.seconds(0.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][0].setVisible(false);
	        		check[0] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF2 = new KeyFrame(Duration.seconds(1), new EventHandler() {
	        	public void handle(Event event) {        		
	        		grid[layer][1].setVisible(false);
	        		check[1] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF3 = new KeyFrame(Duration.seconds(1.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF4 = new KeyFrame(Duration.seconds(2), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF5 = new KeyFrame(Duration.seconds(2.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][7].setVisible(true);
	        		check[7] = true;
	        	}});
			KeyFrame KF6 = new KeyFrame(Duration.seconds(3), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][8].setVisible(true);
	        		check[8] = true;
	        	}});
			KeyFrame KF7 = new KeyFrame(Duration.seconds(3.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][8].setVisible(false);
	        		check[8] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF8 = new KeyFrame(Duration.seconds(4), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][7].setVisible(false);
	        		check[7] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF9 = new KeyFrame(Duration.seconds(4.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF10 = new KeyFrame(Duration.seconds(5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF11 = new KeyFrame(Duration.seconds(5.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][1].setVisible(true);
	        		check[1] = true;
	        	}}); 
			KeyFrame KF12 = new KeyFrame(Duration.seconds(6), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][0].setVisible(true);
	        		check[0] = true;
	        	}});

			timeline.getKeyFrames().addAll(KF1,KF2,KF3,KF4,KF5,KF6,KF7,KF8,KF9,KF10,KF11,KF12);
			timeline.playFromStart();
		}
		else if(length==2) {

			KeyFrame KF1 = new KeyFrame(Duration.seconds(0.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][0].setVisible(false);
	        		check[0] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF2 = new KeyFrame(Duration.seconds(1), new EventHandler() {
	        	public void handle(Event event) {        		
	        		grid[layer][1].setVisible(false);
	        		check[1] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF3 = new KeyFrame(Duration.seconds(1.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF4 = new KeyFrame(Duration.seconds(2), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF5 = new KeyFrame(Duration.seconds(2.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF6 = new KeyFrame(Duration.seconds(3), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][7].setVisible(true);
	        		check[7] = true;
	        	}});
			KeyFrame KF7 = new KeyFrame(Duration.seconds(3.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][8].setVisible(true);
	        		check[8] = true;
	        	}});
			KeyFrame KF8 = new KeyFrame(Duration.seconds(4), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][8].setVisible(false);
	        		check[8] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF9 = new KeyFrame(Duration.seconds(4.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][7].setVisible(false);
	        		check[7] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF10 = new KeyFrame(Duration.seconds(5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF11 = new KeyFrame(Duration.seconds(5.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}}); 
			KeyFrame KF12 = new KeyFrame(Duration.seconds(6), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF13 = new KeyFrame(Duration.seconds(6.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][1].setVisible(true);
	        		check[1] = true;
	        	}});
			KeyFrame KF14 = new KeyFrame(Duration.seconds(7), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][0].setVisible(true);
	        		check[0] = true;
	        	}});

			timeline.getKeyFrames().addAll(KF1,KF2,KF3,KF4,KF5,KF6,KF7,KF8,KF9,KF10,KF11,KF12,KF13,KF14);
			timeline.playFromStart();
		}
		else if(length==1) {

			KeyFrame KF1 = new KeyFrame(Duration.seconds(0.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][0].setVisible(false);
	        		check[0] = false;
	        		grid[layer][1].setVisible(true);
	        		check[1] = true;
	        	}});
			KeyFrame KF2 = new KeyFrame(Duration.seconds(1), new EventHandler() {
	        	public void handle(Event event) {        		
	        		grid[layer][1].setVisible(false);
	        		check[1] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF3 = new KeyFrame(Duration.seconds(1.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF4 = new KeyFrame(Duration.seconds(2), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF5 = new KeyFrame(Duration.seconds(2.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}});
			KeyFrame KF6 = new KeyFrame(Duration.seconds(3), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF7 = new KeyFrame(Duration.seconds(3.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][7].setVisible(true);
	        		check[7] = true;
	        	}});
			KeyFrame KF8 = new KeyFrame(Duration.seconds(4), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][7].setVisible(false);
	        		check[7] = false;
	        		grid[layer][8].setVisible(true);
	        		check[8] = true;
	        	}});
			KeyFrame KF9 = new KeyFrame(Duration.seconds(4.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][8].setVisible(false);
	        		check[8] = false;
	        		grid[layer][7].setVisible(true);
	        		check[7] = true;
	        	}});
			KeyFrame KF10 = new KeyFrame(Duration.seconds(5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][7].setVisible(false);
	        		check[7] = false;
	        		grid[layer][6].setVisible(true);
	        		check[6] = true;
	        	}});
			KeyFrame KF11 = new KeyFrame(Duration.seconds(5.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][6].setVisible(false);
	        		check[6] = false;
	        		grid[layer][5].setVisible(true);
	        		check[5] = true;
	        	}}); 
			KeyFrame KF12 = new KeyFrame(Duration.seconds(6), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][5].setVisible(false);
	        		check[5] = false;
	        		grid[layer][4].setVisible(true);
	        		check[4] = true;
	        	}});
			KeyFrame KF13 = new KeyFrame(Duration.seconds(6.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][4].setVisible(false);
	        		check[4] = false;
	        		grid[layer][3].setVisible(true);
	        		check[3] = true;
	        	}});
			KeyFrame KF14 = new KeyFrame(Duration.seconds(7), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][3].setVisible(false);
	        		check[3] = false;
	        		grid[layer][2].setVisible(true);
	        		check[2] = true;
	        	}});
			KeyFrame KF15 = new KeyFrame(Duration.seconds(7.5), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][2].setVisible(false);
	        		check[2] = false;
	        		grid[layer][1].setVisible(true);
	        		check[1] = true;
	        	}});
			KeyFrame KF16 = new KeyFrame(Duration.seconds(18), new EventHandler() {
	        	public void handle(Event event) {
	        		grid[layer][1].setVisible(false);
	        		check[1] = false;
	        		grid[layer][0].setVisible(true);
	        		check[0] = true;
	        	}});
			timeline.getKeyFrames().addAll(KF1,KF2,KF3,KF4,KF5,KF6,KF7,KF8,KF9,KF10,KF11,KF12,KF13,KF14,KF15,KF16);
			timeline.playFromStart();
		}	
		else if(length==0) {
			timeline.stop();
			System.out.print("lose");
		}
		tail = -1;
		head = 0;
	}
	
}

