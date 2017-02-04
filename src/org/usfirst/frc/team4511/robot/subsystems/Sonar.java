package org.usfirst.frc.team4511.robot.subsystems;



import org.usfirst.frc.team4511.robot.RobotMap;
import org.usfirst.frc.team4511.robot.commands.getSonar;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Sonar extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	Ultrasonic ultra = new Ultrasonic(RobotMap.sonarSensor, RobotMap.sonarSensor); //sets port for ping channel and echo channel
    
	public double getInches(){
		double inches = ultra.getRangeInches();
		return inches;
	}
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		ultra.setAutomaticMode(true);
    	setDefaultCommand(new getSonar());
    	
    }
    
    
}

