package com.example.PMDM;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;

import androidx.appcompat.app.AppCompatActivity;


import com.example.PMDM.model.Element;

public class Main3 extends AppCompatActivity implements ListElementFragment.ListElementFragmentCallback
{
    private ViewElementFragment viewElementFragment;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentcontainer,new ListElementFragment(),ListElementFragment.TAG);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void onElementView(Element element) {

        FragmentManager fm=getSupportFragmentManager();
        viewElementFragment = (ViewElementFragment) fm.findFragmentByTag(ViewElementFragment.TAG);

        if (viewElementFragment == null) {
            Bundle bundle= null;
            if (element!=null){
                bundle= new Bundle();
                bundle.putParcelable(Element.TAG,element);
            }
            viewElementFragment = (ViewElementFragment) viewElementFragment.newInstance(bundle);
        }

        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentcontainer, viewElementFragment,ViewElementFragment.TAG);
        ft.addToBackStack(null);
        ft.commit();

    }
}
