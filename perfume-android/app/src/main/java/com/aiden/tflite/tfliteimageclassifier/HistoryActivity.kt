package com.aiden.tflite.tfliteimageclassifier

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.aiden.tflite.tfliteimageclassifier.databinding.ActivityGalleryBinding
import com.aiden.tflite.tfliteimageclassifier.databinding.ActivityHistoryBinding
import java.io.IOException
import java.util.*

class HistoryActivity : AppCompatActivity() {
    private val binding by lazy { ActivityHistoryBinding.inflate(layoutInflater, null, false) }
    private lateinit var classifier: Classifier
    private val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) { url: Uri? ->
        val selectedImage = url ?: return@registerForActivityResult
        var bitmap: Bitmap? = null
        try {
            bitmap = if (Build.VERSION.SDK_INT >= 28) {
                val src = ImageDecoder.createSource(contentResolver, selectedImage)
                ImageDecoder.decodeBitmap(src)
            } else {
                MediaStore.Images.Media.getBitmap(contentResolver, selectedImage)
            }
        } catch (exception: IOException) {
            Toast.makeText(this, "Can not load image!!", Toast.LENGTH_SHORT).show()
        }

        bitmap?.let {
            val output = classifier.classify(bitmap)
            val resultStr =
                String.format(Locale.ENGLISH, "Perfume Name : %s", output.first)
            binding.run {
                imagePerfume.setImageBitmap(bitmap)
                editName.setText(output.first)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initClassifier()
        binding.run {
            btnSelectPhoto.setOnClickListener {
                getContent.launch("image/*")
            }
        }
    }

    private fun initClassifier() {
        classifier = Classifier(this, Classifier.IMAGENET_CLASSIFY_MODEL)
        try {
            classifier.init()
        } catch (exception: IOException) {
            Toast.makeText(this, "Can not init Classifier!!", Toast.LENGTH_SHORT).show()
        }
    }

}