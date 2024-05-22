package io.indisp.user

import kotlinx.coroutines.delay

class UserController {

    suspend fun getUsers(): List<User> {
        delay(3000)
        return buildList {
            for (i in 1 until 20) {
                add(User(
                    id = "$i",
                    name = "User $i",
                    country = "India",
                    accounts = listOf(
                        Account(
                            id = "$i",
                            number = "Number $i"
                        )
                    )
                ))
            }
        }
    }
}