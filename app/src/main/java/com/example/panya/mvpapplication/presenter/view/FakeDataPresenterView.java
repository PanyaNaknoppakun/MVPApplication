package com.example.panya.mvpapplication.presenter.view;

import com.karumi.rosie.view.loading.RosiePresenterWithLoading;

/**
 * Created by PanyaN on 3/19/2017 AD.
 */

public interface FakeDataPresenterView extends RosiePresenterWithLoading.View {
    void showTitle(String title);
    void cleardata();
    String getData();
}
