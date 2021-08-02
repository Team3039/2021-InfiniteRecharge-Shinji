package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.RobotMap;

public class Drivetrain {
    
    TalonFX leftFrontMotor = new TalonFX(RobotMap.leftFrontMotor);
    TalonFX leftRearMotor = new TalonFX(RobotMap.leftRearMotor);
    TalonFX rightFrontMotor = new TalonFX(RobotMap.rightFrontMotor);
    TalonFX rightRearMotor = new TalonFX(RobotMap.rightRearMotor);


    // the rear motors will follow what happens to the front motors
    public void rearFollow() {
        leftRearMotor.follow(leftFrontMotor);
        rightRearMotor.follow(leftFrontMotor);
    }
    
    // drive using control sticks
    public void drive() {
        double y = RobotContainer.driverpad.getLeftYAxis() * Constants.DRIVE_Y;
        double rot = RobotContainer.driverpad.getRightXAxis() * Constants.DRIVE_ROT;

        double leftMotor = y + rot;
        double rightMotor = rot - y;

        leftFrontMotor.set(ControlMode.PercentOutput, leftMotor);
        rightFrontMotor.set(ControlMode.PercentOutput, rightMotor);
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
