package ajaykumarsingh.dashboardapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ajaykumarsingh.dashboardapp.R;

/**
 * Created by SinghA02 on 04/04/2018.
 */

public class dashboard extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dashboard, container, false);
        return view;
    }
}
