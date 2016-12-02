package com.jason.mvparchitecture;

import android.widget.EditText;
import android.widget.TextView;

import com.jason.mvplib.presenter.BasePresenter;

/**
 * Created by jason on 16/12/2.
 */
public class HelloPresenter extends BasePresenter<MainActivity> {

    public void submit() {
        MainActivity view = getView();
        TextView textView = (TextView) view.findViewById(R.id.textView);
        EditText editText = (EditText) view.findViewById(R.id.editText);
        assert editText != null;
        textView.setText(editText.getText().toString().trim());
    }
}
