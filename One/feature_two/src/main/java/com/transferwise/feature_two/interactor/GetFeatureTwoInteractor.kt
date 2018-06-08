package com.transferwise.feature_two.interactor

import com.transferwise.feature_two.domain.FeatureTwo
import com.transferwise.feature_two.repository.FeatureTwoRepository
import javax.inject.Inject

class GetFeatureTwoInteractor @Inject constructor(private val repository: FeatureTwoRepository) {

    sealed class State {
        class Success(val featureTwo: FeatureTwo) : State()
        class Error : State()
    }

    fun getFeatureTwo() : State {
        val two = repository.getFeatureTwo()

        return if (two == null) {
            State.Error()
        } else {
            State.Success(two)
        }
    }
}