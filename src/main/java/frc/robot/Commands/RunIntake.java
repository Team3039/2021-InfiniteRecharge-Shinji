// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;


public class RunIntake extends CommandBase {
  /** Creates a new RunIntake. */
  boolean actuated;
  public RunIntake(boolean actuaded) {
    this.actuated = actuated;
    addRequirements(RobotContainer.intake);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    RobotContainer.intake.actuateIntake(true);
    RobotContainer.intake.runIntake(Constants.INTAKE_SPEED); 
  }
//actuate intake, run wheels, delease
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.intake.brakeIntake();
    RobotContainer.intake.actuateIntake(false);
    }

  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
