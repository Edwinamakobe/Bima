package com.bima;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Fidelia on 1/15/2016.
 */

/**
 * Created by Edwin on 15/02/2015.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {

        if (position == 0) // if the position is 0 we are returning the First tab
        {
            MotorFragment motor = new MotorFragment();
            return motor;
        } else if (position == 1)           // if the position is 1 we are returning the First tab
        {
            MotorFragment motor = new MotorFragment();
            return motor;
        }
        else if (position == 2)           // if the position is 1 we are returning the First tab
        {
            MotorFragment motor = new MotorFragment();
            return motor;
        }
        else if (position == 3)           // if the position is 1 we are returning the First tab
        {
            MotorFragment motor = new MotorFragment();
            return motor;
        }
        else if (position == 4)           // if the position is 1 we are returning the First tab
        {
            MotorFragment motor = new MotorFragment();
            return motor;
        }
        else if (position == 5)           // if the position is 1 we are returning the First tab
        {
            MotorFragment motor = new MotorFragment();
            return motor;
        }else {                             //if the position is 2 we are returning the First tab
            MotorFragment motor = new MotorFragment();
            return motor;
        }

    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}