/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team5492.FRC2014.subsystems;

import com.team5492.FRC2014.RobotMap;
import com.team5492.FRC2014.commands.DriveCommand;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;

public class DriveTrain extends Subsystem {
    public RobotDrive chassis = new RobotDrive(RobotMap.PWMLeftBack,RobotMap.PWMLeftBack,
                                    RobotMap.PWMRightFront, RobotMap.PWMRightBack);
    public void initDefaultCommand(){
        setDefaultCommand(new DriveCommand());
    }
}
