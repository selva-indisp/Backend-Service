package io.indisp.user

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String,
    val name: String,
    val country: String,
    val accounts: List<Account>
)