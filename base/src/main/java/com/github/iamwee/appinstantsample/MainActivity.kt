package com.github.iamwee.appinstantsample

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.github.iamwee.appinstantsample.base.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOpen.setOnClickListener(::launchInstantApp)
    }

    private fun launchInstantApp(@Suppress("UNUSED_PARAMETER") view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://myapp-b4520.firebaseapp.com/hello")).apply {
            addCategory(Intent.CATEGORY_DEFAULT)
            addCategory(Intent.CATEGORY_BROWSABLE)
        }
        startActivity(intent)

    }
}
