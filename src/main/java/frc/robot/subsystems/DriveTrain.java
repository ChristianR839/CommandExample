// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {

  private Talon talonLeft1 = new Talon(0);
  private Talon talonLeft2 = new Talon(1);
  private Talon talonRight1 = new Talon(2);
  private Talon talonRight2 = new Talon(3);

  private final SpeedController leftController = new SpeedControllerGroup(talonLeft1, talonLeft2);
  private final SpeedController rightController = new SpeedControllerGroup(talonRight1, talonRight2);
  
  private final DifferentialDrive fourWheels = new DifferentialDrive(leftController, rightController);

  public DriveTrain() {}
 
  public void drive(final double left, final double right) { 
    fourWheels.tankDrive(left, right);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
