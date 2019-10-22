package com.ssappclinic.mvparchitecture.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.ssappclinic.mvparchitecture.Interface.MainInterface.Presenter;
import com.ssappclinic.mvparchitecture.Interface.MainInterface.View;
import com.ssappclinic.mvparchitecture.R;
import com.ssappclinic.mvparchitecture.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements View {
     public Button button;
     protected TextView displaytext;
     private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        button=findViewById(R.id.button);
        displaytext=findViewById(R.id.display);
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                mPresenter.onClick();
            }
        });
    }

    @Override
    public void setViewData(String data) {
       displaytext.setText(data);
    }

}
