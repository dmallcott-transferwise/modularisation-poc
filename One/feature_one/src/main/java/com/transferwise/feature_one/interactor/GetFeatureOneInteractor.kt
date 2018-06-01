package com.transferwise.feature_two.interactor

import com.transferwise.feature_one.domain.FeatureOne
import com.transferwise.feature_one.repository.FeatureOneRepository

class GetFeatureOneInteractor(private val repository: FeatureOneRepository) {

    sealed class State {
        class Success(val featureOne: FeatureOne) : State()
        class Error : State()
    }

    fun getFeatureOne() : State {
        val two = repository.getFeatureOne()

        return if (two == null) {
            State.Error()
        } else {
            State.Success(two)
        }
    }
}