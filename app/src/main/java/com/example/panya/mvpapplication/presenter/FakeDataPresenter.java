package com.example.panya.mvpapplication.presenter;

import com.example.panya.mvpapplication.presenter.view.FakeDataPresenterView;
import com.karumi.rosie.domain.usecase.UseCaseHandler;
import com.karumi.rosie.view.RosiePresenter;

import javax.inject.Inject;

/**
 * Created by PanyaN on 3/19/2017 AD.
 */

public class FakeDataPresenter extends RosiePresenter<FakeDataPresenterView> {

    @Inject public FakeDataPresenter(UseCaseHandler useCaseHandler) {
        super(useCaseHandler);
    }

    private void save() {
        String data = getView().getData();
        getView().showTitle(data);
        getView().cleardata();
    }

    public void onClickSave() {
        save();
    }
}
