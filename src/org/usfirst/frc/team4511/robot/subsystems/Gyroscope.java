package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Gyro;
public class Gyroscope extends Subsystem {

    public ADXRS450_Gyro gyro;


    public Gyroscope() {
        gyro = new ADXRS450_Gyro();             // Gyro on Analog Channel 1
    }
    public double gyroPossession() {
    	return gyro.getAngle();
    }
    public void reset() {
    	gyro.reset();
    }
    

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}


}