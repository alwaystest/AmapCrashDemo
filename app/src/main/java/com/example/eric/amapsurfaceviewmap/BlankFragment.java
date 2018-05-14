package com.example.eric.amapsurfaceviewmap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.amap.api.maps.AMap;
import com.amap.api.maps.SupportMapFragment;

public class BlankFragment extends Fragment implements AMap.OnMapLoadedListener {
  private static final String TAG = "BlankFragment";

  private SupportMapFragment mapFragment;
  private AMap mMap;

  public BlankFragment () {
    // Required empty public constructor
  }

  @Override
  public View onCreateView (LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view  = inflater.inflate(R.layout.fragment_blank, container, false);
    mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
    mMap = mapFragment.getMap();
    if(mMap != null) {
      mMap.getUiSettings().setZoomControlsEnabled(false);
      mMap.getUiSettings().setTiltGesturesEnabled(false);
      mMap.getUiSettings().setMyLocationButtonEnabled(false);
      mMap.getUiSettings().setCompassEnabled(false);
      mMap.setOnMapLoadedListener(this);
    }
    // Inflate the layout for this fragment
    return view;
  }

  @Override public void onMapLoaded () {
    Log.d(TAG, "onMapLoaded: ");
  }
}
