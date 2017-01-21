package org.usfirst.frc.team4511.robot.subsystems;

import org.usfirst.frc.team4511.robot.RobotMap;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team4511.robot.commands.*;
/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public CANTalon frontLeft = new CANTalon(RobotMap.topLeftMotor);
	public CANTalon frontRight = new CANTalon(RobotMap.topRightMotor);
	public CANTalon backLeft = new CANTalon(RobotMap.bottomLeftMotor);
	public CANTalon backRight = new CANTalon(RobotMap.bottomRightMotor);
	
		
	public RobotDrive roboD = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
	
	public ADXRS450_Gyro gyro = new ADXRS450_Gyro();

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    	roboD.setSafetyEnabled(false);
    }
    
    public void getJoysticks(double a, double b) {
    	roboD.tankDrive(a, b);
    }
    public void stop() {
    	roboD.tankDrive(0, 0);
    }
}

