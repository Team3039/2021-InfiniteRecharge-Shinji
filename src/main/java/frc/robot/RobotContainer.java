// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.Button;
import frc.robot.Commands.IntakeActuate;
import frc.robot.Commands.IntakeSpin;
import frc.robot.Commands.RunIntake;
import frc.robot.Commands.RunRevolver;
import frc.robot.Commands.SetDistanceCounter;
import frc.robot.Commands.StartShooter;
import frc.robot.Commands.StartShooterNoCam;
import frc.robot.controllers.PS4Gamepad;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Revolver;
import frc.robot.subsystems.Shooter;
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
   public static Shooter shooter = new Shooter();

   public static PS4Gamepad driverPad = new PS4Gamepad(0);
   public static PS4Gamepad operatorPad = new PS4Gamepad(1);


   Button driverX = driverPad.getButtonX();
   Button driverSquare = driverPad.getButtonSquare();
   Button driverTriangle = driverPad.getButtonTriangle();
   Button driverCircle = driverPad.getButtonCircle();

   Button driverShare = driverPad.getShareButton();
   Button driverOptions = driverPad.getOptionsButton();
   Button driverPadButton = driverPad.getButtonPad();
   Button driverStartButton = driverPad.getStartButton();

   Button driverL1 = driverPad.getL1();
   Button driverL2 = driverPad.getL2();
   Button driverL3 = driverPad.getL3();
   Button driverR1 = driverPad.getR1();
   Button driverR2 = driverPad.getR2();
   Button driverR3 = driverPad.getR3();

   Button driverDPadUp = driverPad.getDPadUp();
   Button driverDPadDown = driverPad.getDPadDown();
   Button driverDPadLeft = driverPad.getDPadLeft();
   Button driverDPadRight = driverPad.getDPadRight();


   Button operatorTriangle = operatorPad.getButtonTriangle();
   Button operatorSquare = operatorPad.getButtonSquare();
   Button operatorCircle = operatorPad.getButtonCircle();
   Button operatorX = operatorPad.getButtonX();

   Button operatorShare = operatorPad.getShareButton();
   Button operatorOptions = operatorPad.getOptionsButton();
   Button operatorPadButton = operatorPad.getButtonPad();
   Button operatorStartButton = operatorPad.getStartButton();

   Button operatorL1 = operatorPad.getL1();
   Button operatorL2 = operatorPad.getL2();
   Button operatorR1 = operatorPad.getR1();
   Button operatorR2 = operatorPad.getR2();
   
   Button operatorDPadDown = operatorPad.getDPadDown();
   Button operatorDPadUp = operatorPad.getDPadUp();
   Button operatorDPaLeft = operatorPad.getDPadLeft();
   Button operatorDPadRight = operatorPad.getDPadRight();

  
  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    configureButtonBindings();
  }


  private void configureButtonBindings() {
    operatorL2.whileHeld(new RunRevolver());
 
    operatorSquare.whileHeld(new RunIntake(true));

    operatorDPadDown.whenPressed(new SetDistanceCounter(0));
    operatorDPaLeft.whenPressed(new SetDistanceCounter(1));
    operatorDPadRight.whenPressed(new SetDistanceCounter(2));
    operatorDPadUp.whenPressed(new SetDistanceCounter(3));

    operatorR2.toggleWhenPressed(new StartShooterNoCam());

    //operatorR2.toggleWhenPressed(new StartShooter());
    
    operatorShare.toggleWhenPressed(new IntakeActuate(true));
    operatorOptions.whileHeld(new IntakeSpin());

    driverDPadDown.whenPressed(new SetDistanceCounter(0));
    driverDPadLeft.whenPressed(new SetDistanceCounter(1));
    driverDPadRight.whenPressed(new SetDistanceCounter(2));
    driverDPadUp.whenPressed(new SetDistanceCounter(3));

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