package com.example.ajithmarshall.ajith.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ajithmarshall.ajith.R;


public class FragmentProgram extends Fragment {

	public FragmentProgram(){
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment	
		return inflater.inflate(R.layout.fragmentprogram, container, false);
	}
}
