package com.arash.altafi.taptargetview.tapTargetView2.kotlin

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.taptargetview.R
import com.getkeepsafe.taptargetview.TapTarget
import com.getkeepsafe.taptargetview.TapTargetView
import kotlinx.android.synthetic.main.activity_kotlin2.*

class KotlinActivity2 : AppCompatActivity() {

    private lateinit var preferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private var isStart = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin2)

        init()
    }

    private fun init(){

        preferences = getSharedPreferences("kotlin2", MODE_PRIVATE)
        editor = preferences.edit()
        isStart = preferences.getBoolean("tap_2", true)
        if (isStart) {
            tapTarget()
        }

        btn_second_kotlin.setOnClickListener {
            startActivity(Intent(this , SecondKotlinActivity::class.java))
        }

    }

    private fun tapTarget() {
        TapTargetView.showFor(
            this,
            TapTarget.forView(btn_second_kotlin, "This is a Button", "You will redirect to the next activity")
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
                .targetRadius(100), object : TapTargetView.Listener() {
                override fun onTargetClick(view: TapTargetView?) {
                    super.onTargetClick(view)
                    editor.putBoolean("tap_2", false)
                    editor.apply()
                    startActivity(Intent(this@KotlinActivity2 , SecondKotlinActivity::class.java))
                }
            }
        )
    }

}