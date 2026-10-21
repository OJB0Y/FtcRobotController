package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;



@TeleOp
public class roBOCAts extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello", "Orane!");
    }

    @Override
    public void loop() {
        //empty
    }
}
