package org.usfirst.frc.team4511.robot;

import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team4511.robot.commands.*;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
	static Joystick stickie = new Joystick(0);
	static Joystick stickie2 = new Joystick(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
	
	static double deadzone = .1;
	
	public OI(){
		JoystickButton butt1 = new JoystickButton(stickie, 1);
		//JoystickButton butt2 = new JoystickButton(stickie, 4);
		//JoystickButton butt3 = new JoystickButton(stickie, 5);
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
		butt1.whileHeld(new GetLazer());
		//butt1.whileHeld(new FullThrottle());
		//butt1.whenReleased(new Drive());
		//butt3.whenPressed(new Retract());
	}
	
	public static double getYInput() {
		if(Math.abs(stickie.getY()) > deadzone) {
			return -stickie.getY();
		}
		return 0;
	}
	public static double getYInput2() {
		if(Math.abs(stickie2.getY()) > deadzone) {
			return -stickie2.getY();
		}
		return 0;
	}
	
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

