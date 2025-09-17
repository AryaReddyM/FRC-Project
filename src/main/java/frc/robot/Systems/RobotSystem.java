package frc.robot.Systems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;

public class RobotSystem extends SubsystemBase {
    TalonSRX talon;

    public RobotSystem(int ID) {
        talon = new TalonSRX(ID);

    }

    public void setMotorSpeed(double speed) {
        talon.set(ControlMode.PercentOutput, speed);
    }

    // @Override
    // public void setDefaultCommand(Command defaultCommand) {
    //     super.setDefaultCommand(defaultCommand);
    // }
}