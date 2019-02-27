package com.github.iamwee.appinstantsample.hello

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.instantapps.InstantApps

class HelloActivity : AppCompatActivity() {

    private val postInstalledIntent = Intent(Intent.ACTION_VIEW,
        Uri.parse("https://myapp-b4520.firebaseapp.com/")).apply {
        addCategory(Intent.CATEGORY_BROWSABLE)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        if (InstantApps.getPackageManagerCompat(this).isInstantApp) {
            InstantApps.showInstallPrompt(this, postInstalledIntent, 9999, "HelloActivity")
        }



    }


}
