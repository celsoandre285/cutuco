package com.quasar.cutuco.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import com.quasar.cutuco.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R.id.navigationView)
    BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        this.mBottomNavigationView.setOnNavigationItemSelectedListener(this);
        this.mBottomNavigationView.setSelectedItemId(R.id.navigation_songs);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_songs: {
                getSupportActionBar().setTitle("Músicas");

                Log.i("NavigationItemSelected", "Músicas: ");

//                Fragment musicasFragment = MusicasFragment.newInstance()
//                openFragment(musicasFragment);
                break;
            }
            case R.id.navigation_albums: {
                getSupportActionBar().setTitle("Albuns");

                Log.i("NavigationItemSelected", "Albuns: ");

//                Fragment albunsFragment = AlbunsFragment.newInstance()
//                openFragment(albunsFragment);
                break;
            }
            case R.id.navigation_artists: {
                getSupportActionBar().setTitle("Artistas");

                Log.i("NavigationItemSelected", "Artistas: ");

//                Fragment artistasFragment = ArtistasFragment.newInstance()
//                openFragment(artistasFragment);
                break;
            }
        }
        return true;
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
