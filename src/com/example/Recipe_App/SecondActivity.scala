package com.example.Recipe_App

import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

/**
 * Created by jacobpreston on 9/21/14.
 */
class SecondActivity extends BaseActivity {
  onCreate {
    setContentView(R.layout.activity_second_activity)
    val alex_button = findViewById(R.id.login_button).asInstanceOf[Button]
    alex_button.setOnClickListener(new OnClickListener {
      override def onClick(v: View) {
        startActivity[ThirdActvitiy]
      }
    })
  }
}
