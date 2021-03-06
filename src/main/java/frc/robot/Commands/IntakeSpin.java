// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.Constants;

public class IntakeSpin extends CommandBase {
  /** Creates a new IntakeSpin. */
  public IntakeSpin() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {  
    RobotContainer.intake.runIntake(Constants.INTAKE_SPEED);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}
  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.intake.brakeIntake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
