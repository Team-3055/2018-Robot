package org.usfirst.frc.team3055.robot.subsystems;

import org.usfirst.frc.team3055.robot.RobotMap;
import org.usfirst.frc.team3055.robot.commands.TankDrive;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.ctre.phoenix.motorcontrol.*;


import edu.wpi.first.wpilibj.Talon;

/**
 *
 */
public class DriveTrain extends Subsystem {

    

	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	public Talon Right = new Talon(RobotMap.fRightDriveTalon);
	public Talon Left = new Talon(RobotMap.fLeftDriveTalon);
	public Talon rArm = new Talon(RobotMap.rArmTalon);
	public Talon lArm = new Talon(RobotMap.lArmTalon);
	// public RobotDrive robotDrive = new RobotDrive(fLeft, bLeft, fRight,
	// bRight);
	public DifferentialDrive robotDrive = new DifferentialDrive(Left, Right);

	public void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
//		robotDrive.setInvertedMotor(MotorType.kFrontLeft, true);
//		robotDrive.setInvertedMotor(MotorType.kRearLeft, true);
//		LiveWindow.addActuator("Drive Motors", "fRight", fRight);
//		LiveWindow.addActuator("Drive Motors", "fLeft", fLeft);
//		LiveWindow.addActuator("Drive Motors", "bRight", bRight);
//		LiveWindow.addActuator("Drive Motors", "bLeft", bLeft);
	}
	
	

	public void Drive(double speedLeft, double speedRight) {
		Right.set(speedRight);
		Left.set(speedLeft);
			
	}
	//public void ReverseDrive() {
		//robotDrive.setInvertedMotor(fLeft, true);
		//robotDrive.setInvertedMotor(fRight, false);
		//robotDrive.setInvertedMotor(bLeft, false);
		//robotDrive.setInvertedMotor(bRight, true);
		//robotDrive.tankDrive(-127, 127, true);
	// I think setInvertedMotor is just to reverse a motor control
	//}

	//public void ForwardDrive() {
	//	robotDrive.setInvertedMotor(fLeft, false);
		//robotDrive.setInvertedMotor(fRight, true);
		//robotDrive.setInvertedMotor(bRight, true);
		//robotDrive.setInvertedMotor(bLeft, false);
		//robotDrive.tankDrive(127, -127, false);

	//i think .setInvertedMotor just reverses the motor?
	//}
}