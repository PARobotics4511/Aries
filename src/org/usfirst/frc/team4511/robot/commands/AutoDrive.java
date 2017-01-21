package org.usfirst.frc.team4511.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.interfaces.Gyro;

import org.usfirst.frc.team4511.robot.Robot;
import org.usfirst.frc.team4511.robot.subsystems.DriveTrain;



/**
 *
 */
public class AutoDrive extends Command {
    public AutoDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivie);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }
   
    

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivie.roboD.tankDrive(0.7, 0.7);
        try{ 
        	Thread.sleep(1900);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();	
        }
   
        
        Robot.drivie.roboD.tankDrive(0.7, -0.7);
        try{ 
        	Thread.sleep(650);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }
        Robot.drivie.roboD.tankDrive(0.7, 0.7);
        try{ 
        	Thread.sleep(1600);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }
        Robot.drivie.roboD.tankDrive(0.7, -0.7);
        try{ 
        	Thread.sleep(650);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }
        Robot.drivie.roboD.tankDrive(0.7, 0.7);
        try{ 
        	Thread.sleep(1500);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }
        Robot.drivie.roboD.tankDrive(0.7, -0.7);
        try{ 
        	Thread.sleep(600);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }
        Robot.drivie.roboD.tankDrive(0.7, 0.7);
        try{ 
        	Thread.sleep(1500);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }
        Robot.drivie.roboD.tankDrive(0.7, -0.7);
        try{ 
        	Thread.sleep(700);
        }catch(InterruptedException e){
        	Thread.currentThread().interrupt();
        }

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    	new Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
