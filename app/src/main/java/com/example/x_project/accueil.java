package com.example.x_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import worker8.com.github.radiogroupplus.RadioGroupPlus;

public class accueil extends AppCompatActivity {

    // declaration des variables

    RadioGroupPlus radioGroupPlus;
    Button soumettre, annuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        // assignation des variable


        radioGroupPlus = findViewById(R.id.radio_group);
        soumettre = findViewById(R.id.soumettre);
        annuler = findViewById(R.id.annuler);

        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //remmetre a 0 la selection
                radioGroupPlus.clearCheck();
            }
        });

        soumettre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pendre l'id de la sselection

                int id = radioGroupPlus.getCheckedRadioButtonId();

                //condition de la selection

                switch (id) {
                    case R.id.RB1:
                    // quand l'id est egal au premier button

                    String s = "premier choix";

                    //afficher un taost
                        displayToast (s);
                        break;

                    case R.id.RB2:
                        // quand l'id est egal au premier button

                        //afficher un taost
                        displayToast ("deuxieme choix");
                        break;
                    case R.id.RB3:
                        // quand l'id est egal au premier button



                        //afficher un taost
                        displayToast ("troisième choix");
                        break;



                }
            }
        });
        radioGroupPlus.setOnCheckedChangeListener(new RadioGroupPlus.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroupPlus group, int checkedId) {
                displayToast("vous avez selectionner "+ checkedId);
            }
        });
    }

    private void displayToast(String s) {
        Toast.makeText(getApplicationContext(),
                s,Toast.LENGTH_SHORT).show();
    }
}