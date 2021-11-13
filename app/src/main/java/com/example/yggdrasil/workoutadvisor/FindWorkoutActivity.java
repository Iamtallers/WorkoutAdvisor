package com.example.yggdrasil.workoutadvisor;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindWorkoutActivity extends Activity {

    private WorkoutExpert expert= new WorkoutExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_workout);

    }


    public void onClickFindWorkout (View view){

        TextView workouts= (TextView)findViewById(R.id.workout);

        Spinner workouttype= (Spinner) findViewById(R.id.workouttype);

        String workout = String.valueOf(workouttype.getSelectedItem());

        //workouts.setText(workout);
        List<String> workoutlist = expert.getWorkouts(workout);

        StringBuilder workoutsFormated= new StringBuilder();

        for (String work :workoutlist){

            workoutsFormated.append(work).append('\n');
        }

        workouts.setText(workoutsFormated);


    }

}
