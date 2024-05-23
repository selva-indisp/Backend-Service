package io.indisp.user

import kotlinx.serialization.Serializable

@Serializable
data class Account(
    val id: String,
    val number: String,
    val balance: Double
)