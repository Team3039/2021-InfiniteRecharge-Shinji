// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;

import frc.robot.RobotMap;
import frc.robot.Constants;


public class Climb extends SubsystemBase {

  Spark climber = new Spark(RobotMap.climber);

  /** Creates a new Climb. */
  public Climb() {}

   
  public void extendClimber(double speed) {
    climber.set(speed);
  }

  public void retractClimber(double speed) {
    climber.set(speed * -1);
  }

 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
