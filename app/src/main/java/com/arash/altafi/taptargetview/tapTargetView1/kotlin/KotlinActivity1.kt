package com.arash.altafi.taptargetview.tapTargetView1.kotlin

import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.arash.altafi.taptargetview.R
import kotlinx.android.synthetic.main.activity_kotlin1.*
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt.PromptStateChangeListener

class KotlinActivity1 : AppCompatActivity() {

    private lateinit var preferences: SharedPreferences
    private lateinit var editor: SharedPreferences.Editor
    private var isStart = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin1)

        init()
    }

    private fun init() {
        listener()
        preferences = getSharedPreferences("kotlin1", MODE_PRIVATE)
        editor = preferences.edit()
        isStart = preferences.getBoolean("tap_1", true)
        if (isStart) {
            tapTarget()
        }

    }

    private fun listener() {
        btn_tap_kotlin_2.setOnClickListener(View.OnClickListener {
            MaterialTapTargetPrompt.Builder(this)
                .setTarget(R.id.btn_tap_kotlin_2)
                .setPrimaryText("تست آرش الطافی")
                .setSecondaryText("بخش تستی تستی تستی تست تست تست. تست آرش الطافی")
                .setPrimaryTextColour(Color.parseColor("#E91E63"))
                .setSecondaryTextColour(Color.parseColor("#0B73F1"))
                .setFocalColour(Color.CYAN)
                .setBackButtonDismissEnabled(true)
                .setBackgroundColour(Color.parseColor("#ffeb3b"))
                .setPromptStateChangeListener(PromptStateChangeListener { prompt, state ->
                    if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED) {
//                      Toast.makeText(JavaActivity1.this, "If", Toast.LENGTH_SHORT).show();
                    }
                    else {
//                      Toast.makeText(JavaActivity1.this, "Else", Toast.LENGTH_SHORT).show();
                    }
                })
                .show()
        })
    }

    private fun tapTarget() {
        MaterialTapTargetPrompt.Builder(this)
            .setTarget(R.id.btn_tap_kotlin_1)
            .setPrimaryText("بخش افزودن تصویر")
            .setSecondaryText("در این بخش می توانید عکسی از این بازیگر ارسال کنید تا پس از تایید مدیر در برنامه قرار گیرد. با تشکر از شما")
            .setPrimaryTextColour(Color.parseColor("#E91E63"))
            .setSecondaryTextColour(Color.parseColor("#0B73F1"))
            .setFocalColour(Color.GRAY)
            .setBackButtonDismissEnabled(true)
            .setBackgroundColour(Color.parseColor("#ffeb3b"))
            .setPromptStateChangeListener { prompt, state ->
                if (state == MaterialTapTargetPrompt.STATE_FOCAL_PRESSED) {
                    editor.putBoolean("tap_1", false)
                    editor.apply()
                }
                else {
                    editor.putBoolean("tap_1", false)
                    editor.apply()
                }
            }
            .show()
    }

}