/**
 *	FirstAssignment.java
 *	Display a brief description of your summer vacation on the screen.
 *
 *	To compile Linux:	javac -cp .:mvAcm.jar FirstAssignment.java
 *	To execute Linux:	java -cp .:mvAcm.jar FirstAssignment
 *
 *	To compile MS Powershell:	javac -cp ".;mvAcm.jar" FirstAssignment.java
 *	To execute MS Powershell:	java -cp ".;mvAcm.jar" FirstAssignment
 *
 *	@author	Vihaan
 *	@since	8/22/25
 */
import java.awt.Font;

import acm.program.GraphicsProgram;
import acm.graphics.GLabel;

public class FirstAssignment extends GraphicsProgram {
    
    public void run() {
    	//	The font to be used
    	Font f = new Font("Serif", Font.BOLD, 18);
    	Font f2 = new Font("Serif", Font.BOLD, 14);
    	
    	//	Line 1
    	GLabel s1 = new GLabel("What I did on my summer vacation ...", 50, 20);
    	s1.setFont(f);
    	add(s1);
    	
    	GLabel body1 = new GLabel("My summer was punctuated with many small events rather than a single memorable vacation or moment. I visited ", 10, 40);
    	body1.setFont(f2);
    	add(body1);
    	
    	GLabel body2 = new GLabel("Yosemite, Big Sur, Pacifica, Half Moon Bay, and other places in California. Normally, we'd visit a ", 10, 60);
    	body2.setFont(f2);
    	add(body2);
    	
    	GLabel body3 = new GLabel("place farther away, we were thinking of visiting Maine or even South America, but my grandpa got a", 10, 80);
    	body3.setFont(f2);
    	add(body3);
    	
    	GLabel body4 = new GLabel("heart attack, and we wanted to take care of him. The silver lining was, he had a fantastic recovery,", 10, 100);
    	body4.setFont(f2);
    	add(body4);
    	
    	GLabel body5 = new GLabel("and my cousins visited for the first time in many years, so my brother and I were able to have some ", 10, 120);
    	body5.setFont(f2);
    	add(body5);

    	GLabel body6 = new GLabel("time to meet them", 10, 140);
    	body6.setFont(f2);
    	add(body6);
    	
    	GLabel body7 = new GLabel("heart attack, and we wanted to take care of him. The silver lining was, he had a fantastic recovery", 10, 160);
    	body7.setFont(f2);
    	add(body7);    
    	
    	GLabel body8 = new GLabel("heart attack, and we wanted to take care of him. The silver lining was, he had a fantastic recovery", 10, 160);
    	body8.setFont(f2);
    	add(body8);
 
    	//	Continue adding lines until you have 12 to 15 lines
    	
    }
    
}
