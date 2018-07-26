package io.crazyamigos.attendance

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_events.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class EventActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_events)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item!!.itemId) {

            R.id.logout -> {
                val pref = getSharedPreferences("event", 0)
                val editor = pref.edit()
                editor.putString("access_token", "")
                editor.apply()

                startActivity(intentFor<LoginActivity>())
                finish()
            }

            R.id.about ->{

            }
        }


        return super.onOptionsItemSelected(item)
    }






}
