package edu.httpscsgsu.a2018summer02148784.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.httpscsgsu.a2018summer02148784.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WorkFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WorkFragment extends Fragment {



    public WorkFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("fragment","ContentFragment: onDestroy");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment","ContentFragment: onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragment","ContentFragment: onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment","ContentFragment: onPause");
    }
    public void onResume() {
        super.onResume();
        Log.d("fragment","ContentFragment: onResume");
    }
}
