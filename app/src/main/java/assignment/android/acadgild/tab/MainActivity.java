package assignment.android.acadgild.tab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("Audio"));
        tabLayout.addTab(tabLayout.newTab().setText("Vedio"));
        tabLayout.getTabAt(0).setIcon(R.drawable.icon);
        tabLayout.getTabAt(1).setIcon(R.drawable.icon);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        final ViewPager  viewPager = (ViewPager) findViewById(R.id.viewPager);
       Pager pager = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        // Set up the ViewPager with the sections adapter.

        //viewPager.setAdapter(pager);


       // tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        //Initializing viewPager
       // viewPager = (ViewPager) findViewById(R.id.viewPager);
       // Pager adapter = new Pager(getSupportFragmentManager(),tabLayout.getTabCount());
       // viewPager.setAdapter(adapter);
       // tabLayout.setupWithViewPager(viewPager);
        //Adding onTabSelectedListener to swipe views
       // tabLayout.setOnTabSelectedListener(this);

    }


}
