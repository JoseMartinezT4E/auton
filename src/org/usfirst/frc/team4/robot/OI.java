package org.usfirst.frc.team4.robot;

import org.usfirst.frc.team4.robot.commands.driveToggle;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public double leftY(Joystick cont){
    	return cont.getRawAxis(RobotMap.CONT_LY);
    }
    
    public double rightY(Joystick cont){
    	return cont.getRawAxis(RobotMap.CONT_RY);
    }
    
    public double leftX(Joystick cont){
    	return cont.getRawAxis(RobotMap.CONT_LX);
    }
    
    public double rightX(Joystick cont){
    	return cont.getRawAxis(RobotMap.CONT_RX);
    }
    
    public double buttonB(Joystick cont){
    	return cont.getRawAxis(RobotMap.CONT_B);
    }
    
    public OI() {
    	RobotMap.driveB.whenPressed(new driveToggle());
    }
}

