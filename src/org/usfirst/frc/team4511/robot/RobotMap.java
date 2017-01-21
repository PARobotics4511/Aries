package org.usfirst.frc.team4511.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
		
	
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    public static int topLeftMotor = 1;
    public static int topRightMotor = 3;
    public static int bottomLeftMotor = 4;
    public static int bottomRightMotor = 2;
   
    //digital pin
    public static int sonarSensor = 5;
    /* public static int ballKicker = 5;
    
    public static int solenoid = 0;
    public static int airCompressor = 0;*/
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
}
