package com.example.backtrack;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class TrackListFragment extends Fragment{
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		
		return inflater.inflate(R.layout.tracklist_layout, container, false);
	}
	
}
