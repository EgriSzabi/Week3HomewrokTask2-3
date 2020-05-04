package com.example.week3task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private List<String> spinnerContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        setSpinnerSource();
        spinner.setAdapter(getSpinnerAdapter());
    }
    private void setSpinnerSource() {
        spinnerContent=new ArrayList<>();
        spinnerContent.add("Cupcake");
        spinnerContent.add("Donut");
        spinnerContent.add("Eclair");
        spinnerContent.add("KitKat");
        spinnerContent.add("Pie");

    }

    private ArrayAdapter<String> getSpinnerAdapter(){

        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerContent);

    }
    public void spinnerOnClick(View view){
        Toast.makeText(this, "Selected: "+ spinner.getSelectedItem().toString(), Toast.LENGTH_LONG ).show();

    }
}
