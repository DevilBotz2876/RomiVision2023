// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final double kPTurn = 0.01;

    public static final double kPRange = 0.6;

    // How far from the target we want to be
    public static final double GOAL_RANGE_METERS = Units.inchesToMeters(36);

    // minimum speed needed to make romi start moving.
    public static final double MIN_SPEED_MOVE = .25;
    
    // how much speed to add to pid output
    public static final double RANGE_SPEED_MOD = .45;

    public static final double RANGE_SPEED_FWD_MAX = .7;
    public static final double RANGE_SPEED_REV_MAX = .9;

    // how much speed ot add to pid output
    //public static final double ROT_SPEED_MOD = 0.0;
    public static final double ROT_SPEED_MOD = 0.15;
    

    
}
