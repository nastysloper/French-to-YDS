package com.nastysloper.frenchgrades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List french_to_yds_grades = new ArrayList<String>();
        ListView listView1 = (ListView) findViewById(R.id.conversion_list);

        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.french_grade_conversion));
        while (scanner.hasNextLine()) {
            french_to_yds_grades.add(scanner.nextLine());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, new ArrayList<String>(french_to_yds_grades));
        listView1.setAdapter(adapter);

    }
}
