package com.softnik.styletolibrary
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.softnik.androidlibrary.LibraryMainActivity

class MainActivity : AppCompatActivity() {
   // var themee: Theme? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // themee = this.theme
    }
    //var aa= resources.getStyle

    fun openAnotherActivity(view: View) {
        /*       var intent = Intent(this@MainActivity, LibraryMainActivity::class.java)

               startActivity(intent)
    */

        /*val intent = Intent(this, LibraryMainActivity::class.java)
        val bundle = Bundle()
        bundle.putString("aa", themee.toString())
        val putExtras = intent.putExtras(bundle)
        startActivity(intent)*/

        LibraryMainActivity.activityTheme = this.theme
        LibraryMainActivity.openLibraryMainActivity(this)

    }


}
