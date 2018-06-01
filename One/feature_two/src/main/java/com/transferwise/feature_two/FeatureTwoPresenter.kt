package com.transferwise.feature_two

import com.transferwise.feature_two.interactor.GetFeatureTwoInteractor

class FeatureTwoPresenter(private val interactor: GetFeatureTwoInteractor) {

    private var view: FeatureTwoView? = null

    fun bind(view: FeatureTwoView) {
        this.view = view
    }

    fun unbind() {
        this.view = null
    }

    fun getFeatureTwo() {
        val state = interactor.getFeatureTwo()

        when (state) {
            is GetFeatureTwoInteractor.State.Success -> view?.showSuccess(state.featureTwo)
            is GetFeatureTwoInteractor.State.Error -> view?.showError()

        }
    }
}