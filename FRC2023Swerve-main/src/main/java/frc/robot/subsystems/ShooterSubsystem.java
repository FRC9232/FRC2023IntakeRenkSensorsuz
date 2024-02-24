package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.*;

public class ShooterSubsystem extends SubsystemBase {
    private VictorSPX rightMotor;
    private VictorSPX leftMotor;

    public ShooterSubsystem(){
        rightMotor = new VictorSPX(6);
        leftMotor = new VictorSPX(5);
    
       rightMotor.setSelectedSensorPosition(0);
        leftMotor.setSelectedSensorPosition(0);
        }

    public void setShooter(Boolean open){
        if (open == true){
            rightMotor.setInverted(true);
            //leftMotor.follow(rightMotor);
            leftMotor.setInverted(false);
            rightMotor.set(ControlMode.PercentOutput, -1);
            leftMotor.set(ControlMode.PercentOutput, -1);
        }
        else{
            rightMotor.set(ControlMode.PercentOutput, 0);
            leftMotor.set(ControlMode.PercentOutput, 0);
        }
    }
    public void amphShoot(){
         rightMotor.setInverted(true);
         leftMotor.setInverted(false);
         rightMotor.set(ControlMode.PercentOutput, -0.13);
         leftMotor.set(ControlMode.PercentOutput, -0.13);
     
    }





}