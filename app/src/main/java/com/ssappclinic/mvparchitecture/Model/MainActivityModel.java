package com.ssappclinic.mvparchitecture.Model;

import com.ssappclinic.mvparchitecture.Interface.MainInterface;

/**
 * Created by Shashwat-PC on 11-11-2017.
 */

public class MainActivityModel implements MainInterface.Model{
    @Override
    public String getData() {
        return "You clicked Me";
    }
}
