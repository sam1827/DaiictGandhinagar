package com.webdroid.school.misc.utils;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.webdroid.school.R;
import com.webdroid.school.ui.fragments.GeneralFragment;
import com.webdroid.school.ui.fragments.NoticeFragment;

import java.util.Locale;


public class NonTeachPager extends FragmentStatePagerAdapter {

    private Context context;
    private Extras prefernces;

    public NonTeachPager(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        prefernces = new Extras(context);
    }

    /**
     * Return Fragment acc. to position
     * @param position
     * @return
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                prefernces.setnoticeTrack(true);
                return NoticeFragment.getInstance(false, false, "cmpnupload");
            case 1:
                return GeneralFragment.getInstance(false, false);
        }
        return null;
    }

    /**
     * No of fragment
     * @return
     */
    @Override
    public int getCount() {
        return 2;
    }


    /**
     * Title for Tab
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        Locale locale = Locale.getDefault();
        switch (position){
            case 0:
                return context.getString(R.string.notices).toUpperCase(locale);
            case 1:
                return context.getString(R.string.general).toUpperCase(locale);
        }
        return super.getPageTitle(position);
    }

}
