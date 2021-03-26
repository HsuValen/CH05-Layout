package tw.tcnr08.m0500

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    var t001 : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewComponent();
    }

    private fun setupViewComponent() {
        t001 = findViewById(R.id.m0500_t001)
        t001?.setText("aaa")
    }
}