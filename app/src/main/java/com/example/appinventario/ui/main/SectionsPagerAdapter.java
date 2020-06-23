package com.example.appinventario.ui.main;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.appinventario.Activo;
import com.example.appinventario.Almacen;
import com.example.appinventario.Proveedor;
import com.example.appinventario.Usuarios;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public SectionsPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numOfTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new Usuarios();
            case 1:
                return new Proveedor();
            case 3:
                return new Almacen();
            case 4:
                return new Activo();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return numOfTabs;
    }
}