package com.transferwise.feature_two

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.transferwise.identity.ApiClientProvider
import kotlinx.android.synthetic.main.activity_feature_two.*

class FeatureTwoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        title = "Feature Two"

        val client = ApiClientProvider.client

        apiCall.setOnClickListener {
            Toast.makeText(FeatureTwoActivity@this, client.featureTwo().toString(), Toast.LENGTH_LONG).show()
        }
    }
}
