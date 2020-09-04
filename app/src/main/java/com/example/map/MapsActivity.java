package com.example.map;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng rod = new LatLng(56.317492, 44.067198);
        mMap.addMarker(new MarkerOptions().position(rod).title("Marker in Rodionova"));
        LatLng bp = new LatLng(56.325110, 44.021366);
        mMap.addMarker(new MarkerOptions().position(bp).title("Marker in BP"));
        LatLng livovka = new LatLng(56.268496, 43.877779);
        mMap.addMarker(new MarkerOptions().position(livovka).title("Marker in Livovka"));
        LatLng sormovo = new LatLng(56.335026, 43.888092);
        mMap.addMarker(new MarkerOptions().position(sormovo).title("Marker in Sormovo"));
        LatLng gorkovo = new LatLng(56.312645, 43.991838);
        mMap.addMarker(new MarkerOptions().position(gorkovo).title("Marker in Gorkovo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(rod));
    }
}
