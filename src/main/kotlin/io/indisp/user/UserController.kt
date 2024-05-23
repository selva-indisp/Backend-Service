package io.indisp.user

import kotlinx.coroutines.delay
import java.util.UUID
import kotlin.random.Random

class UserController {

    suspend fun getUsers(): List<User> {
        delay(3000)
        return buildList {
            add(
                User(
                    id = "1",
                    name = "Selvakumar",
                    country = "India",
                    accounts = listOf(
                        Account(
                            id = "1",
                            number = "318976345890",
                            balance = 7500000.00,
                        )
                    )
                )
            )
            add(
                User(
                    id = "2",
                    name = "Bhuvana",
                    country = "India",
                    accounts = listOf(
                        Account(
                            id = "1",
                            number = "228976345890",
                            balance = 456000.00,
                        )
                    )
                )
            )
            add(
                User(
                    id = "3",
                    name = "Latha",
                    country = "India",
                    accounts = listOf(
                        Account(
                            id = "1",
                            number = "328976345890",
                            balance = 3982760.40,
                        )
                    )
                )
            )
            add(
                User(
                    id = "4",
                    name = "Mohan",
                    country = "India",
                    accounts = listOf(
                        Account(
                            id = "1",
                            number = "318476345890",
                            balance = 221908.20,
                        )
                    )
                )
            )
            add(
                User(
                    id = "5",
                    name = "Sangeetha",
                    country = "India",
                    accounts = listOf(
                        Account(
                            id = "1",
                            number = "218976345890",
                            balance = 459827.10,
                        )
                    )
                )
            )
        }
    }
}