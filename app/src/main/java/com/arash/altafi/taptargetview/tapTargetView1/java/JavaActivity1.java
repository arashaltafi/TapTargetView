package com.arash.altafi.taptargetview.tapTargetView1.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.arash.altafi.taptargetview.R;
import com.google.android.material.button.MaterialButton;

import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

public class JavaActivity1 extends AppCompatActivity {

    private MaterialButton btnTapTarget1;
    private MaterialButton btnTapTarget2;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;
    private boolean isStart = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java1);

        init();
    }

    private void init() {
        bindViews();
        listener();
        preferences = getSharedPreferences("java1",MODE_PRIVATE);
        editor = preferences.edit();
        isStart = preferences.getBoolean("tap_1" , true);
        if (isStart) {
            tapTarget();
        }

    }

    private void listener() {
        btnTapTarget2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new MaterialTapTargetPrompt.Builder(JavaActivity1.this)
                        .setTarget(R.id.btn_tap_java_2)
                        .setPrimaryText("تست آرش الطافی")
                        .setSecondaryText("بخش تستی تستی تستی تست تست تست. تست آرش الطافی")
                        .setPrimaryTextColour(Color.parseColor("#E91E63"))
                        .setSecondaryTextColour(Color.parseColor("#0B73F1"))
                        .setFocalColour(Color.CYAN)
                        .setBackButtonDismissEnabled(true)
                        .setBackgroundColour(Color.parseColor("#ffeb3b"))
                        .setPromptStateChangeListener(new MaterialTapTargetPrompt.PromptStateChangeListener() {
                            @Override
                            public void onPromptStateChanged(@NonNull MaterialTapTargetPrompt prompt, int state) {
                                if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED ) {
//                                    Toast.makeText(JavaActivity1.this, "If", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
//                                    Toast.makeText(JavaActivity1.this, "Else", Toast.LENGTH_SHORT).show();
                                }
                            }
                        })
                        .show();
            }
        });
    }

    private void tapTarget () {
        new MaterialTapTargetPrompt.Builder(this)
                .setTarget(R.id.btn_tap_java_1)
                .setPrimaryText("بخش افزودن تصویر")
                .setSecondaryText("در این بخش می توانید عکسی از این بازیگر ارسال کنید تا پس از تایید مدیر در برنامه قرار گیرد. با تشکر از شما")
                .setPrimaryTextColour(Color.parseColor("#E91E63"))
                .setSecondaryTextColour(Color.parseColor("#0B73F1"))
                .setFocalColour(Color.GRAY)
                .setBackButtonDismissEnabled(true)
                .setBackgroundColour(Color.parseColor("#ffeb3b"))
                .setPromptStateChangeListener(new MaterialTapTargetPrompt.PromptStateChangeListener() {
                    @Override
                    public void onPromptStateChanged(@NonNull MaterialTapTargetPrompt prompt, int state) {
                        if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED ) {
                            editor.putBoolean("tap_1" , false);
                            editor.apply();
                        }
                        else
                        {
                            editor.putBoolean("tap_1" , false);
                            editor.apply();
                        }
                    }
                })
                .show();
    }

    private void bindViews() {
        btnTapTarget1 = findViewById(R.id.btn_tap_java_1);
        btnTapTarget2 = findViewById(R.id.btn_tap_java_2);

    }

}