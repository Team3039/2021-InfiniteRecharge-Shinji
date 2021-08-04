// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;



import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;
import frc.robot.RobotMap;




/** Add your docs here. */
public class Revolver extends SubsystemBase {

 public Spark revolver = new Spark(RobotMap.revolverMotor);




 public void spinRevolver() {
     revolver.set(Constants.REVOLVER_SPEED);
 }

 public void stopRevolver() {
     revolver.set(0);
 }





  


}

