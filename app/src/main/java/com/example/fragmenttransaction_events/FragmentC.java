package com.example.fragmenttransaction_events;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

import java.io.Serializable;

public class FragmentC extends Fragment {
    private Button btn;
    private EditText et;
    private FragmentListener mFragmentListener;
    String tittle,desc,stime,eTime,sDste,eDate;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        getdata();
        setdata();
    }

    private void initviews(View view) {
        btn=view.findViewById(R.id.btnNext3);
        et=view.findViewById(R.id.etPrice);
    }

    private void getdata() {
        Bundle bundle=getArguments();
        tittle= bundle.getString("Tittle");
        desc= bundle.getString("Desc");
        stime= bundle.getString("strtDate");
        eTime= bundle.getString("endDate");
        sDste= bundle.getString("strtTime");
        eDate= bundle.getString("endTime");
    }

    private void setdata() {
        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String price=et.getText().toString();
            Model model=new Model(tittle,desc,stime,eTime,sDste,eDate,price);
            Intent intent=new Intent(getContext(),Preview.class);
            intent.putExtra("model",model);
            startActivity(intent);

        }
    });
    }

    public void setFragmentListener(FragmentListener fragmentListener) {
        mFragmentListener = fragmentListener;
    }
}