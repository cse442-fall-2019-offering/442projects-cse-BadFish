package game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import rockPaperScissor.rpsGameController;

public class rpstestcases {
 @Test
public void Testround1Correct() {
	 rpsGameController rps = new rpsGameController();
	 //start the game and set the round to 1
	 rps.setcurrentround(1);
	 int currentround = rps.getcurrentround();
	 assertEquals("The current round should be 1",1,currentround,0.001);
	 rps.setleftvalue("char");
	 rps.setrightvalue("a");
	 rps.setchoicemadeleft(true);
	 rps.setchoicemaderight(true);
	 int result1 = rps.checkresult();
	 assertEquals("The current result should be 1",1,result1,0.001);
	 
	 try {
	 rps.processresult();
	 int currentround2 = rps.getcurrentround();
	 assertEquals("The current round should be 2",2,currentround2,0.001);	 
	 
	 boolean choiceleft = rps.getchoicemadeleft();
	 boolean choiceright = rps.getchoicemaderight();
	 assertFalse("Player didn't select anything at this point.",(choiceleft&&choiceright));	
	 
	 String leftvalue = rps.getleftvalue();
	 String rightvalue = rps.getrightvalue();
	 assertEquals("Left value should be set to blank.", "",leftvalue);
	 assertEquals("Right value should be set to blank.", "",rightvalue);
	 }
	 catch(NullPointerException e1) {
		 
	 }
	 catch(IndexOutOfBoundsException e2) {
		 
	 }
 }



@Test
public void Testround1Incorrect() {
	 rpsGameController rps = new rpsGameController();
	 //start the game and set the round to 1
	 rps.setcurrentround(1);
	 int currentround = rps.getcurrentround();	 
	 assertEquals("The current round should be 1",1,currentround,0.001);

	 rps.setleftvalue("char");
	 rps.setrightvalue("else");
	 rps.setchoicemadeleft(true);
	 rps.setchoicemaderight(true);
	 int result2 = rps.checkresult();
	 assertEquals("The current result should be -1",-1,result2,0.001);
 }
 
 @Test
public void Testround2Correct() {
	 rpsGameController rps = new rpsGameController();
	 //start the game and set the round to 1
	 rps.setcurrentround(2);
	 int currentround = rps.getcurrentround();
	 assertEquals("The current round should be 2",2,currentround,0.001);
	 rps.setleftvalue("String");
	 rps.setrightvalue("a");
	 rps.setchoicemadeleft(true);
	 rps.setchoicemaderight(true);
	 int result1 = rps.checkresult();
	 assertEquals("The current result should be 1",1,result1,0.001);
	 
	 try {
	 rps.processresult();
	 int currentround2 = rps.getcurrentround();
	 assertEquals("The current round should be 3",3,currentround2,0.001);	 
	 
	 boolean choiceleft = rps.getchoicemadeleft();
	 boolean choiceright = rps.getchoicemaderight();
	 assertFalse("Player didn't select anything at this point.",(choiceleft&&choiceright));	
	 
	 String leftvalue = rps.getleftvalue();
	 String rightvalue = rps.getrightvalue();
	 assertEquals("Left value should be set to blank.", "",leftvalue);
	 assertEquals("Right value should be set to blank.", "",rightvalue); 
	 }
	 catch(NullPointerException e1) {
		 
	 }
	 catch(IndexOutOfBoundsException e2) {
		 
	 }
 }
 
 @Test
public void Testround2Incorrect() {
	 rpsGameController rps = new rpsGameController();
	 //start the game and set the round to 1
	 rps.setcurrentround(2);
	 int currentround = rps.getcurrentround();	 
	 assertEquals("The current round should be 2",2,currentround,0.001);

	 rps.setleftvalue("char");
	 rps.setrightvalue("else");
	 rps.setchoicemadeleft(true);
	 rps.setchoicemaderight(true);
	 int result2 = rps.checkresult();
	 assertEquals("The current result should be -1",-1,result2,0.001);
 }
 
 @Test
 public void Testround3Correct() {
 	 rpsGameController rps = new rpsGameController();
 	 //start the game and set the round to 1
 	 rps.setcurrentround(3);
 	 int currentround = rps.getcurrentround();
 	 assertEquals("The current round should be 3",3,currentround,0.001);
 	 rps.setleftvalue("else");
 	 rps.setrightvalue("if");
 	 rps.setchoicemadeleft(true);
 	 rps.setchoicemaderight(true);
 	 int result1 = rps.checkresult();
 	 assertEquals("The current result should be 1",1,result1,0.001);
 	 
 	 try {
 	 rps.processresult();
 	 int currentround2 = rps.getcurrentround();
 	 assertEquals("The current round should be 3",3,currentround2,0.001);	 
 	 
 	 assertTrue("Game ends.",rps.checkifgameends());
 	 
 	 boolean choiceleft = rps.getchoicemadeleft();
 	 boolean choiceright = rps.getchoicemaderight();
 	 assertFalse("Player didn't select anything at this point.",(choiceleft&&choiceright));	
 	 
 	 String leftvalue = rps.getleftvalue();
 	 String rightvalue = rps.getrightvalue();
 	 assertEquals("Left value should be set to blank.", "",leftvalue);
 	 assertEquals("Right value should be set to blank.", "",rightvalue); 
 	 }
	 catch(NullPointerException e1) {
		 
	 }
	 catch(IndexOutOfBoundsException e2) {
		 
	 }
  }
  
  @Test
 public void Testround3Incorrect() {
 	 rpsGameController rps = new rpsGameController();
 	 //start the game and set the round to 1
 	 rps.setcurrentround(3);
 	 int currentround = rps.getcurrentround();	 
 	 assertEquals("The current round should be 3",3,currentround,0.001);

 	 rps.setleftvalue("char");
 	 rps.setrightvalue("else");
 	 rps.setchoicemadeleft(true);
 	 rps.setchoicemaderight(true);
 	 int result2 = rps.checkresult();
 	 assertEquals("The current result should be -1",-1,result2,0.001);
  } 
	
	
	
}
