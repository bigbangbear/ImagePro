package activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;



import adapter.AdapterImgProTab;
import bin.hui.yu.imagepro.R;
import view.SlidingTabLayout;


/**
 * User: yu_huibin
 * Date: 2015-10-21
 * Time: 12:57
 * Fuction:
 */
public class ActivityImagePro extends FragmentActivity {

    private SlidingTabLayout mTabLayout;
    private ViewPager mPage;

    public static void activityStart(Context context){
        Intent intent = new Intent();
        intent.setClass(context, ActivityImagePro.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pro);

        initView();


    }

    private void initView(){
        mTabLayout = (SlidingTabLayout) findViewById(R.id.tab_layout);
        mTabLayout.setDistributeEvenly(true);
        CharSequence Titles[]={"Home","Events"};
        int Numboftabs =2;
        mPage = (ViewPager) findViewById(R.id.pager);
        AdapterImgProTab adpter = new AdapterImgProTab(getSupportFragmentManager(),Titles, 2);
        mPage.setAdapter(adpter);
        mTabLayout.setViewPager(mPage);

    }

}