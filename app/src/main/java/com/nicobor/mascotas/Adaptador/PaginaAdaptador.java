package com.nicobor.mascotas.Adaptador;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PaginaAdaptador extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;

    public PaginaAdaptador(@NonNull FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    public int getCount() {
        return fragments.size();
    }
}