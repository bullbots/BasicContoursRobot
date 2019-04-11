package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

public class RobotPIDSubsystem extends PIDSubsystem {

    public RobotPIDSubsystem() {
        super("RobotPIDSubsystem", 0.001, 0, 0);
    }

    @Override
    protected double returnPIDInput() {
        return 0;
    }

    @Override
    protected void usePIDOutput(double output) {
        
    }

    @Override
    protected void initDefaultCommand() {

    }

}