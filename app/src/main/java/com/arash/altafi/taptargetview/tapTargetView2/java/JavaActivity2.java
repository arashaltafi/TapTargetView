package com.arash.altafi.taptargetview.tapTargetView2.java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;

import com.arash.altafi.taptargetview.R;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.google.android.material.button.MaterialButton;

public class JavaActivity2 extends AppCompatActivity {

    private MaterialButton btnSecondJava;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private boolean isStart = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java2);

        init();
    }

    private void init() {
        bindViews();
        listener();
        preferences = getSharedPreferences("java2", MODE_PRIVATE);
        editor = preferences.edit();
        isStart = preferences.getBoolean("tap_2", true);
        if (isStart) {
            tapTarget();
        }
    }

    private void tapTarget() {
        TapTargetView.showFor(
                this,
                TapTarget.forView(btnSecondJava, "This is a Button", "You will redirect to the next activity")
                        .outerCircleColor(R.color.teal_200)
                        .outerCircleAlpha(0.96f)
                        .targetCircleColor(R.color.white)
                        .titleTextSize(18)
                        .titleTextColor(R.color.white)
                        .descriptionTextSize(14)
                        .descriptionTextColor(R.color.black)
                        .textColor(R.color.black)
                        .textTypeface(Typeface.SANS_SERIF)
                        .dimColor(R.color.black)
                        .drawShadow(true)
                        .cancelable(true)
                        .tintTarget(true)
                        .transparentTarget(true)
                        .targetRadius(100), new TapTargetView.Listener() {
                    @Override
                    public void onTargetClick(TapTargetView view) {
                        super.onTargetClick(view);
                        editor.putBoolean("tap_2", false);
                        editor.apply();
                        startActivity(new Intent(JavaActivity2.this, SecondJavaActivity.class));
                    }
                }
        );
    }

    private void listener() {
        btnSecondJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JavaActivity2.this, SecondJavaActivity.class));
            }
        });
    }

    private void bindViews() {
        btnSecondJava = findViewById(R.id.btn_second_java);

    }

}