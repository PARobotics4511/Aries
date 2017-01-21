package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Turn extends Command {

    public Turn() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.drivie);
    	requires(Robot.gyro);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.drivie.getJoysticks(1, -1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Math.abs(Robot.gyro.gyroPossession()) > 180;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
