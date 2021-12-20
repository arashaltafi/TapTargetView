package com.arash.altafi.taptargetview.tapTargetView2.kotlin

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.arash.altafi.taptargetview.R
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetSequence
import kotlinx.android.synthetic.main.activity_second_kotlin.*

class SecondKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_kotlin)

        init()
    }

    private fun init() {

        TapTargetSequence(this)
            .targets(
                TapTarget.forView(
                    button1_kotlin,
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
                    button2_kotlin,
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
                    button3_kotlin,
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
                    button4_kotlin,
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
                    floatingActionButton_kotlin,
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
            ).listener(object : TapTargetSequence.Listener {
                override fun onSequenceFinish() {
                    Toast.makeText(this@SecondKotlinActivity, "Congrats, You are ready to use this app", Toast.LENGTH_LONG).show()
                }

                override fun onSequenceStep(lastTarget: TapTarget?, targetClicked: Boolean) {
                    Toast.makeText(this@SecondKotlinActivity, "Great!!", Toast.LENGTH_SHORT).show()
                }

                override fun onSequenceCanceled(lastTarget: TapTarget?) {

                }
            }).start()

    }

}