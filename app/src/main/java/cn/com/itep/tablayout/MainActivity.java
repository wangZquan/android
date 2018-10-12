package cn.com.itep.tablayout;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends TabActivity {

//    private TabLayout tab_FindFragment_title;                            //定义TabLayout
//    private ViewPager vp_FindFragment_pager;                             //定义viewPager
//    private FragmentPagerAdapter fAdapter;                               //定义adapter
//
//    private List<Fragment> list_fragment;                                //定义要装fragment的列表
//   // private List<Activity> list_fragment;
//    private List<String> list_title;                                     //tab名称列表
//
//    private BlankFragment hotRecommendFragment;              //热门推荐fragment
//    private BlankFragment2 hotCollectionFragment;            //热门收藏fragment
//    private BlankFragment3 hotMonthFragment;                      //本月热榜fragment
//    private BlankFragment4 hotToday;                                      //今日热榜fragment
//
//    private SecActivity secActivity;
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        initControls();
//    }
//
//    /**
//     * 初始化各控件
//     * @param
//     */
//    private void initControls() {
//
//        tab_FindFragment_title = (TabLayout)findViewById(R.id.tab_FindFragment_title);
//        vp_FindFragment_pager = (ViewPager)findViewById(R.id.vp_FindFragment_pager);
//
//        //初始化各fragment
//        hotRecommendFragment = new BlankFragment();
//        hotCollectionFragment = new BlankFragment2();
//        hotMonthFragment = new BlankFragment3();
//        hotToday = new BlankFragment4();
//
//        secActivity = new SecActivity();
//
//
//        //将fragment装进列表中
//        list_fragment = new ArrayList<>();
//        list_fragment.add(hotRecommendFragment);
//        list_fragment.add(hotCollectionFragment);
//        list_fragment.add(hotMonthFragment);
//        list_fragment.add(hotToday);
////        list_fragment.add(secActivity);
////        list_fragment.add(secActivity);
//
//        //将名称加载tab名字列表，正常情况下，我们应该在values/arrays.xml中进行定义然后调用
//        list_title = new ArrayList<>();
//        list_title.add("热门推荐");
//        list_title.add("热门收藏");
//        list_title.add("本月热榜");
//        list_title.add("今日热榜");
//
//        //设置TabLayout的模式
//        tab_FindFragment_title.setTabMode(TabLayout.MODE_FIXED);
//        //为TabLayout添加tab名称
//        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(0)),true);
//        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(1)),false);
//        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(2)),false);
//        tab_FindFragment_title.addTab(tab_FindFragment_title.newTab().setText(list_title.get(3)),false);
//
//        fAdapter = new Find_tab_Adapter(this.getSupportFragmentManager(),list_fragment,list_title);
//
//        //viewpager加载adapter
//        vp_FindFragment_pager.setAdapter(fAdapter);
//        //tab_FindFragment_title.setViewPager(vp_FindFragment_pager);
//        //TabLayout加载viewpager
//        tab_FindFragment_title.setupWithViewPager(vp_FindFragment_pager);
//        //tab_FindFragment_title.set
//    }
private TabHost tabhost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //从TabActivity上面获取放置Tab的TabHost
//        tabhost = getTabHost();
//
//        tabhost.addTab(tabhost
//                //创建新标签one
//                .newTabSpec("one")
//                //设置标签标题
//                .setIndicator("红色")
//                //设置该标签的布局内容
//                .setContent(R.id.widget_layout_red));
//        tabhost.addTab(tabhost.newTabSpec("two").setIndicator("黄色").setContent(R.id.widget_layout_yellow));
        tabhost = getTabHost();

        addTab("act1", "界面1", SecActivity.class);
        addTab("act2", "界面2", Main2Activity.class);
        addTab("act3", "界面3", SecActivity.class);
    }
    private void addTab(String tag, String title, Class clazz) {
        TabHost.TabSpec tabSpec = tabhost.newTabSpec(tag);
        tabSpec.setIndicator(title);

        Intent intent = new Intent(getApplicationContext(), clazz);
        tabSpec.setContent(intent);
        tabhost.addTab(tabSpec);
    }
}
