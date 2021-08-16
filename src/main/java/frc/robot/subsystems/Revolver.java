// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;
import frc.robot.RobotMap;




/** Add your docs here. */
public class Revolver extends SubsystemBase {

 public CANSparkMax revolver = new CANSparkMax(RobotMap.revolverMotor, MotorType.kBrushed);

//this method spins the revolver at the speed given to it (which can also be 0, aka no spin)
 public void revolverSpin(double speed) {
     revolver.set(speed);
 }

 //public void stopRevolver() {
     //revolver.set(0);
//}





  


}

