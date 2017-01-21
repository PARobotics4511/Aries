package org.usfirst.frc.team4511.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Ultrasonic;

import org.usfirst.frc.team4511.robot.Robot;
import org.usfirst.frc.team4511.robot.subsystems.Sonar;


/**
 *
 */
public class getSonar extends Command {

    public getSonar() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	//requires(Robot.sonic);
    }
    
    
    // Called just before this Command runs the first time
    protected void initialize() {
    	//Robot.ultra.setAutomaticMode(true);
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//double newInches = Robot.sonic.getInches();
    	//System.out.println("Distance:" + newInches);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
