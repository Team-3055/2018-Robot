package org.usfirst.frc.team3055.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
    // Create the joystick and the 8 buttons on it
	public Joystick driveController2 = new Joystick(0);
	Button lbutton1 = new JoystickButton(driveController2, 1),
			lbutton2 = new JoystickButton(driveController2, 2),
			lbutton3 = new JoystickButton(driveController2, 3),
			lbutton4 = new JoystickButton(driveController2, 4),
			lbutton5 = new JoystickButton(driveController2, 5),
			lbutton6 = new JoystickButton(driveController2, 6),
			lbutton7 = new JoystickButton(driveController2, 7),
			lbutton8 = new JoystickButton(driveController2, 8);
	public Joystick driveController1 = new Joystick(1);
	Button rbutton1 = new JoystickButton(driveController1, 1),
			rbutton2 = new JoystickButton(driveController1, 2),
			rbutton3 = new JoystickButton(driveController1, 3),
			rbutton4 = new JoystickButton(driveController1, 4),
			rbutton5 = new JoystickButton(driveController1, 5),
			rbutton6 = new JoystickButton(driveController1, 6),
			rbutton7 = new JoystickButton(driveController1, 7),
			rbutton8 = new JoystickButton(driveController1, 8);
	

	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());


public OI() {
	
}
}