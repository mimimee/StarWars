package com.itsnotme.catwiki.domain.fact.mappers

import com.itsnotme.catwiki.domain.fact.FactDomainModel
import javax.inject.Inject

interface FactDbToDomainMapper {
    fun map(id: String, text: String, updated: String, sentCount: Int): FactDomainModel

    class BaseImpl @Inject constructor(): FactDbToDomainMapper {
        override fun map(id: String, text: String, updated: String, sentCount: Int) =
            FactDomainModel(id, text, updated, sentCount)
    }
}