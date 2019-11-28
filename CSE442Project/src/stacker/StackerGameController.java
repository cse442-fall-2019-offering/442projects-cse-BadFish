package stacker;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.*;

public class StackerGameController implements Initializable {
	
	private boolean playable = false;
	
	private boolean gameStart = false;
	
	private boolean stopper = false;
	
	private int currentRow = 0;
	
	private int blockCount = 3;

	private Image darkBlue = new Image((new File("C:\\Users\\tebas\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\Dark Blue.jpg")).toURI().toString());
	
	private Image neonBlue = new Image((new File("C:\\Users\\tebas\\git\\442projects-cse-BadFish\\CSE442Project\\Images\\Neon Blue.jpg")).toURI().toString());
	
	private Timeline TL = new Timeline();
	
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
	
	private static final Integer STARTTIME = 0;
    private Timeline timeline;
//    private Label timerLabel = new Label();
//    private Integer timeSeconds = STARTTIME;
//    private Integer startBoxs = 5;
    private ImageView grid[][] = new ImageView[12][9];
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
        timeline = new Timeline();

		
		instruction.setText("Instructions Go Here:");
		button.setOnAction(arg0 -> {
			try {
				buttonFunction(arg0);
			} catch (NullPointerException | IndexOutOfBoundsException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		//Temporary
//		playable = true;

		
//		KeyFrame KF1 = new KeyFrame(Duration.seconds(2), new KeyValue(zero11.imageProperty(), neonBlue));
//		KeyFrame KF2 = new KeyFrame(Duration.seconds(2));
//		KeyFrame KF3 = new KeyFrame(Duration.seconds(2), new KeyValue(zero11.imageProperty(), darkBlue));
//		TL.getKeyFrames().addAll(KF1, KF2, KF3);
		
		grid[0][0] = zero11;
		grid[0][1] = one11;
		grid[0][2] = two11;
		grid[0][3] = three11;
		grid[0][4] = four11;
		grid[0][5] = five11;
		grid[0][6] = six11;
		grid[0][7] = seven11;
		grid[0][8] = eight11;
		grid[0][0].setVisible(false);
		grid[0][1].setVisible(false);
		grid[0][2].setVisible(true);
		grid[0][3].setVisible(true);
		grid[0][4].setVisible(true);
		grid[0][5].setVisible(true);
		grid[0][6].setVisible(true);
		grid[0][7].setVisible(false);
		grid[0][8].setVisible(false);


		
	}
	
	
	
	public void buttonFunction(ActionEvent event) throws NullPointerException,IndexOutOfBoundsException,InterruptedException {
		
			
				
		 
//        if (timeline != null) {
//            timeline.stop();
//        }
//        timeSeconds = STARTTIME;
 
        // update timerLabel
//        timerLabel.setText(timeSeconds.toString());
        timeline.setCycleCount(Timeline.INDEFINITE);
		KeyFrame KF1 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][2].setVisible(false);
        		grid[0][7].setVisible(true);
        		instruction.setText("show1:");
//        		new KeyValue(grid[0][2].imageProperty(), darkBlue);
//        		new KeyValue(grid[0][7].imageProperty(), darkBlue);
        	}});
		KeyFrame KF2 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][3].setVisible(false);
        		grid[0][8].setVisible(true);
        		instruction.setText("show2:");

        	}});
		KeyFrame KF3 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][8].setVisible(false);
        		grid[0][3].setVisible(true);
        	}});
		KeyFrame KF4 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][7].setVisible(false);
        		grid[0][2].setVisible(true);
        	}});
		KeyFrame KF5 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][6].setVisible(false);
        		grid[0][1].setVisible(true);
        	}});
		KeyFrame KF6 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][5].setVisible(false);
        		grid[0][0].setVisible(true);
        	}});
		KeyFrame KF7 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][0].setVisible(false);
        		grid[0][5].setVisible(true);
        	}}); 
		KeyFrame KF8 = new KeyFrame(Duration.seconds(1), new EventHandler() {
        	public void handle(Event event) {
        		grid[0][1].setVisible(false);
        		grid[0][6].setVisible(true);
        	}});
		timeline.getKeyFrames().addAll(KF1,KF2,KF3,KF4,KF5,KF6,KF7,KF8);
//                new KeyFrame(Duration.seconds(1),
//                  new EventHandler() {
//                    // KeyFrame event handler
//                    public void handle(Event event) {
//                		grid[0][3].setImage(neonBlue);
//                		grid[0][8].setImage(darkBlue);
////                        timeSeconds++;
//                        // update timerLabel
////                        timerLabel.setText(
////                              timeSeconds.toString());
////                        if (timeSeconds <= 0) {
////                            timeline.stop();
////                        }
//                      }
//
//
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(1),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		grid[0][3].setImage(darkBlue);
//                		grid[0][8].setImage(neonBlue);
////                    	new KeyValue(grid[0][3].setImage(darkBlue));
////                    	new KeyValue(grid[0][8].imageProperty(), neonBlue);
//                	}
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(1),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		grid[0][8].setImage(darkBlue);
//                		grid[0][3].setImage(neonBlue);
//                	}
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(1),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		grid[0][3].setImage(darkBlue);
//                		grid[0][8].setImage(neonBlue);
//                	}
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(1),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		grid[0][8].setImage(darkBlue);
//                		grid[0][3].setImage(neonBlue);
//                	}
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(1),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		grid[0][3].setImage(darkBlue);
//                		grid[0][8].setImage(neonBlue);
//                	}
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(1),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		instruction.setText("show");
//                		grid[0][8].setImage(darkBlue);
//                		grid[0][3].setImage(neonBlue);
//                	}
//                }));
//        timeline.getKeyFrames().add(
//                new KeyFrame(Duration.seconds(10),
//                        new EventHandler() {
//                	public void handle(Event event) {
//                		grid[0][3].setImage(darkBlue);
//                		grid[0][8].setImage(neonBlue);
//                	}
//                }));
        timeline.playFromStart();
//		TL.play();
//		TL.play();
//		TL.play();

    }
}

//if(gameStart) {
//
//} else if(playable) {
//gameStart = true;
//three11.setImage(neonBlue);
//four11.setImage(neonBlue);
//five11.setImage(neonBlue);
//TimeUnit.SECONDS.sleep(1);
//while(true) {
//	two11.setImage(neonBlue);
//	five11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	one11.setImage(neonBlue);
//	four11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	zero11.setImage(neonBlue);
//	three11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	three11.setImage(neonBlue);
//	zero11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	four11.setImage(neonBlue);
//	one11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	five11.setImage(neonBlue);
//	two11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	six11.setImage(neonBlue);
//	three11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	seven11.setImage(neonBlue);
//	four11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	eight11.setImage(neonBlue);
//	five11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	five11.setImage(neonBlue);
//	eight11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	four11.setImage(neonBlue);
//	seven11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//	three11.setImage(neonBlue);
//	six11.setImage(darkBlue);
//	TimeUnit.SECONDS.sleep(1);
//}
//}
