package myfragment.mobileapp.wit.edu.myfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by mathewsj2 on 2/5/18.
 */

public class MyFragment2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment2_main, container, false);

        Button myBtn = (Button) rootView.findViewById(R.id.myBtn2);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment fragment1 = new MyFragment2();
                fragmentTransaction.replace(R.id.container, fragment1);
                fragmentTransaction.commit();
            }
        });

        return rootView;
    }
}
