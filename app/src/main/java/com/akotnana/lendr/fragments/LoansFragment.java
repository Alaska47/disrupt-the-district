package com.akotnana.lendr.fragments;

/**
 * Created by anees on 3/3/2018.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.akotnana.lendr.R;

public class LoansFragment extends Fragment {
    public static LoansFragment newInstance() {
        LoansFragment fragment = new LoansFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.loans_fragment, container, false);
    }
}