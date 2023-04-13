package my.edu.utar.mymedic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class AddMedicine extends AppCompatActivity {

    private ImageButton homeButton;
    private Button addThisMedicineButton;
    private ImageButton medicationButton;
    private ImageButton reminderButton;
    private ImageButton reportButton;
    private ImageButton selectedButton;
    private ImageButton tabletButton;
    private ImageButton dropButton;
    private ImageButton injectionButton;
    private String medicineType;
    private TextView medicineTypeTV;
    private TextInputEditText medicineName;
    private TextInputEditText initialVolume;
    private TextInputEditText dose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);

        homeButton = findViewById(R.id.home_button);
        addThisMedicineButton = findViewById(R.id.addthismedicine_button);
        medicationButton = findViewById(R.id.medication_button);
        reminderButton = findViewById(R.id.reminder_button);
        reportButton = findViewById(R.id.report_button);
        tabletButton = findViewById(R.id.tablet_button);
        dropButton = findViewById(R.id.drop_button);
        injectionButton = findViewById(R.id.injection_button);
        medicineTypeTV = findViewById(R.id.medicinetype_tv);
        medicineName = findViewById(R.id.medicine_name);
        initialVolume = findViewById(R.id.initial_volume);
        dose = findViewById(R.id.dose);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMedicine.this, UserMainMenu.class);
                startActivity(intent);
            }
        });

        tabletButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medicineType = "tablet";
                medicineTypeTV.setText("Select Medicine Type: tablet");
            }
        });

        dropButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medicineType = "drop";
                medicineTypeTV.setText("Select Medicine Type: drop");
            }
        });

        injectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                medicineType = "injection";
                medicineTypeTV.setText("Select Medicine Type: injection");
            }
        });

        addThisMedicineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        medicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMedicine.this, MedicationMenu.class);
                startActivity(intent);
            }
        });

        reminderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMedicine.this, ReminderMenu.class);
                startActivity(intent);
            }
        });

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddMedicine.this, ReportMenu.class);
                startActivity(intent);
            }
        });
    }

}