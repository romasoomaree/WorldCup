package com.competition.worldcupv1.fragment;

import com.competition.worldcupv1.R;
import com.competition.worldcupv1.R.layout;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

@SuppressLint("NewApi")
public class MessagesFragment extends Fragment {
	public MessagesFragment() {
		
	}
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_messages, container, false);
         
        return rootView;
    }

}
