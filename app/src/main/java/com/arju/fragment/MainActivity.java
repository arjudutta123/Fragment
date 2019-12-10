package com.arju.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.arju.fragment.Fragments.Automorphic;
import com.arju.fragment.Fragments.first_fragments;
import com.arju.fragment.Fragments.sencond_fragments;
import com.arju.fragment.Fragments.third_fragments;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnfirstfragments;
    private Boolean status=true;
    private Button btnSwaofragment;
    private Button btnAreaOfCircle;
    private Button AutoMorphic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnfirstfragments=findViewById(R.id.btnfirstfragments);
        btnSwaofragment=findViewById(R.id.btnSwapfragments);
        btnAreaOfCircle=findViewById(R.id.btnAreaCirclefragments);
        AutoMorphic=findViewById(R.id.btnAutoMorphic);
        AutoMorphic.setOnClickListener(this);




        btnfirstfragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                if(status){
                    first_fragments firstFragments=new first_fragments();
                    fragmentTransaction.replace(R.id.fragmentContainner,firstFragments);
                    fragmentTransaction.commit();
                    fragmentTransaction.addToBackStack(null);
                    btnfirstfragments.setText("Load Second Fragments");
                    status=false;
                }else{

                    sencond_fragments secondFragments=new sencond_fragments();
                    fragmentTransaction.replace(R.id.fragmentContainner,secondFragments);
                    fragmentTransaction.commit();
                    fragmentTransaction.addToBackStack(null);
                    btnfirstfragments.setText("Load first Fragments");
                    status=true;
                }
            }
        });
        btnSwaofragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                third_fragments tf=new third_fragments();

                fragmentTransaction.replace((R.id.fragmentContainner) ,tf);
                fragmentTransaction.commit();

            }
        });
        btnAreaOfCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                sencond_fragments second_fragments=new sencond_fragments();
                fragmentTransaction.replace((R.id.fragmentContainner),second_fragments);
                fragmentTransaction.commit();

            }
        });
    }


    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        Automorphic autoMorphic=new Automorphic();
        fragmentTransaction.replace(R.id.fragmentContainner,autoMorphic);
        fragmentTransaction.commit();
    }
}




