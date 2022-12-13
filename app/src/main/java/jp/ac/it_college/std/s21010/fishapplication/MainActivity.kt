package jp.ac.it_college.std.s21010.fishapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s21010.fishapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = getString(R.string.pictorial_book)


        binding.toPictorial.setOnClickListener {
            val intent = Intent(this, PictorialBookActivity::class.java)
            startActivity(intent)
        }

    }
}