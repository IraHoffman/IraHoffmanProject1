//Ira Hoffman
//Project 1

package randCirc;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javafx.stage.Stage;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.event.ActionEvent;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class MakeScene extends Application{
	private ArrayList<Circle> circleList;
	
	private Button clearButton = new Button("Clear");
	//public Group circleGroup=new Group();
	private int p1S=0;
	private int p2S=0;
	private Text msg = new Text (250,300,"Click anywhere to make a circle! \nPress clear to reset!");
	private Text p1Score = new Text(350,60,""+p1S);
	private Text p2Score = new Text(350,50, ""+p2S);
	private Line border = new Line(0,350,700,350);
	private Rectangle Bar = new Rectangle(300,680,120,20);
	//private double DeltaGravity=10;
	//private Timer timer = new Timer();

	//declaring the pieces necessary
	/*public void TimeDepend() {
		
		
	timer.scheduleAtFixedRate(new TimerTask(){

		@Override
		public void run() {
		circleGroup.setTranslateY(10);
		
		}
		
	}, 100, 100);
}*/
	public void processMouseClick(MouseEvent event) {
		double posX=event.getX();
		double posY=event.getY();
		if (posY>=350) {
			System.out.println("Nope");
		}
		else {
		MakeCircle circleField = new MakeCircle(posX, posY);
		
			circleList.add(circleField.getCircle());
			System.out.println(circleList.size());
		
		p1Score.setText(""+ ++p1S);
		
		//Here's where MakeCircle is used to actually generate the Circle
		}
		}

	public void start(Stage primaryStage) {
		msg.setFont(Font.font("Verdana", 20));
		//circleList= new ArrayList<Circle>();
		
		circleList = new ArrayList<Circle>();
Circle circle = new Circle(20,20,20);
circleList.add(circle);
			
		 Pane root = new Pane();
		 Scene clickScene =  new Scene(root, 700,700, Color.WHITE);
		  
		//setting the scene
		
		clickScene.setOnMouseClicked(this::processMouseClick);
		clearButton.setOnAction(this::processButtonPress);
	//	Bar.setOnKeyPressed(this::processKeyPress());
		//sends to handler on 2 events: button and mouse click
		while(circleList.isEmpty()==false){
			//for(int i =0; i<circleList.size();i++) {
			//root.getChildren().addAll(circleList.get(i));
			//System.out.println(circleList.size());
			root.getChildren().addAll(circleList);
		//}
		}
	System.out.println(circleList.size());
		root.getChildren().addAll(msg, clearButton, p1Score, p2Score, border, Bar);
		
		//add in order of priority--clear Button always on top
		primaryStage.setScene(clickScene);
	    primaryStage.show();
	    
	}
	

	
		
	public void processButtonPress(ActionEvent event) {
		circleList.clear();
		//clears the Group
	}
	public void processKeyPress(KeyEvent event) {
	System.out.println(KeyEvent.getKeyText(1));
		
		//clears the Group
	}
	public void update() {
		//draw all circles
		//move all circles
		//for(circleGroup.gets
		//move bar
		//check for collision
		//--will update score
	}
	public static void main(String[]args) {
		launch(args);
	}
	
}
