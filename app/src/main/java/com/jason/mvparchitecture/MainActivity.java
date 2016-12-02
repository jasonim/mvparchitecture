package com.jason.mvparchitecture;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jason.mvplib.view.activity.MVPActivity;
import com.jason.mvplib.view.iview.IView;

public class MainActivity extends MVPActivity<MainActivity, HelloPresenter> implements IView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        final TextView textview = (TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString().trim();
                presenter.submit();
            }
        });
    }

    @Override
    public HelloPresenter createPresenter() {
        return new HelloPresenter();
    }
}
