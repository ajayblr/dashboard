package ajaykumarsingh.dashboardapp;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final int REQUEST_CODE = 1;


    //widgets
    private TabLayout mTabLayout;
    public ViewPager mViewPager;

    //vars
    public SectionsPagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager  = (ViewPager) findViewById(R.id.viewpager_container);
        setupViewPager();



    }

    private void setupViewPager(){
        mPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mPagerAdapter.addFragment(new home());
        mPagerAdapter.addFragment(new favourite());
        mPagerAdapter.addFragment(new dashboard());
        mPagerAdapter.addFragment(new account());


//        mPagerAdapter.addFragment(new post());
//        mPagerAdapter.addFragment(new account());
//
        mViewPager.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.getTabAt(0).setText(getString(R.string.fragment_home));
        mTabLayout.getTabAt(1).setText(getString(R.string.fragment_favourites));
        mTabLayout.getTabAt(2).setText(getString(R.string.fragment_dashboard));
        mTabLayout.getTabAt(3).setText(getString(R.string.account));



//        mTabLayout.getTabAt(2).setText(getString(R.string.fragment_post));
//        mTabLayout.getTabAt(3).setText(getString(R.string.fragment_account));
    }
}
