package com.example.zhoujunbo.wasterecovery10;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import static com.example.zhoujunbo.wasterecovery10.R.id.fl_container;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private Home_Fragment home_fragment;
    private Mine_Fragment mine_fragment;
    private Shop_Fragment shop_fragment;
    private Order_Fragment order_fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home: {
                    if(home_fragment==null)home_fragment=new Home_Fragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(fl_container, home_fragment).commitAllowingStateLoss();
                }
                    return true;
                case R.id.navigation_shop:{
                    if(shop_fragment==null)shop_fragment=new Shop_Fragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(fl_container, shop_fragment).commitAllowingStateLoss();
                }
                    return true;
                case R.id.navigation_scan:{

                }
                return true;
                case R.id.navigation_mine:{
                    if(mine_fragment==null)mine_fragment=new Mine_Fragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(fl_container, mine_fragment).commitAllowingStateLoss();
                }
                    return true;
                case R.id.navigation_order:{
                    if(order_fragment==null)order_fragment=new Order_Fragment();
                    getSupportFragmentManager().beginTransaction().
                            replace(fl_container, order_fragment).commitAllowingStateLoss();
                }
                return true;
            }
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化
        home_fragment=new Home_Fragment();
        //把home_fragment 添加到Activity中
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,home_fragment).commitAllowingStateLoss();

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
