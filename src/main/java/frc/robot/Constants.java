// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

// Drive
 public static final double DRIVE_Y = .85;
 public static final double DRIVE_ROT = .7;

// Revolver

// Shooter
 public static final double NEAR_SHOT_SPEED = .3;
 public static final double MID_SHOT_SPEED = .5;
 public static final double FAR_SHOT_SPEED = .7;

// Climb
 public static final double RAISE_CLIMB_SPEED = .5 * -1;
 public static final double RAISE_ROBOT_SPEED = .5 * -1;
}