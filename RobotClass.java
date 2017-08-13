/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotclass;

/**
 *
 * @author Bhavik
 */
 

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class RobotClass {
  public static void main(String[] argv) throws Exception {
    Robot robot = new Robot();
    int x = 100;
    int y = 100;
    int width = 200;
    int height = 200;
    Rectangle area = new Rectangle(x, y, width, height);
    BufferedImage bufferedImage = robot.createScreenCapture(area);

    // Capture the whole screen
    area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
    bufferedImage = robot.createScreenCapture(area);
    ImageIO.write(bufferedImage,"png", new File(System.getProperty("user.home")+ "/Desktop/ScreenCapture.png"));
  }
}