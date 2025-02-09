// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.AutoCommands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

public class FollowTheYellowBrickRoad extends CommandBase {
  /** Creates a new FollowTheYellowBrickRoad. */
  private ColorSensing c1;
  private SwerveSpinners swerve;
  
  public FollowTheYellowBrickRoad(SwerveSpinners swerve, ColorSensing c1) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(swerve);
    this.swerve = swerve;
    this.c1 = c1;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (c1.getDistanceFromLine() == 0.5)
    {
      swerve.tankSwerve(0.5, 1);
    }
    else
    {
      swerve.tankSwerve(1, 0.5);
    }
    

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}