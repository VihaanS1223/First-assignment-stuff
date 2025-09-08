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

        // Line 2
    	GLabel body1 = new GLabel("My summer was punctuated with many small events rather than a single memorable vacation or moment. I visited ", 10, 40);
    	body1.setFont(f2);
    	add(body1);

        // Line 3
    	GLabel body2 = new GLabel("Yosemite, Big Sur, Pacifica, Half Moon Bay, and other places in California. Normally, we'd visit a ", 10, 60);
    	body2.setFont(f2);
    	add(body2);

        // Line 4
    	GLabel body3 = new GLabel("place farther away, we were thinking of visiting Maine or even South America, but my grandpa got a", 10, 80);
    	body3.setFont(f2);
    	add(body3);

        // Line 5
    	GLabel body4 = new GLabel("heart attack, and we wanted to take care of him. The silver lining was, he had a fantastic recovery,", 10, 100);
    	body4.setFont(f2);
    	add(body4);

        // Line 6
    	GLabel body5 = new GLabel("and my cousins visited for the first time in many years, so my brother and I were able to have some ", 10, 120);
    	body5.setFont(f2);
    	add(body5);

        // Line 7
    	GLabel body6 = new GLabel("quality time with them, and we visited some cool places nearby. Personally, I really enjoyed visiting", 10, 140);
    	body6.setFont(f2);
    	add(body6);

        // Line 8
    	GLabel body7 = new GLabel("Pacifica, because even though it's only a half-hour drive from Cupertino, it's an entirely different", 10, 160);
    	body7.setFont(f2);
    	add(body7);    

        // Line 9
    	GLabel body8 = new GLabel("climate and environment, and the scenery is unbelievable. My favorite part was Devil's Bunker; the building", 10, 180);
    	body8.setFont(f2);
    	add(body8);

        // Line 10
        GLabel body9 = new GLabel("had a really interesting design, and the graffiti inside actually looked really well done and was good art.", 10, 200);
    	body9.setFont(f2);
    	add(body9);

        // Line 11
        GLabel body10 = new GLabel("I listened to a lot of music this summer; I've gotten into jazz rap and abstract hip hop, because the lyricism", 10, 220);
    	body10.setFont(f2);
    	add(body10);

        // Line 12
        GLabel body11 = new GLabel("and production mesh together really well, and I'm a fan of how rappers word topics in their own unique way.", 10, 240);
    	body11.setFont(f2);
    	add(body11);

        // Line 13
        GLabel body12 = new GLabel("It's really fantastic and refreshing to get into a new subculture of art, and to be honest, that may have been", 10, 260);
    	body12.setFont(f2);
    	add(body12);

        // Line 14
        GLabel body13 = new GLabel("one of the highlights of my summer.", 10, 280);
    	body13.setFont(f2);
    	add(body13);
 
    	//	Continue adding lines until you have 12 to 15 lines
    	
    }
    
}
