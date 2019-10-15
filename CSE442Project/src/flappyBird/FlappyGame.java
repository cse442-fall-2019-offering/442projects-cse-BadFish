package flappyBird;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.jbox2d.collision.shapes.CircleShape;
import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.BodyType;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;

import javafx.event.EventHandler;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FlappyGame extends Application{

    
	public void start() {


	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("FlappyGame");
        primaryStage.setFullScreen(false);
        primaryStage.setResizable(false);
        primaryStage.show();
        Group root = new Group(); //Create a group for holding all objects on the screen
        Scene scene = new Scene(root, Config.WIDTH, Config.HEIGHT);
        
      //create ball   
        final Bird ball = new Bird(45, 90, Config.BALL_RADIUS, Color.RED);
          
        //Add ground to the application, this is where balls will land
        Config.addGround(100, 10);
         
	}
	
    public static void main(String[] args) {
        Application.launch(args);
    }
	
	
}
