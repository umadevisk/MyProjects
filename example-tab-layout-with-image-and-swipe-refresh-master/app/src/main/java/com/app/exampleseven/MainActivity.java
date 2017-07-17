package com.app.exampleseven;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.app.exampleseven.adapter.TabLayoutAdapter;
import com.app.exampleseven.fragments.FragmentPageOne;
import com.app.exampleseven.model.TabItem;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.GlideDrawableImageViewTarget;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.toolbar_title)
    TextView mToolbarTitle;

    @BindView(R.id.tab_layout)
    TabLayout mTabLayout;

    @BindView(R.id.pager)
    ViewPager mViewPager;

    @BindView(R.id.item_image)
    ImageView mImage;

    @BindView(R.id.item_image_alpha)
    ImageView mImageAlpha;

    @BindView(R.id.item_progress_bar)
    ProgressBar mProgressBar;

    @BindView(R.id.app_bar)
    AppBarLayout mAppBar;

    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    private String[] Tabs = {"Videos","Images","Milestones"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        // Init
        setupInit();

        // Tab Layout
        setupTabLayout();

        // Image View
        setupImage("http://www.menucool.com/slider/jsImgSlider/images/image-slider-2.jpg");

        // Swipe Refresh
        setupSwipeRefresh();
    }

    private void setupInit() {
        // Toolbar
        setSupportActionBar(mToolbar);
        setTitle("");

        mToolbarTitle.setText(getString(R.string.app_name));

        mImageAlpha.getBackground().setAlpha(100);
    }

    private void setupTabLayout() {
        ArrayList<TabItem> favoritesItemArrayList = new ArrayList<>();

        for (int i = 0; i < 3; i++)

            favoritesItemArrayList.add(new TabItem(Tabs[i]));

        mViewPager.setAdapter(new TabLayoutAdapter(getSupportFragmentManager(), favoritesItemArrayList));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void setupImage(String url) {
        Glide.with(this).load(url).placeholder(R.color.colorAccent).into(new GlideDrawableImageViewTarget(mImage) {
            @Override
            public void onResourceReady(GlideDrawable drawable, GlideAnimation anim) {
                super.onResourceReady(drawable, anim);

                if (mProgressBar != null)
                    mProgressBar.setVisibility(View.GONE);
            }

            @Override
            public void onLoadFailed(Exception e, Drawable errorDrawable) {
                super.onLoadFailed(e, errorDrawable);

                if (mProgressBar != null)
                    mProgressBar.setVisibility(View.GONE);
            }
        });
    }

    private void setupSwipeRefresh() {
        mAppBar.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (i == 0) {
                    mSwipeRefreshLayout.setEnabled(true);
                } else {
                    mSwipeRefreshLayout.setEnabled(false);
                }
            }
        });

        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                FragmentPageOne fragment = (FragmentPageOne) mViewPager.getAdapter().instantiateItem(mViewPager, mViewPager.getCurrentItem());
                fragment.refreshData();

                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }

}