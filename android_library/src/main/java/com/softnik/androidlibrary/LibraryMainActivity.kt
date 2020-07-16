package com.softnik.androidlibrary

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.icu.text.CaseMap.Title
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity


class LibraryMainActivity : AppCompatActivity() {
    var themee: Resources.Theme? = null
    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
       // theme = activityTheme
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_library_main)


        title = "Library Activity"


        /*var value:Any = getIntent().getExtras()?.getString("aa")
        themee =value*/
        //this.theme = activityTheme


    }

    companion object {
        var activityTheme:Resources.Theme? = null
        fun openLibraryMainActivity(context: Context) {
            val intent = Intent(context, LibraryMainActivity::class.java)
            context.startActivity(intent)
        }
    }
}