package team.laundrywale.androidcustomerapp;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsAccesorsAdapter extends FragmentPagerAdapter {


    public TabsAccesorsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return  homeFragment;

            case 1:
                ProfileFragment profileFragment = new ProfileFragment();
                return profileFragment;

            case 2:
                FAQ2Activity faqFragment = new FAQ2Activity();
                return faqFragment;

//            case 3:
//                ContractsFragment contractsFragment = new ContractsFragment();
//                return contractsFragment;


            default:
                return null;
        }

    }

    //setting frag title
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:

                return  "Home";

            case 1:
                return "Profile";

            case 2:
                return "FAQs";

//            case 3:
//                return "Orders";

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
