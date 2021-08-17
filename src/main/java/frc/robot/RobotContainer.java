// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.Commands.RunRevolver;
import frc.robot.Commands.RunIntake;
import frc.robot.controllers.PS4Gamepad;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Revolver;
import frc.robot.subsystems.Intake;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
   public static Drivetrain drivetrain = new Drivetrain();
   public static Revolver revolver = new Revolver();
   public static Intake intake = new Intake();

   public static PS4Gamepad driverPad = new PS4Gamepad(0);

   Button driverL2 = driverPad.getL2();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
  }


  private void configureButtonBindings() {
    driverL2.whileHeld(new RunRevolver());
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
  
    return null;
  }

}