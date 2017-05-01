package ru.example.checklist;

import android.support.v4.app.*;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter
 {
    final int PAGE_COUNT = 10;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3",
				"Tab4", "Tab5", "Tab6",  "Tab7", "Tab82", "Tab9", " End Taba"   };

    public SampleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return FragmentPage.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
