/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.team5492.FRC2014.commands;

/**
 *
 * @author Paul
 */
public class DriveCommand extends CommandBase{
    public DriveCommand(){
        requires(driveTrain);
    }

    protected void initialize(){
    }

    protected void execute(){
        CommandBase.driveTrain.chassis.arcadeDrive(CommandBase.oi.driveJoystick.getRawAxis(4), CommandBase.oi.shooterJoystick.getRawAxis(2));
    }

    protected boolean isFinished(){
        return true;
    }

    protected void end(){
    }

    protected void interrupted(){
    }
}
