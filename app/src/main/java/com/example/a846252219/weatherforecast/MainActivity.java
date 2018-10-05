package com.example.a846252219.weatherforecast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.iv_iv2)
    ImageView ivIv2;
    @BindView(R.id.fl_fl1)
    FrameLayout flFl1;
    private RefreshFragment refreshFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.iv_iv2)
    public void onViewClicked() {
        refreshFragment = new RefreshFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_fl1, refreshFragment).commit();
    }
}
