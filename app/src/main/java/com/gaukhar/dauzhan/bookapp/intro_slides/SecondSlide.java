package com.gaukhar.dauzhan.bookapp.intro_slides;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gaukhar.dauzhan.bookapp.R;

public class SecondSlide extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.secondslide, container, false);

        return v;

    }

}
