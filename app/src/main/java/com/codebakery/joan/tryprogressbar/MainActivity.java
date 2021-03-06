package com.codebakery.joan.tryprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tgButtton =null;
    Button button;
    TextView textView;
    ProgressBar progBar;
    String text = null;

    // First add commit
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // commant one
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * 깃테스트
        * 수정했음!!!!!!!!!!!!!!!!!!!!!!! add local files
        * 수정했음!!!!!!!!!!!!!!!!!!!!!!! add files
        * 공통 라인 수정.
        * */
        textView = (TextView) findViewById(R.id.text);
        tgButtton = (ToggleButton) findViewById(R.id.tglButton);
        button = (Button) findViewById(R.id.button);
//        progBar = (ProgressBar) findViewById(R.id.prgBar);

    }

    public void onClickWidget(View view){
        switch (view.getId()){
            case R.id.button:
                text = button.getText().toString();
                break;
            case R.id.tglButton:
                text = tgButtton.isChecked() ? tgButtton.getTextOn().toString() : tgButtton.getTextOff().toString();
                if (tgButtton.isChecked())
                    progBar.setVisibility(View.VISIBLE);
                else
                    progBar.setVisibility(View.GONE);
                break;
            default: text="null";
        }
        textView.setText(text);
    }
}
