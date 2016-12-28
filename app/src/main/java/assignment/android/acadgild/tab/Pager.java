package assignment.android.acadgild.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DivyaVipin on 12/27/2016.
 */
public class Pager  extends FragmentPagerAdapter{

    int tabCount;
    public Pager(FragmentManager fm,int tabCount) {
        super(fm);
        this.tabCount=tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                Audio audio_fragment=new Audio();
                return audio_fragment;
            case 1:
                Vedio vedio_fragment=new Vedio();
                return vedio_fragment;
            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
