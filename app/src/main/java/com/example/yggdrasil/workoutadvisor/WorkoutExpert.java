package com.example.yggdrasil.workoutadvisor;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert {

    List<String> getWorkouts(String workouttypes) {
        List<String> workout = new ArrayList<>();


        if (workouttypes.equals("Chest"))

        {
            workout.add("Bench Press");
            workout.add("Push ups");
        } else if (workouttypes.equals("Triceps"))

        {
            workout.add("Skull Crushers");
            workout.add("That Funny Machine");
        } else if (workouttypes.equals("Biceps"))

        {
            workout.add("Curls");
            workout.add("Chin ups");
        } else if (workouttypes.equals("Shoulders"))

        {
            workout.add("Rows LoL");
            workout.add("Side arm thingies");
        }

        return workout;
    }

}






