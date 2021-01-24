
package com.odracir.android.ddmxmkt;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button buttonCallTour1, buttonCallTour2, buttonCallTour3, buttonCallTour4, buttonCallTour5, buttonCallTour6, buttonCallTour7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_rl);

    }


    public void getLocationTour1(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Rua+Quinta+do+Santo,+5000-062+Vila+Real");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //Douro Vintage Tours
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
        }
    public void getLocationTour2(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Largo+da+Estação,+Peso+da+Régua");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //CMTour
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void getLocationTour3(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Av.+João+Paulo+II,+5000-703+Vila+Real");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //CenáriosPT
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void getLocationTour4(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=R.+Souto+67,+Maia");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //The Other Side
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void getLocationTour5(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=R.+de+Barros+Lima+881,+Porto");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //Douro Exclusive
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void getLocationTour6(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Por Encontrar");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //Premium Tours
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
    public void getLocationTour7(View view){
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Praça+de+Mouzinho+de+Albuquerque+no113,+Porto");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);                                        //Tours No Douro
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }



        public void afterHomeLayoutButton(View view){
            setContentView(R.layout.after_home_rl);
        }

        public void tour1InfoLayoutButton(View view){
        setContentView(R.layout.tour1);

            buttonCallTour1 = findViewById(R.id.btnCallTour1);


            buttonCallTour1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+351962908798"));
                    startActivity(intent);
                }
            });

        }

        public void tour2InfoLayoutButton(View view){
        setContentView(R.layout.tour2);

        buttonCallTour2 = findViewById(R.id.btnCallTour2);


        buttonCallTour2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+351962033670"));
                startActivity(intent);
            }
        });

    }

        public void tour3InfoLayoutButton(View view){
        setContentView(R.layout.tour3);

        buttonCallTour3 = findViewById(R.id.btnCallTour3);


        buttonCallTour3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+351259338135"));
                startActivity(intent);
            }
        });

    }

        public void tour4InfoLayoutButton(View view){
        setContentView(R.layout.tour4);

        buttonCallTour4 = findViewById(R.id.btnCallTour4);


        buttonCallTour4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+351916500170"));
                startActivity(intent);
            }
        });

    }

        public void tour5InfoLayoutButton(View view){
        setContentView(R.layout.tour5);

        buttonCallTour5 = findViewById(R.id.btnCallTour5);


        buttonCallTour5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+351916328795"));
                startActivity(intent);
            }
        });

    }

        public void tour6InfoLayoutButton(View view){
        setContentView(R.layout.tour6);

        buttonCallTour6 = findViewById(R.id.btnCallTour6);


        buttonCallTour6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+351936000616"));
                startActivity(intent);
            }
        });

    }

        public void tour7InfoLayoutButton(View view){
        setContentView(R.layout.tour7);

        buttonCallTour7 = findViewById(R.id.btnCallTour7);


        buttonCallTour7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+351226191093"));
                startActivity(intent);
            }
        });

    }

}

