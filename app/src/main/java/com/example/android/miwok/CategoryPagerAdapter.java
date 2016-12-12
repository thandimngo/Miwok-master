package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;

    private String tabTitles[] = new String[] { "Numbers", "Family", "Colors", "Phrases" };
    private Context mContext;

    public CategoryPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public CategoryPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
          return new NumbersActivity();
        } else if (position == 1) {
            return new FamilyActivity();
        } else if (position == 2) {
            return new ColorsActivity();
        } else {
            return new PhrasesActivity();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getResources().getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_colors);
        } else {
            return mContext.getResources().getString(R.string.category_phrases);
        }
    }

}
