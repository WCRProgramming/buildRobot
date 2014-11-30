package com.team5492.FRC2014;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
    //-----Joysticks-----//    
    public static final int JoystickDriver = 1;
    public static final int JoystickShooter = 2;
    
    //-----Digital Sidecar #1 PWM -----//
    public static final int PWMLeftFront = 1;
    public static final int PWMLeftBack = 2;
    public static final int PWMRightFront = 3;
    public static final int PWMRightBack = 4;
    public static final int PWMShooter = 5;
    public static final int PWMArm = 6;
    
    //-----Digital Sidecar #1 Digitial Inputs -----//
    //Limit Switches
    public static final int DIArmLimitSwitch = 1;
}
