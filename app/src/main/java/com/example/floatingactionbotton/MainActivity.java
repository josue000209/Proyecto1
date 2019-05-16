package com.example.floatingactionbotton;

import android.animation.Animator;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

import com.github.fafaldo.fabtoolbar.widget.FABToolbarLayout;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {


    //    boolean click = false;
//    private FABToolbarLayout morph;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        BottomNavigationView navigation=(BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectecLister);
        CoordinatorLayout.LayoutParams layoutParams=(CoordinatorLayout.LayoutParams)navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());


        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectecLister);
        toolbar.setTitle("Shop");
        toolbar.setTitleTextColor(Color.WHITE);
        loadFragment(new StoreFragment());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectecLister = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_shop:
                    toolbar.setTitle("Shop");
                    fragment = new StoreFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_gifts:
                    toolbar.setTitle("My Gifts");
                    fragment = new GiftsFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_cart:
                    toolbar.setTitle("Cart");
                    fragment = new CartFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_porfile:
                    toolbar.setTitle("Profile");
                    fragment = new ProfileFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };
    private void loadFragment(Fragment fragment){
        //load fragment
        FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

    //setSupportActionBar(toolbar);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        morph = (FABToolbarLayout) findViewById(R.id.fabtoolbar);

        View uno, dos, tres, cuatro;

        uno = findViewById(R.id.uno);
        dos = findViewById(R.id.dos);
        cuatro = findViewById(R.id.cuatro);
        tres = findViewById(R.id.tres);

        fab.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.fab) {
            morph.show();
        }

        morph.hide();*/

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_launcher_background);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click = !click;
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),
                            android.R.interpolator.fast_out_slow_in);

                    view.animate()
                            .rotation(click ? 45f : 0)
                            .setInterpolator(interpolador)
                            .start();
                }
            }
        });*/
/*
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setScaleX(0);
        fab.setScaleY(0);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            final Interpolator interpolador = AnimationUtils.loadInterpolator(getBaseContext(),
                    android.R.interpolator.fast_out_slow_in);

            fab.animate()
                    .scaleX(1)
                    .scaleY(1)
                    .setInterpolator(interpolador)
                    .setDuration(600)
                    .setStartDelay(1000)
                    .setListener(new Animator.AnimatorListener() {
                        @Override
                        public void onAnimationStart(Animator animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animator animation) {
                            fab.animate()
                                    .scaleY(0)
                                    .scaleX(0)
                                    .setInterpolator(interpolador)
                                    .setDuration(600)
                                    .start();
                        }

                        @Override
                        public void onAnimationCancel(Animator animation) {

                        }

                        @Override
                        public void onAnimationRepeat(Animator animation) {

                        }
                    });

        }

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Se presiono el FAB", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/



/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

