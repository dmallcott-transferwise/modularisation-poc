package com.transferwise.feature_one

import com.transferwise.feature_two.FeatureOneView
import com.transferwise.feature_two.interactor.GetFeatureOneInteractor

class FeatureOnePresenter(private val interactor: GetFeatureOneInteractor) {

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