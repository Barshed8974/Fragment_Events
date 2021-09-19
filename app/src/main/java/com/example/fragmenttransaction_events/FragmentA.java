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

public class FragmentA extends Fragment {
    private EditText tittle;
    private EditText desc;
    private Button btn;
    private FragmentListener mFragmentListener;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview(view);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                if (mFragmentListener != null) {
                    bundle.putString("Tittle", tittle.getText().toString());
                    bundle.putString("Desc", desc.getText().toString());
                    mFragmentListener.onFragmentDataPassed(bundle, "B");
                }
            }
        });
    }

    public void setFragmentListener(FragmentListener fragmentListener) {
        mFragmentListener = fragmentListener;
    }

    private void initview(View view) {
        tittle = view.findViewById(R.id.etTittle);
        desc = view.findViewById(R.id.etDesc);
        btn = view.findViewById(R.id.btnNext1);
    }
}