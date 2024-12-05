package com.example.incercaretest;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // List to hold School objects
        List<School> schools = new ArrayList<>();

        // Add School objects using DateConverter for date parsing
        schools.add(new School("Math", DateConverter.fromString("10-12-2023"), 9.5f, true));
        schools.add(new School("Physics", DateConverter.fromString("15-12-2023"), 8.7f, false));
        schools.add(new School("Chemistry", DateConverter.fromString("20-12-2023"), 10.0f, true));

        // Reference to the ListView
        ListView listView = findViewById(R.id.listView);

        // Create and set the custom adapter
        SchoolAdapter adapter = new SchoolAdapter(
                this,
                R.layout.item_student, // XML layout for a single item
                schools,
                getLayoutInflater()
        );
        listView.setAdapter(adapter);
    }
}
