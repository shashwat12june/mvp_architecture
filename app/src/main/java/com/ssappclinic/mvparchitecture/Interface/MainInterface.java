package com.ssappclinic.mvparchitecture.Interface;

/**
 * Created by Shashwat-PC on 11-11-2017.
 */

public interface MainInterface {
    interface View{
        void initView();
        void setViewData(String data);
    }
   interface Model
   {
       String getData();
   }
    interface Presenter{
        void onClick();
    }
}
