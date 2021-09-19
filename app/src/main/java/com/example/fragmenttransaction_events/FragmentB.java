package com.example.fragmenttransaction_events;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentB extends Fragment {
    private EditText strtDate;
    private EditText endDate;
    private EditText strtTime;
    private EditText endTime;
    private Button btn;
    private FragmentListener mFragmentListener;
    String title;
    String desc;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        getData();
        sendData();

    }

    private void getData() {
        Bundle bundle=getArguments();
        title= bundle.getString("Tittle");
        desc= bundle.getString("Desc");
        strtTime.setText(title);
        endTime.setText(desc);
    }

    private void sendData() {
        Bundle bundle=new Bundle();
        bundle.putString("Tittle",title);
        bundle.putString("Desc",desc);
        bundle.putString("strtDate",strtDate.getText().toString());
        bundle.putString("endDate",endDate.getText().toString());
        bundle.putString("strtTime",strtTime.getText().toString());
        bundle.putString("endTime",endTime.getText().toString());
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFragmentListener.onFragmentDataPassed(bundle,"C");
            }
        });
    }

    public void setFragmentListener(FragmentListener fragmentListener) {
        mFragmentListener = fragmentListener;
    }

    private void initviews(View view) {
        strtDate=view.findViewById(R.id.etdate1);
        endDate=view.findViewById(R.id.etdate2);
        strtTime=view.findViewById(R.id.etTime1);
        endTime=view.findViewById(R.id.etTime2);
        btn=view.findViewById(R.id.btnNext2);
    }
}