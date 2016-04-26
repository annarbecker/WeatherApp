package com.example.guest.myweather.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.guest.myweather.models.Weather;
import com.example.guest.myweather.ui.WeatherDetailFragment;

import java.util.ArrayList;

/**
 * Created by Guest on 4/26/16.
 */
public class WeatherPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Weather> mWeathers;

    public WeatherPagerAdapter(FragmentManager fm, ArrayList<Weather> weathers) {
        super(fm);
        mWeathers = weathers;
    }

    @Override
    public Fragment getItem(int position) {
        return WeatherDetailFragment.newInstance(mWeathers.get(position));
    }

    @Override
    public int getCount() {
        return mWeathers.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mWeathers.get(position).getDate();
    }
}
