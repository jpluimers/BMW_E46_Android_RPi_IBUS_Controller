package com.trentseed.bmw_rpi_ibus_controller.wear;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentWindowBackLeft extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    	ActivityMain.parent_page_id = IBUSGridPagerAdapter.PAGE_REAR_LEFT_LANDING;
        return inflater.inflate(R.layout.window_back_left, container, false);
    }
}
