package com.transferwise.feature_two.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.transferwise.feature_two.FeatureTwoContract
import com.transferwise.feature_two.R
import com.transferwise.feature_two.domain.FeatureTwo
import kotlinx.android.synthetic.main.activity_feature_two.*
import javax.inject.Inject

class FeatureTwoActivity : AppCompatActivity(), FeatureTwoView {

    @Inject lateinit var presenter : FeatureTwoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)
        (application as FeatureTwoContract.DependencyProvider).createTwoComponent().inject(this)

        title = "Feature Two"

        presenter.bind(this)

        apiCall.setOnClickListener {
            presenter.getFeatureTwo()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.unbind()
    }

    override fun showError() {
        Toast.makeText(FeatureTwoActivity@this, "ERROR ONE", Toast.LENGTH_LONG).show()
    }

    override fun showSuccess(featureTwo: FeatureTwo) {
        Toast.makeText(FeatureTwoActivity@this, featureTwo.toString(), Toast.LENGTH_LONG).show()
    }
}
