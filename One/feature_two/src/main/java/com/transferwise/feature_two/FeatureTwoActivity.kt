package com.transferwise.feature_two

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.transferwise.feature_two.domain.FeatureTwo
import com.transferwise.feature_two.interactor.GetFeatureTwoInteractor
import com.transferwise.feature_two.repository.FeatureTwoRepository
import kotlinx.android.synthetic.main.activity_feature_two.*

class FeatureTwoActivity : AppCompatActivity(), FeatureTwoView {

    private lateinit var presenter : FeatureTwoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)
        pretendDaggerInjectMethod()

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

    private fun pretendDaggerInjectMethod() {
        // Literally pretending this is dagger
        val provider = application as FeatureTwoDependencyProvider
        val client = provider.provide()
        // The following line is the equivalent of creating a new Dagger component
        // for the feature module
        presenter = FeatureTwoPresenter(GetFeatureTwoInteractor(FeatureTwoRepository(client)))
    }
}
