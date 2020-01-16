package frc.robot;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.VictorSP;

public class Drive {
    static VictorSP frontLeftMotor = new VictorSP(RobotMap.kFrontLeftMotor);
    static VictorSP frontRightMotor = new VictorSP(RobotMap.kFrontRightMotor);
    static VictorSP backLeftMotor = new VictorSP(RobotMap.kBackLeftMotor);
    static VictorSP backRightMotor = new VictorSP(RobotMap.kBackRightMotor);

    static SpeedControllerGroup leftMotors= new SpeedControllerGroup( frontLeftMotor, backLeftMotor);
    static SpeedControllerGroup rightMotors= new SpeedControllerGroup( frontRightMotor, backRightMotor);

    public static void tankDrive (){
        leftMotors.set(OI.leftJoystick.getY());
        rightMotors.set(OI.rightJoystick.getX());
    }
    

}