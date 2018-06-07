package com.transferwise.feature_one

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.transferwise.feature_one.domain.FeatureOne
import com.transferwise.feature_one.repository.FeatureOneRepository
import com.transferwise.feature_two.FeatureOneView
import com.transferwise.feature_two.FeatureTwoContract
import com.transferwise.feature_two.interactor.GetFeatureOneInteractor
import kotlinx.android.synthetic.main.activity_feature_one.*

class FeatureOneActivity : AppCompatActivity(), FeatureOneView {

    private lateinit var presenter : FeatureOnePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)
        pretendDaggerInjectMethod()

        title = "Feature One"

        presenter.bind(this)

        apiCall.setOnClickListener {
            presenter.getFeatureOne()
        }

        featureTwo.setOnClickListener {
            FeatureTwoContract.FeatureTwoNavigator.startFeatureTwo(this)
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

    private fun pretendDaggerInjectMethod() {
        // Literally pretending this is dagger
        val provider = application as FeatureOneDependencyProvider
        val client = provider.provide()
        // The following line is the equivalent of creating a new Dagger component
        // for the feature module
        presenter = FeatureOnePresenter(GetFeatureOneInteractor(FeatureOneRepository(client)))
    }
}
