
package com.team5492.FRC2014;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
    public Joystick driveJoystick = new Joystick(RobotMap.JoystickDriver);
    public Joystick shooterJoystick = new Joystick(RobotMap.JoystickShooter);
}

