package com.example.panya.mvpapplication;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.panya.mvpapplication.presenter.FakeDataPresenter;
import com.example.panya.mvpapplication.presenter.view.FakeDataPresenterView;
import com.karumi.rosie.view.Presenter;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.OnClick;

public class MainActivity extends BaseActivity implements FakeDataPresenterView {
    @Bind(R.id.txt_title)
    TextView title;
    @Bind(R.id.edt_title)
    EditText edtTitle;
    @Bind(R.id.btn_save)
    Button btnSave;

    @Inject
    @Presenter
    FakeDataPresenter fakeDataPresenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected List<Object> getActivityScopeModules() {
        return Arrays.asList((Object) new MainModule());
    }

    @Override
    protected void onPreparePresenter() {
        super.onPreparePresenter();
    }

    @OnClick(R.id.btn_save)
    public void onClickSave() {
        fakeDataPresenter.onClickSave();
    }

    @Override
    public void showTitle(String data) {
        title.setText(data);
    }

    @Override
    public void cleardata() {
        edtTitle.setText("");
    }

    @Override
    public String getData() {
        return edtTitle.getText().toString();
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }
}
