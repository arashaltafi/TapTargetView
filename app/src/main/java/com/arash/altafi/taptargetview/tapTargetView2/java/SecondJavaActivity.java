package com.arash.altafi.taptargetview.tapTargetView2.java;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Toast;

import com.arash.altafi.taptargetview.R;
import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SecondJavaActivity extends AppCompatActivity {

    MaterialButton btn1;
    MaterialButton btn2;
    MaterialButton btn3;
    MaterialButton btn4;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_java);

        init();
    }

    private void init() {
        bindViews();
        listener();
    }

    private void listener() {
        new TapTargetSequence(this)
                .targets(
                        TapTarget.forView(
                                btn1,
                                "This is selling Button",
                                "This will handle selling"
                        )
                                .outerCircleColor(R.color.purple_500)
                                .outerCircleAlpha(0.96f)
                                .targetCircleColor(R.color.white)
                                .titleTextSize(18)
                                .titleTextColor(R.color.white)
                                .descriptionTextSize(14)
                                .descriptionTextColor(R.color.white)
                                .textTypeface(Typeface.SANS_SERIF)
                                .dimColor(R.color.black)
                                .drawShadow(true)
                                .cancelable(false)
                                .tintTarget(true)
                                .transparentTarget(true)
                                .targetRadius(55),

//////////////////////////////////////////////////////////////////

                        TapTarget.forView(
                                btn2,
                                "This is buying Button",
                                "This will handle all buying"
                        )
                                .outerCircleColor(R.color.purple_200)
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
                                .cancelable(false)
                                .tintTarget(true)
                                .transparentTarget(true)
                                .targetRadius(55),

//////////////////////////////////////////////////////////////////


                        TapTarget.forView(
                                btn3,
                                "This is renting Button",
                                "This will handle all rents"
                        )
                                .outerCircleColor(R.color.purple_700)
                                .outerCircleAlpha(0.96f)
                                .targetCircleColor(R.color.white)
                                .titleTextSize(18)
                                .descriptionTextSize(14)
                                .textColor(R.color.white)
                                .textTypeface(Typeface.SANS_SERIF)
                                .dimColor(R.color.black)
                                .drawShadow(true)
                                .cancelable(false)
                                .tintTarget(true)
                                .transparentTarget(true)
                                .targetRadius(55),


//////////////////////////////////////////////////////////////////


                        TapTarget.forView(
                                btn4,
                                "This is a guide Button",
                                "This will help you to control all things"
                        )
                                .outerCircleColor(R.color.purple_200)
                                .outerCircleAlpha(0.96f)
                                .titleTextSize(18)
                                .descriptionTextSize(14)
                                .descriptionTextColor(R.color.black)
                                .textColor(R.color.black)
                                .textTypeface(Typeface.SANS_SERIF)
                                .dimColor(R.color.black)
                                .drawShadow(true)
                                .cancelable(false)
                                .tintTarget(true)
                                .transparentTarget(true)
                                .targetRadius(55),


//////////////////////////////////////////////////////////////////


                        TapTarget.forView(
                                fab,
                                "This is a Floating Action Button",
                                "This will handle the bookmark"
                        )
                                .outerCircleColor(R.color.teal_700)
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
                                .cancelable(false)
                                .tintTarget(true)
                                .transparentTarget(true)
                                .targetRadius(55)
                ).listener(new TapTargetSequence.Listener() {
            @Override
            public void onSequenceFinish() {
                Toast.makeText(SecondJavaActivity.this, "Congrats, You are ready to use this app", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSequenceStep(TapTarget lastTarget, boolean targetClicked) {
                Toast.makeText(SecondJavaActivity.this, "Great!!!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSequenceCanceled(TapTarget lastTarget) {
                Toast.makeText(SecondJavaActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
            }
        }).start();

    }

    private void bindViews() {
        btn1 = findViewById(R.id.button1_java);
        btn2 = findViewById(R.id.button2_java);
        btn3 = findViewById(R.id.button3_java);
        btn4 = findViewById(R.id.button4_java);
        fab = findViewById(R.id.floatingActionButton_java);
    }

}