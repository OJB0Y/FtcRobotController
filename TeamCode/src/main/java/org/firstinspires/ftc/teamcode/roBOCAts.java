package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;



@TeleOp
public class roBOCAts extends OpMode {

    //private list of motors and stuff
    private DcMotor BR; //back left, right, etc

    @Override
    public void init() {
        telemetry.addData("Hello", "Orane!");
    }

    @Override
    public void loop() {
        //empty
    }
}
