package com.example.fragmenttransaction_events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements FragmentListener {
    private FrameLayout frameLayout;
    FragmentA fragmentA=new FragmentA();
    FragmentB fragmentB=new FragmentB();
    FragmentC fragmentC=new FragmentC();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=findViewById(R.id.container);
        launchA();
    }

    @Override
    public void onFragmentDataPassed(Bundle bundle, String string) {
        if(string.equals("B"))
            launchB(bundle);
        else if(string.equals("C"))
            launchC(bundle);
    }
    private void launchA() {
        fragmentA.setFragmentListener(this);
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragmentA,"fragA")
                .addToBackStack("fragA").commit();
    }
    private void launchB(Bundle bundle) {
        fragmentB.setFragmentListener(this);
        fragmentB.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragmentB,"fragB")
                .addToBackStack("fragB").commit();
    }
    private void launchC(Bundle bundle) {
        fragmentC.setFragmentListener(this);
        fragmentC.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().add(R.id.container,fragmentC,"fragC")
                .addToBackStack("fragC").commit();
    }
}