package com.example.shashankgoud.myplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
public class CourseCustomization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_customization);


    }

    public void clearOnClick(View view) {
        final CheckBox checkbox_Piazza = (CheckBox) findViewById(R.id.checkbox_Piazza);
        final CheckBox checkbox_InstNotes = (CheckBox) findViewById(R.id.checkbox_InstNotes);
        final CheckBox checkbox_UnreadNotification = (CheckBox) findViewById(R.id.checkbox_UnreadNotification);
        final CheckBox checkbox_CourseWebsite = (CheckBox) findViewById(R.id.checkbox_CourseWebsite);
        final CheckBox checkbox_LectureSlides = (CheckBox) findViewById(R.id.checkbox_LectureSlides);
        final CheckBox checkbox_LectureNotes = (CheckBox) findViewById(R.id.checkbox_LectureNotes);
        final CheckBox checkbox_Moodle = (CheckBox) findViewById(R.id.checkbox_Moodle);
        final CheckBox checkbox_Announcements = (CheckBox) findViewById(R.id.checkbox_Announcements);
        final CheckBox checkbox_PendingAssignments = (CheckBox) findViewById(R.id.checkbox_PendingAssignments);

        final RadioButton radio_LastWeek=(RadioButton) findViewById(R.id.radio_LastWeek);
        final RadioButton radio_Last3Days=(RadioButton) findViewById(R.id.radio_Last3Days);
        final RadioButton radio_LastWeek2=(RadioButton) findViewById(R.id.radio_LastWeek2);
        final RadioButton radio_Last3Days2=(RadioButton) findViewById(R.id.radio_Last3Days2);
        final RadioButton radio_LastWeek3=(RadioButton) findViewById(R.id.radio_LastWeek3);
        final RadioButton radio_Last3Days3=(RadioButton) findViewById(R.id.radio_Last3Days3);

        if (checkbox_Piazza.isChecked()) {
            checkbox_Piazza.setChecked(false);
        }
        if (checkbox_InstNotes.isChecked()) {
            checkbox_InstNotes.setChecked(false);
        }
        if (checkbox_UnreadNotification.isChecked()) {
            checkbox_UnreadNotification.setChecked(false);
        }
        if (checkbox_CourseWebsite.isChecked()) {
            checkbox_CourseWebsite.setChecked(false);
        }
        if (checkbox_LectureSlides.isChecked()) {
            checkbox_LectureSlides.setChecked(false);
        }
        if (checkbox_LectureNotes.isChecked()) {
            checkbox_LectureNotes.setChecked(false);
        }
        if (checkbox_Moodle.isChecked()) {
            checkbox_Moodle.setChecked(false);
        }
        if (checkbox_Announcements.isChecked()) {
            checkbox_Announcements.setChecked(false);
        }
        if (checkbox_PendingAssignments.isChecked()) {
            checkbox_PendingAssignments.setChecked(false);
        }
        if (radio_LastWeek.isChecked()) {
            radio_LastWeek.setChecked(false);
        }
        if (radio_Last3Days.isChecked()) {
            radio_Last3Days.setChecked(false);
        }
        if (radio_LastWeek2.isChecked()) {
            radio_LastWeek2.setChecked(false);
        }
        if (radio_Last3Days2.isChecked()) {
            radio_Last3Days2.setChecked(false);
        }
        if (radio_LastWeek3.isChecked()) {
            radio_LastWeek3.setChecked(false);
        }
        if (radio_Last3Days3.isChecked()) {
            radio_Last3Days3.setChecked(false);
        }

    }

    public void onCourseCustomizeSaveClick(View view) {
        Intent i=new Intent(CourseCustomization.this, Customize_Updates.class);
        startActivity(i);
    }
}
