package com.example.matimplementationapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.matimplementationapp.MainActivity;
import com.example.matimplementationapp.R;

public class FragmentMain extends Fragment {

    private Button btnControlFragment;
    private Button btnBluetoothFragment;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        findViewByIds(view);
        addListeners();

        return view;
    }

    private void findViewByIds(View view) {
        btnBluetoothFragment = view.findViewById(R.id.btnBluetoothFragment);
        btnControlFragment = view.findViewById(R.id.btnControlFragment);
    }

    private void addListeners() {
        btnControlFragmentListener();
        btnBluetoothFragmentListener();
    }

    private void btnControlFragmentListener(){
        btnControlFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).changeFragment(new FragmentControl());
            }
        });
    }

    private void btnBluetoothFragmentListener(){
        btnBluetoothFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).changeFragment(new FragmentBluetooth());
            }
        });
    }

}
