package com.ssappclinic.mvparchitecture.presenter;

import com.ssappclinic.mvparchitecture.Interface.MainInterface.Model;
import com.ssappclinic.mvparchitecture.Interface.MainInterface.Presenter;
import com.ssappclinic.mvparchitecture.Interface.MainInterface.View;
import com.ssappclinic.mvparchitecture.Model.MainActivityModel;

/**
 * Created by Shashwat-PC on 11-11-2017.
 */

public class MainActivityPresenter implements Presenter {
     View mView;
     Model mModel;
    public MainActivityPresenter(View view)
    {
      mView= view;
      initPresenter();
        }

    private void initPresenter() {
        mModel=new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
  String data=mModel.getData();
  mView.setViewData(data);
    }
}
