package io.indisp.user

import kotlinx.coroutines.delay

class UserController {

    private companion object {
        val userList = buildList {
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
                    country = "Australia",
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

    suspend fun getUsers(query: String?): List<User> {
        if (query.isNullOrEmpty().not())
            return search(query!!.lowercase())

        delay(3000)
        return userList
    }

    private suspend fun search(query: String): List<User> {
        delay(2000)
        return userList.filter { it.name.lowercase().contains(query) || it.country.lowercase().contains(query) }
    }
}