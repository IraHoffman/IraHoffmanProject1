package randCirc;
import java.util.*;
public class TimeDepend extends MakeScene {
	private Timer timer = new Timer();
	public TimeDepend() {
	boolean hitBottom = false;
	boolean hitBar=false;
	
	
	timer.scheduleAtFixedRate(new TimerTask(){

		@Override
		public void run() {
		circleGroup.setTranslateY(10);//move the entire group of circles down by 10
		if(circleGroup.getY()==700) {
			hitBottom=true;//once ONE circle hits the bottom, delete that circle and give a point to player 1
			p1S++;
			//circleGroup.;// enter function to get rid of the circle that hit the bottom
			hitBottom=false;
		}
		else if (circleGroup intersects Bar) {//if one of the circles intersects player 2's bar, delete that circle and credit p2 with points
			hitBar=true;
			p2S++;
			// enter function to get rid of the circle that hit the bottom
			hitBar=false;
		}
		
	//	primaryStage.show-->get the game to actually update the image on screen
		}
		
	}, 100, 100);
}
}
