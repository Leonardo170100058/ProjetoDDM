
package com.odracir.android.ddmxmkt;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*public final static String[] NECESSARY_PERMISSIONS =
            {
                    Manifest.permission.CALL_PHONE
            };

    public final int CALL_ME_ON_THIS_CODE_WHEN_THE_USER_REPLIES_TO_THE_REQ = 321;*/

    //DdmUtil ddmUtil;
    Button buttonCallTour1, buttonCallTour2, buttonCallTour3, buttonCallTour4, buttonCallTour5, buttonCallTour6, buttonCallTour7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_rl);

    }

    public void getLocationTour1(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
        }
    public void getLocationTour2(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
    }
    public void getLocationTour3(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
    }
    public void getLocationTour4(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
    }
    public void getLocationTour5(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
    }
    public void getLocationTour6(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
    }
    public void getLocationTour7(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:19.067,72.877"));
        startActivity(intent);
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

    /*void init(){

        ddmUtil = new DdmUtil(this);

        ddmUtil.requestNecessaryPermissionsNotYetGranted(
                NECESSARY_PERMISSIONS,
                CALL_ME_ON_THIS_CODE_WHEN_THE_USER_REPLIES_TO_THE_REQ
        );
    }//init

    void actionCheckPermissions(){
        String strCurrentPermissionsStatus =
                ddmUtil.permissionsStatusToString(NECESSARY_PERMISSIONS);

        ddmUtil.fb(strCurrentPermissionsStatus);
    }//actionCheckPermissions*/

}

