package team.laundrywale.androidcustomerapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FAQ2Activity extends Fragment {

    private Toolbar mToolbar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.activity_faq2, null);
        return root;

        //adding toolbar in main activity
//        mToolbar = (Toolbar) getView().findViewById(R.id.faq_toolbar);
//        setSupportActionBar(mToolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(mToolbar);
//        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Digital Laundry FAQs");
    }
}
