package com.transferwise.feature_one.ui

import com.transferwise.feature_one.Mockable
import com.transferwise.feature_two.FeatureOneView
import com.transferwise.feature_one.interactor.GetFeatureOneInteractor
import javax.inject.Inject
import javax.inject.Singleton

@Mockable
class FeatureOnePresenter @Inject constructor(private val interactor: GetFeatureOneInteractor) {

    private var view: FeatureOneView? = null

    fun bind(view: FeatureOneView) {
        this.view = view
    }

    fun unbind() {
        this.view = null
    }

    fun getFeatureOne() {
        val state = interactor.getFeatureOne()

        when (state) {
            is GetFeatureOneInteractor.State.Success -> view?.showSuccess(state.featureOne)
            is GetFeatureOneInteractor.State.Error -> view?.showError()

        }
    }
}