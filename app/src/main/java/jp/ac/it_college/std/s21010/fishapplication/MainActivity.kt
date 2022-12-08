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
        title = "魚図鑑"
        binding.pictorialbtn.setOnClickListener {
            val intent = Intent(this, titleFragment::class.java)
            startActivity(intent)
        }
    }
}