package com.transferwise.feature_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.transferwise.feature_two.FeatureTwoActivity
import com.transferwise.identity.ApiClientProvider
import kotlinx.android.synthetic.main.activity_feature_one.*

class FeatureOneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)

        title = "Feature One"

        val client = ApiClientProvider.client

        apiResponse.setOnClickListener {
            Toast.makeText(FeatureOneActivity@this, client.featureOne().toString(), Toast.LENGTH_LONG).show()
        }

        featureTwo.setOnClickListener {
            startActivity(Intent(FeatureOneActivity@this, FeatureTwoActivity::class.java))
        }
    }
}
