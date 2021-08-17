package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Drivetrain extends SubsystemBase {

    TalonSRX leftFrontMotor = new TalonSRX(RobotMap.leftFrontMotor);
    TalonSRX leftRearMotor = new TalonSRX(RobotMap.leftRearMotor);
    TalonSRX rightFrontMotor = new TalonSRX(RobotMap.rightFrontMotor);
    TalonSRX rightRearMotor = new TalonSRX(RobotMap.rightRearMotor);

    public Drivetrain() {
        rightRearMotor.setInverted(true);

        leftFrontMotor.setNeutralMode(NeutralMode.Brake);
        leftRearMotor.setNeutralMode(NeutralMode.Brake);
        rightFrontMotor.setNeutralMode(NeutralMode.Brake);
        rightRearMotor.setNeutralMode(NeutralMode.Brake);
        
        leftRearMotor.follow(leftFrontMotor);
        rightRearMotor.follow(rightFrontMotor);
    }

    //the rear motors will follow what happens to the front motors
       //public void rearFollow() {
         // leftRearMotor.follow(leftFrontMotor);
         // rightRearMotor.follow(leftFrontMotor);
     //}
    
    // drive using control sticks (probably need to flip rightx and lefty and flip the leftmotor and right motor calculations in order to have a )
    public void drive() {
        double y = -1 * RobotContainer.driverPad.getLeftYAxis() * Constants.DRIVE_Y;
        double rot = RobotContainer.driverPad.getRightXAxis() * Constants.DRIVE_ROT;
    
        // Calculated Outputs (Limits Output to 12V)
        double leftOutput = rot + y ;
        double rightOutput = y - rot;
    
        // Assigns Each Motor's Power
        leftFrontMotor.set(ControlMode.PercentOutput, leftOutput);
        rightFrontMotor.set(ControlMode.PercentOutput, rightOutput);
        //leftRearMotor.set(ControlMode.PercentOutput, leftOutput);
        //rightRearMotor.set(ControlMode.PercentOutput, rightOutput);
    }

    // stop drive motors
    public void stopDrive() {
        leftFrontMotor.set(ControlMode.PercentOutput, 0);
        rightFrontMotor.set(ControlMode.PercentOutput, 0);
    }

    // Auto Methods

    public void driveforward(double speed) {
        leftFrontMotor.set(ControlMode.PercentOutput, speed);
        rightFrontMotor.set(ControlMode.PercentOutput, speed);
    }

    public void periodic() {
        drive();
    }
    
}
