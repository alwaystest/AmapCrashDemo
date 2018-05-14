package com.example.eric.amapsurfaceviewmap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Fragment fragment = new BlankFragment();
    FragmentManager supportFragmentManager = getSupportFragmentManager();
    supportFragmentManager.beginTransaction()
        .replace(R.id.map_background_container, fragment, "map")
        .commit();
    Button crashBtn = findViewById(R.id.button);
    crashBtn.setOnClickListener(v -> {
      supportFragmentManager.beginTransaction()
          .remove(supportFragmentManager.findFragmentByTag("map")).commit();
    });
  }
}
