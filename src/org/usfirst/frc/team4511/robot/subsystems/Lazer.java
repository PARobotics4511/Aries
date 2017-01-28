package org.usfirst.frc.team4511.robot.subsystems;

import edu.wpi.first.wpilibj.AccumulatorResult;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lazer extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	AnalogInput ai = new AnalogInput(0);
	int bits;
	
	public double getVoltage(){
		ai.setOversampleBits(4);
		bits = ai.getOversampleBits();
		ai.setAverageBits(2);
		bits = ai.getAverageBits();
		AnalogInput.setGlobalSampleRate(62500);
		int raw = ai.getValue();
		double volts = ai.getVoltage();
		int averageRaw = ai.getAverageValue();
		double averageVolts = ai.getAverageVoltage();
		ai.setAccumulatorInitialValue(0);
		ai.setAccumulatorCenter(2048);
		ai.setAccumulatorDeadband(10);
		ai.resetAccumulator();
		long count = ai.getAccumulatorCount();
		long value = ai.getAccumulatorValue();
		AccumulatorResult result = new AccumulatorResult();
		ai.getAccumulatorOutput(result);
		count = result.count;
		return volts;
	}
	


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

