package flappyBird;

import java.util.ArrayList;


/*
 * codeBlocks returns arrayLists contains list of action under certain event 
 * ie. click, run, hit ground, hit obstacle
 * the action will be returned as integer number
 * 1.end game, 2.flap, 3. initialize score to zero, 4.set speed, 5.set scene, 6.set ground
 * 7. set player
 * 
 */
public class codeBlocks<E> {
	/*
	 * runArr contains sequence of action in integer form when game runs
	 */
	ArrayList<Integer[]> runArr=new ArrayList<>();
	/*
	 * clickArr contains sequence of action in integer form when clicking happens
	 */
	ArrayList<Integer[]> clickArr=new ArrayList<>();
	
	public Integer end() {
		return 1;
	}
	public Integer flap() {
		return 2;
	}
	public Integer initScore() {
		return 3;
	}
	public Integer setSpeed() {
		return 4;
	}
	public Integer initScene() {
		return 5;
	}
	public Integer initGround() {
		return 6;
	}
	public Integer setPlayer() {
		return 7;
	}
}
