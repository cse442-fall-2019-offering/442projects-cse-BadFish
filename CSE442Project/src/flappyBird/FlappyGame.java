package flappyBird;

import org.jbox2d.collision.shapes.PolygonShape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;

public class FlappyGame {
	protected World m_world;
	
	public World getWorld() {
	    return m_world;
	}
	
	public void init() {
		Vec2 gravity = new Vec2(0.0f, -10.0f);
		World world = new World(gravity);
		
		m_world = world;
		
		Body ground = null;
		BodyDef bd = new BodyDef();
	    ground = getWorld().createBody(bd);
	    
		PolygonShape shape = new PolygonShape();
		shape.setAsBox(0.6f, 0.125f);
		
		FixtureDef fd = new FixtureDef();
		fd.shape = shape;
	    fd.density = 20.0f;
	    fd.friction = 0.2f;
	    
	    world.createBody(bd);
	}
	
}
