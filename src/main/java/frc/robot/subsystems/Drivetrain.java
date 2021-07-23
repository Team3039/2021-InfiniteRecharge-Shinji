package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonFXConfiguration;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.RobotContainer;

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
    public void driveTrain() {
        double y = RobotContainer.driverpad.getLeftYAxis() * Constants.DRIVE_Y;
        double rot = RobotContainer.driverpad.getRightXAxis() * Constants.DRIVE_ROT;

        double leftMotor = y - rot;
        double rightMotor = rot - y;

        leftFrontMotor.set(ControlMode.PercentOutput.leftMotor);
        rightFrontMotor.set(ControlMode.PercentOutput.rightMotor);
    }




    
}
