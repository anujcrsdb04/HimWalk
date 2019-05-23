package com.example.himwalk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import static com.example.himwalk.R.id.logout;

/**
 * Created by Anuj Sharma on 24/05/19.
 */
public class ConnectFragment extends Fragment {

    public ConnectFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_connect, container, false);
        TextView label=(TextView)getActivity().findViewById(R.id.label);

        return rootView;
    }





}
