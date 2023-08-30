package robot_window_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString 
{

	public static void main(String[] args) throws Exception {
		
		//Open Notepad File
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(2000);
		

		//Copy String to clipboard memory
		String path="D:\\24_Mar_2023_11Am\\Project_210\\src\\image.png";
		StringSelection spath=new StringSelection(path);
		//Enable Clipboard access 
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set content to clipbaord
		clipboard.setContents(spath, spath);
		
		//Creating object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(400);
		
		//Pressing Control+V Shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Releasing Control key [If don't release it will interupt your next run]
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}
	
	
	

}
