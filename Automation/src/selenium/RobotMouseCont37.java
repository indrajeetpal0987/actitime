package selenium;

import java.awt.AWTException;
import java.awt.Robot;

public class RobotMouseCont37 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.out.println("start");
		Robot a1 = new Robot();
		int x=50,y=50;
		for(int i=0;i<25;i++) {
		y =y+10;
		x=x+50;
		Thread.sleep(500);
	}
		System.out.println("the end");
}
	}
