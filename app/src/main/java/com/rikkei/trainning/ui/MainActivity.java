package com.rikkei.trainning.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private MainAdapter myAdapter;
    private List<Singer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        list = new ArrayList<>();
        list.add(new Singer(R.drawable.bao_anh,"Bảo Anh"));
        list.add(new Singer(R.drawable.bao_thy,"Bảo Thy"));
        list.add(new Singer(R.drawable.bich_phuong,"Bích Phương"));
        list.add(new Singer(R.drawable.chi_dan,"Chi Dân"));
        list.add(new Singer(R.drawable.chipu,"Chipu"));
        list.add(new Singer(R.drawable.dan_truong,"Đan Trường"));
        list.add(new Singer(R.drawable.ho_quang_hieu,"Hồ Quang Hiếu"));
        list.add(new Singer(R.drawable.khoi_my,"Khởi My"));
        list.add(new Singer(R.drawable.my_tam,"Mỹ Tâm"));
        list.add(new Singer(R.drawable.ngo_kien_huy,"Ngô Kiến Huy"));
        list.add(new Singer(R.drawable.noo,"Noo Phước Thịnh"));
        list.add(new Singer(R.drawable.son_tung,"Sơn Tùng"));

        myAdapter = new MainAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(myAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}