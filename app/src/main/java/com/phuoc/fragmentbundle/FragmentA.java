package com.phuoc.fragmentbundle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    TextView txtNoiDung;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        txtNoiDung = view.findViewById(R.id.textViewFragA);
        Bundle bundle = getArguments();
        if (bundle!=null) {
            txtNoiDung.setText(bundle.getString("hotenSinhVien"));
        }

        return view;
    }
}
