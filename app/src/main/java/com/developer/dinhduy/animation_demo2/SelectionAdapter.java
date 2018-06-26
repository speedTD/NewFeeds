package com.developer.dinhduy.animation_demo2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by duy28 on 3/18/2018.
 */

class SelectionAdapter extends FragmentPagerAdapter {
    public SelectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case  0:
                NewFeedsFragment newFeedsFragment=new NewFeedsFragment();
                return  newFeedsFragment;
            case  1:
                SettingFragment settingFragment=new SettingFragment();
                return  settingFragment;

            case  2:
                FriendsFragment friendsFragment=new FriendsFragment();
                return  friendsFragment;
             default:
                 return  null;


        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "New Feeds";
            case 1:
                return "Friends";
            case 2:
                return "Add";
                default:
                    return null;
        }
    }

}
