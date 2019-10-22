package flappyBird;

import java.awt.event.ActionEvent;

import org.jbox2d.dynamics.Body;

import javafx.event.Event;
import javafx.event.EventHandler;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlappyGame extends Application {

    
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("FlappyGame");
        primaryStage.setFullScreen(false);
        primaryStage.setResizable(false);
        Group root = new Group(); //Create a group for holding all objects on the screen
        Scene scene = new Scene(root, Config.WIDTH, Config.HEIGHT);
        
        final Bird ball = new Bird(45, 90, Config.BALL_RADIUS, Color.RED);
        Config.addGround(100, 10);
        
        final Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        Duration duration = Duration.seconds(1.0/6.0);
        
        Config.world.step(1.0f/60.f, 8, 3); 
        
        //Move balls to the new position computed by JBox2D
        Body body = (Body)ball.node.getUserData();
        float xpos = Config.toPixelPosX(body.getPosition().x);
        float ypos = Config.toPixelPosY(body.getPosition().y);
        ball.node.setLayoutX(xpos);
        ball.node.setLayoutY(ypos);

        root.getChildren().add(ball.node);
        primaryStage.setScene(scene);
        primaryStage.show();
        
	}
	
    public static void main(String[] args) {
        Application.launch(args);
    }
	
	
}
