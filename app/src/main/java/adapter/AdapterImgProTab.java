package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import activity.Tab2;

/**
 * User: yu_huibin
 * Date: 2015-10-21
 * Time: 23:47
 * Fuction:
 */
public class AdapterImgProTab extends FragmentStatePagerAdapter{

    CharSequence Titles[];
    int NumbOfTabs;

    public AdapterImgProTab(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    @Override
    public Fragment getItem(int position) {

        return new Tab2();

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }


    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}