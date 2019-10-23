package buttonclick.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var numTimesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = ""
        editText.text.clear()
        textView.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            numTimesClicked += 1
            textView.append(editText.text)
            textView.append("\n")
            editText.text.clear()
        }
    }
}
