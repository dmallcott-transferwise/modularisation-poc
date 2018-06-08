package com.transferwise.feature_two.ui

import com.transferwise.feature_two.interactor.GetFeatureTwoInteractor
import javax.inject.Inject

class FeatureTwoPresenter @Inject constructor(private val interactor: GetFeatureTwoInteractor) {

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