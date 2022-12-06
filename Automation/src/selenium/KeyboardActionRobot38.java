package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class KeyboardActionRobot38 {
public static void main(String[] args) throws IOException, AWTException {
	Runtime.getRuntime().exec("notepad");
	
	Robot a1 = new Robot();
	a1.keyPress(KeyEvent.VK_Q);
	a1.keyPress(KeyEvent.VK_S);
	a1.keyPress(KeyEvent.VK_P);
	
	a1.keyPress(KeyEvent.VK_SHIFT);
	a1.keyPress(KeyEvent.VK_J);
	a1.keyPress(KeyEvent.VK_S);
	a1.keyPress(KeyEvent.VK_P);
	a1.keyPress(KeyEvent.VK_SHIFT);
	
	a1.keyPress(KeyEvent.VK_ENTER);
	a1.keyPress(KeyEvent.VK_A);
	a1.keyPress(KeyEvent.VK_S);
	a1.keyPress(KeyEvent.VK_LEFT);
	a1.keyPress(KeyEvent.VK_SPACE);
}
}
