package robot_window_automation;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class CaptureScreen {

	public static void main(String[] args) throws Exception 
	{
		
		//Capture Image 
		Robot robot=new Robot();
		BufferedImage Image=robot.createScreenCapture
				(new Rectangle(new Dimension(800, 600)));
		
		//Write image into local folder
		ImageIO.write(Image, "PNG", new File("D:\\image.png"));
		
		//Calling Reusable Method
		RobotCaptureScreen("D:\\image2.png");
		
	}
	
	public static void RobotCaptureScreen(String path)
	{
		try {
			//Capture Image 
			Robot robot=new Robot();
			BufferedImage Image=robot.createScreenCapture
					(new Rectangle(new Dimension(800, 600)));
			
			//Write image into local folder
			ImageIO.write(Image, "PNG", new File(path));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
