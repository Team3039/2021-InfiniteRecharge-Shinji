// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Spark;

import frc.robot.RobotMap;
import frc.robot.Constants;


public class Climber extends SubsystemBase {

  Spark climber = new Spark(RobotMap.climber);
  Spark robotRaise = new Spark(RobotMap.robotRaise);
  Spark robotRaise2 = new Spark(RobotMap.robotRaise2);

  /** Creates a new Climb. */
  public Climber() {}

   
  public void raiseClimber(double speed) {
    climber.set(speed);
  }

  public void raiseRobot(double speed) {
    robotRaise.set(speed);
    robotRaise2.set(speed);
  }

 
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
