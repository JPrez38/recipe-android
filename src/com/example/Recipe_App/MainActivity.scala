package com.example.Recipe_App

import android.view.View
import android.view.View.OnClickListener
import android.widget.{Toast, Button}
import org.scaloid.common._

/**
 * Created by jacobpreston on 9/14/14.
 */
class MainActivity extends BaseActivity {
  onCreate {
    setContentView(R.layout.main)
    val alex_button = findViewById(R.id.alex_button).asInstanceOf[Button]
    alex_button.setOnClickListener(new OnClickListener {
      override def onClick(v: View) {
        startActivity[SecondActivity]
      }
    })
  }
}
