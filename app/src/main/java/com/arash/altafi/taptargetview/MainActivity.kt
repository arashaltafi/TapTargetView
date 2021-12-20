package com.arash.altafi.taptargetview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arash.altafi.taptargetview.tapTargetView1.java.JavaActivity1
import com.arash.altafi.taptargetview.tapTargetView1.kotlin.KotlinActivity1
import com.arash.altafi.taptargetview.tapTargetView2.java.JavaActivity2
import com.arash.altafi.taptargetview.tapTargetView2.kotlin.KotlinActivity2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tap_target_view_1.setOnClickListener {
            startActivity(Intent(this , JavaActivity1::class.java))
        }

        btn_tap_target_view_2.setOnClickListener {
            startActivity(Intent(this , JavaActivity2::class.java))
        }

        btn_tap_target_view_3.setOnClickListener {
            startActivity(Intent(this , KotlinActivity1::class.java))
        }

        btn_tap_target_view_4.setOnClickListener {
            startActivity(Intent(this , KotlinActivity2::class.java))
        }
    }
}