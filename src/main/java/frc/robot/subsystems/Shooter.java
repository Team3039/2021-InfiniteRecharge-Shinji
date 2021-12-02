// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotMap;
import frc.robot.RobotContainer;


public class Shooter extends SubsystemBase {
  /** Creates a new Shooter. */

  public TalonSRX shooterA = new TalonSRX(RobotMap.shooterA);
  public TalonSRX shooterB = new TalonSRX(RobotMap.shooterB); 

  //only use this one if we don't have cmaera
  //public int distanceCounter;



  public Shooter() {
    shooterB.follow(shooterA);

    shooterA.setNeutralMode(NeutralMode.Coast);
    shooterB.setNeutralMode(NeutralMode.Coast);

    shooterA.setInverted(true);
    shooterB.setInverted(false);

  }
  //starts the shooter motors
  public void setShooterSpeed(double speed) {
    shooterA.set(ControlMode.PercentOutput, speed);
  }


  // use these if we don't have camera to track distance
  
  // Manually choose speed
  // public void setDistance(int distance) {
  //   distanceCounter = distance;
  // }
  // Check the requested distance counter and then use that to spin the shooter at that speed.
  // public void setShooterSpeedNoCam() {
  //   if (distanceCounter == 0) {
  //     shooterA.set(ControlMode.PercentOutput, Constants.NEAR_SHOT_SPEED); }

  //   else if (distanceCounter == 1) {
  //     shooterA.set(ControlMode.PercentOutput, Constants.NEAR_MID_SHOT_SPEED); }

  //   else if (distanceCounter == 2) {
  //     shooterA.set(ControlMode.PercentOutput, Constants.FAR_MID_SHOT_SPEED); }

  //   else if (distanceCounter == 3) {
  //     shooterA.set(ControlMode.PercentOutput, Constants.FAR_SHOT_SPEED); }
  //   }

  


  @Override
  public void periodic() {
    // System.out.println(distanceCounter);
    // This method will be called once per scheduler run
  }
}

