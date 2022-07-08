package com.rikkei.trainning.ui;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class MainAdapter extends FragmentStatePagerAdapter {
    private List<Singer> list;

    public MainAdapter(@NonNull FragmentManager fm, List<Singer> list) {
        super(fm);
        this.list = list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new FragmentLinear(list);
            case 1: return new FragmentGrid(list);
            case 2: return new FragmentStaggeredGrid(list);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return "LinearLayoutManager";
            case 1: return "GridLayoutManager";
            case 2: return "StaggeredGridLayoutManager";
        }
        return null;
    }
}
