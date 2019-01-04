package com.example.chintan.research.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.chintan.research.R;
import com.levitnudi.legacytableview.LegacyTableView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LegacyTableView legacyTableView = findViewById(R.id.legacy_table_view);

        LegacyTableView.insertLegacyTitle("Id", "Name", "Age", "Email");

        LegacyTableView.insertLegacyContent("2999010", "John Deer", "50", "john@example.com",
                "332312", "Kennedy F", "33", "ken@example.com"
                , "42343243", "Java Lover", "28", "Jlover@example.com"
                , "4288383", "Mike Tee", "22", "miket@example.com");


        legacyTableView.setTitle(LegacyTableView.readLegacyTitle());
        legacyTableView.setContent(LegacyTableView.readLegacyContent());
        legacyTableView.setZoomEnabled(true);
        legacyTableView.setShowZoomControls(true);

        legacyTableView.build();
    }
}
