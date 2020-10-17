package com.rosana.petagrampersistencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.rosana.petagrampersistencia.adapters.MascotaAdaptador;
import com.rosana.petagrampersistencia.adapters.PageAdapter;
import com.rosana.petagrampersistencia.classes.Mascota;
import com.rosana.petagrampersistencia.fragments.MascotasFragment;
import com.rosana.petagrampersistencia.fragments.MiMascotaFragment;
import com.rosana.petagrampersistencia.fragments.RankingFragment;

import java.util.ArrayList;

public class Favoritas extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        /*if(toolbar != null){
            setSupportActionBar( toolbar );
        }*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setUpViewPager();

    }

    public void setUpViewPager(){
        viewPager.setAdapter( new PageAdapter( getSupportFragmentManager(), agregarFragments() ));
        tabLayout.setupWithViewPager( viewPager );
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();

        fragments.add( new RankingFragment() );

        return fragments;
    }


}