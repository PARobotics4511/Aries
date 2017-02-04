package org.usfirst.frc.team4511.robot.commands;

import org.usfirst.frc.team4511.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoLineFollow extends Command {

	public static double THRESHOLD = 2;
	public static double LINE_VAL = 1;
	public long duration, start = System.currentTimeMillis();
    public AutoLineFollow(long duration) {
    	requires(Robot.leftEye);
    	requires(Robot.rightEye);
    	requires(Robot.drivie);
    	this.duration = duration;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	boolean left = onLine(Robot.leftEye.getVoltage());
    	boolean right = onLine(Robot.rightEye.getVoltage());
    	if (left && right){
    		Robot.drivie.getJoysticks(.8, .8);
    	}else if (left){
    		Robot.drivie.getJoysticks(.7, .8);
    	}else if (right){
    		Robot.drivie.getJoysticks(.7, .8);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return start - System.currentTimeMillis() > duration;
    }

    // Called once after isFinished returns true
    protected void end() {
		Robot.drivie.getJoysticks(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
    private boolean onLine(double d){
    	return d > LINE_VAL ? d - THRESHOLD < LINE_VAL : d + THRESHOLD > LINE_VAL;
    }
}
