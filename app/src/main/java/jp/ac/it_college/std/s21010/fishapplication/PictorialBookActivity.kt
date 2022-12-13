package jp.ac.it_college.std.s21010.fishapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jp.ac.it_college.std.s21010.fishapplication.databinding.ActivityPictorialBookBinding

class PictorialBookActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPictorialBookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPictorialBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}