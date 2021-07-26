package com.example.meepmeeptrajectories;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.core.colorscheme.scheme.ColorSchemeRedDark;

public class TrajectoriesTest {
    public static void main(String[] args) {
        // TODO: If you experience poor performance, enable this flag
        System.setProperty("sun.java2d.opengl", "true");

        MeepMeep mm = new MeepMeep(800)
                .setBackground(MeepMeep.Background.FIELD_ULTIMATE_GOAL_DARK)
                .setTheme(new ColorSchemeRedDark())
                .setBackgroundAlpha(1f)
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .followTrajectorySequence(drive ->
                        drive.trajectorySequenceBuilder(new Pose2d(0, 0, 0))
                                .forward(30)
                                .turn(Math.toRadians(60))
                                .forward(30)
                                .turn(Math.toRadians(60))
                                .forward(30)
                                .turn(Math.toRadians(60))
                                .forward(30)
                                .turn(Math.toRadians(60))
                                .forward(30)
                                .turn(Math.toRadians(60))
                                .forward(30)

                                .build()
                )
                .start();
    }
}