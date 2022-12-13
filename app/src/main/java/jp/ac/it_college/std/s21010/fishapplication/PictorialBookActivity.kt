package jp.ac.it_college.std.s21010.fishapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import jp.ac.it_college.std.s21010.fishapplication.databinding.ActivityPictorialBookBinding

class PictorialBookActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPictorialBookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPictorialBookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = listOf(
            mapOf ("image" to R.drawable.akazin, "name" to "アカジン"),
            mapOf ("image" to R.drawable.makubu, "name" to "マクブ"),
            mapOf ("image" to R.drawable.mi, "name" to "ミーバイ"),
            mapOf ("image" to R.drawable.suzuki_1, "name" to "スズキ"),
            mapOf ("image" to R.drawable.tinu, "name" to "チヌ"),
            mapOf ("image" to R.drawable.umihebi, "name" to "ウミヘビ"),
            mapOf ("image" to R.drawable.namazu, "name" to "ナマズ"),
            mapOf ("image" to R.drawable.manbo, "name" to "マンボウ"),
        )

        // ListViewにデータをセットする
        val list = findViewById<ListView>(R.id.list)
        list.adapter = SimpleAdapter(
            this,
            data,
            R.layout.list_item,
            arrayOf("image", "name", "detail"),
            intArrayOf(R.id.image, R.id.name)
        )
    }
}