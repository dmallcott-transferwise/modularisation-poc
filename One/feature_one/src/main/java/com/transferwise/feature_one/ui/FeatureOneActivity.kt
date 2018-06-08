package com.transferwise.feature_one.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.transferwise.feature_one.FeatureOneDependencyProvider
import com.transferwise.feature_one.R
import com.transferwise.feature_one.domain.FeatureOne
import com.transferwise.feature_two.FeatureOneView
import com.transferwise.feature_two.FeatureTwoContract
import kotlinx.android.synthetic.main.activity_feature_one.*
import javax.inject.Inject

class FeatureOneActivity : AppCompatActivity(), FeatureOneView {

    @Inject lateinit var presenter : FeatureOnePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)

        (application as FeatureOneDependencyProvider).createFeatureOneComponent().inject(this)

        title = "Feature One"

        presenter.bind(this)

        apiCall.setOnClickListener {
            presenter.getFeatureOne()
        }

        featureTwo.setOnClickListener {
            FeatureTwoContract.Navigator.startFeatureTwo(this)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unbind()
    }

    override fun showError() {
        Toast.makeText(FeatureOneActivity@this, "ERROR ONE", Toast.LENGTH_LONG).show()
    }

    override fun showSuccess(feature: FeatureOne) {
        Toast.makeText(FeatureOneActivity@this, feature.toString(), Toast.LENGTH_LONG).show()
    }
}
