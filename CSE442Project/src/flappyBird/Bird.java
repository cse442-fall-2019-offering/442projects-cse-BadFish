//package flappyBird;
//
//import org.jbox2d.collision.shapes.CircleShape;
//import org.jbox2d.dynamics.Body;
//import org.jbox2d.dynamics.BodyDef;
//import org.jbox2d.dynamics.BodyType;
//import org.jbox2d.dynamics.FixtureDef;
//
//import javafx.scene.Node;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import flappyBird.Config;
//
//public class Bird {
//	//JavaFX UI for ball
//    public Node node;
//     
//    //X and Y position of the ball in JBox2D world
//    private float posX;
//    private float posY;
//     
//    //Ball radius in pixels
//    private int radius;
//
//	private Color color;
//    
//    public Bird(float posX, float posY, int radius, Color color){
//        this.posX = posX;
//        this.posY = posY;
//        this.radius = radius;
//        this.color = color;
//        node = create();
//    }
//    
//    private Node create() {
//    	Circle ball = new Circle();
//        ball.setRadius(radius);
//        ball.setFill(color); //set look and feel
// 
//        /**
//         * Set ball position on JavaFX scene. We need to convert JBox2D coordinates 
//         * to JavaFX coordinates which are in pixels.
//         */
//        ball.setLayoutX(Config.toPixelPosX(posX)); 
//        ball.setLayoutY(Config.toPixelPosY(posY));
//        
//      //Create an JBox2D body defination for ball.
//        BodyDef bd = new BodyDef();
//        bd.type = BodyType.DYNAMIC;
//        bd.position.set(posX, posY);
//        
//        CircleShape cs = new CircleShape();
//        cs.m_radius = radius * 0.1f;
//        
//     // Create a fixture for ball
//        FixtureDef fd = new FixtureDef();
//        fd.shape = cs;
//        fd.density = 0.6f;
//        fd.friction = 0.3f;        
//        fd.restitution = 0.8f;
//        
//        Body body = Config.world.createBody(bd);
//        body.createFixture(fd);
//        ball.setUserData(body);
//        return ball;
//    }
//}
