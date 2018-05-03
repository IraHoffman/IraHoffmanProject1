//Ira Hoffman
//Project 1

package randCirc;
//import java.util.ArrayList;
import java.util.Random;
import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

public class MakeCircle{
	//private ArrayList<MakeCircle>circleList;
	private Random ranGenerator = new Random();
	private int radius=0;
	private Circle clickCircle;
	
	//declare private variables to work with when making the circle
public MakeCircle(double posX, double posY) {
	//circleList= new ArrayList<MakeCircle>();
	//posX and posY are gotten from wherever the mouse clicks
	int randColorNum= ranGenerator.nextInt(6);

	//enter an if statement to plug in some colors for numbers
	int randIntRadius= ranGenerator.nextInt(51)+10;
	
	//sets the numbers for radius and Color
	radius=randIntRadius;
	clickCircle =  new Circle(posX, posY, radius);
	if(randColorNum==0) {clickCircle.setFill(Color.BLUE);}
	if(randColorNum==1) {clickCircle.setFill(Color.RED);}
	if(randColorNum==2) {clickCircle.setFill(Color.GREEN);}
	if(randColorNum==3) {clickCircle.setFill(Color.RED);}
	if(randColorNum==4) {clickCircle.setFill(Color.PURPLE);}
	if(randColorNum==5) {clickCircle.setFill(Color.YELLOW);}
	if(randColorNum==6) {clickCircle.setFill(Color.BROWN);}
	//for Color
}
public Circle getCircle() {
	return clickCircle;
	
	//Simple Getter
}


//Make Circle should take in a coordinate and pump out a random colored, random radius circle. 
//another class should add that circle to an ArrayList and show it
}