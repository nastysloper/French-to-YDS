package com.nastysloper.frenchgrades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List conversion = new ArrayList<String>();
        ListView listView = (ListView) findViewById(R.id.french_to_yds_list);
        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.french_grades));
        while (scanner.hasNextLine()) {
            conversion.add(scanner.nextLine());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, new ArrayList<String>(conversion));
        listView.setAdapter(adapter);
    }
}
