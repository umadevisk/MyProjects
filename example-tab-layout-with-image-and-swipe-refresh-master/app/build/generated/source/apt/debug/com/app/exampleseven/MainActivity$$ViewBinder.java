// Generated code from Butter Knife. Do not modify!
package com.app.exampleseven;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131492978, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131492978, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131492979, "field 'mToolbarTitle'");
    target.mToolbarTitle = finder.castView(view, 2131492979, "field 'mToolbarTitle'");
    view = finder.findRequiredView(source, 2131492980, "field 'mTabLayout'");
    target.mTabLayout = finder.castView(view, 2131492980, "field 'mTabLayout'");
    view = finder.findRequiredView(source, 2131492982, "field 'mViewPager'");
    target.mViewPager = finder.castView(view, 2131492982, "field 'mViewPager'");
    view = finder.findRequiredView(source, 2131492975, "field 'mImage'");
    target.mImage = finder.castView(view, 2131492975, "field 'mImage'");
    view = finder.findRequiredView(source, 2131492976, "field 'mImageAlpha'");
    target.mImageAlpha = finder.castView(view, 2131492976, "field 'mImageAlpha'");
    view = finder.findRequiredView(source, 2131492977, "field 'mProgressBar'");
    target.mProgressBar = finder.castView(view, 2131492977, "field 'mProgressBar'");
    view = finder.findRequiredView(source, 2131492973, "field 'mAppBar'");
    target.mAppBar = finder.castView(view, 2131492973, "field 'mAppBar'");
    view = finder.findRequiredView(source, 2131492981, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = finder.castView(view, 2131492981, "field 'mSwipeRefreshLayout'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.mToolbar = null;
      target.mToolbarTitle = null;
      target.mTabLayout = null;
      target.mViewPager = null;
      target.mImage = null;
      target.mImageAlpha = null;
      target.mProgressBar = null;
      target.mAppBar = null;
      target.mSwipeRefreshLayout = null;
    }
  }
}
