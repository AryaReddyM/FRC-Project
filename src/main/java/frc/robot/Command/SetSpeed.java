package frc.robot.Command;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Systems.RobotSystem;

public class SetSpeed extends Command {
    RobotSystem robotSystem;
    XboxController xboxCtrl;

    public SetSpeed(RobotSystem robotSystem, XboxController xboxController) {
        this.robotSystem = robotSystem;
        xboxCtrl = xboxController;

        //robotSystem.setDefaultCommand(this);
        addRequirements(robotSystem);
    }

    @Override
    public void execute() {
        double speed = Math.min(Math.max(xboxCtrl.getLeftX(), -0.5), 0.5);

        robotSystem.setMotorSpeed(speed);
    }
}
