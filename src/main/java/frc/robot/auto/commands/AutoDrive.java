// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.auto.commands;

import java.util.Timer;
import java.util.TimerTask;
import frc.robot.RobotContainer;


import edu.wpi.first.wpilibj2.command.CommandBase;

public class AutoDrive extends CommandBase { 
  /** Creates a new AutoDrive. */

 
 //  edu.wpi.first.wpilibj.Timer timer;
 //  double seconds;

 
  public AutoDrive() {
 //   timer = new edu.wpi.first.wpilibj.Timer();
 //   this.seconds = seconds;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  //   timer.reset();
  //   timer.start();
 
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
 //    while (timer.get() < seconds) {   
       RobotContainer.drivetrain.driveForward(.2);
    }
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
     RobotContainer.drivetrain.stopDrive();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}