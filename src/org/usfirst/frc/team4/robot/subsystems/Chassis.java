package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
import org.usfirst.frc.team4.robot.commands.drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Chassis extends Subsystem {
    
	public boolean isTankDrive = true;
	
    private VictorSP rightFwd;
    private VictorSP rightBwd; 
    private VictorSP leftFwd; 
    private VictorSP leftBwd;
    private RobotDrive drive;
    
    public Chassis(){
    	rightFwd = new VictorSP (RobotMap.CHASSIS_MOTOR_RIGHTFRONT);
    	rightBwd = new VictorSP (RobotMap.CHASSIS_MOTOR_RIGHTREAR);
    	leftFwd = new VictorSP (RobotMap.CHASSIS_MOTOR_LEFTFRONT);
    	leftBwd = new VictorSP (RobotMap.CHASSIS_MOTOR_LEFTREAR);
    	
    	drive = new RobotDrive (rightFwd, rightBwd, leftFwd, leftBwd);
    	
    }

    public void initDefaultCommand() {
        setDefaultCommand(new drive());
    }
    
    public void tankDrive(double left, double right){
    	drive.tankDrive(left, right);
    }
    
    public void arcadeDrive(double left, double right){
    	drive.arcadeDrive(left, right);
    }
    
    public void autonDrive(){
    	tankDrive(.75,.75);
    }
    
    public void toggleDrive(){
    	isTankDrive = !isTankDrive;
    }
    
    public void stop(){
    	tankDrive(0,0);
    	arcadeDrive(0,0);
    }
}

