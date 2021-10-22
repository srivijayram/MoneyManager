package com.example.moneymanagerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Income extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_income);
        button1 = findViewById(R.id.button7);
        button1.setOnClickListener(view -> openExpense());
    }
    public void openExpense() {
        Intent intent = new Intent(getApplicationContext(), Expenses.class);
        startActivity(intent);
    }
}