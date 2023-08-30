package robot_window_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Type_At_NotepadFile {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		
		//Open Notepad File
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(2000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(400);
	
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_E);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_T);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_Q);
		
	}

}
