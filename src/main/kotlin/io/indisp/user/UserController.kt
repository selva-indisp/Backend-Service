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

            add(
                User(
                    id = "6",
                    name = "Sudha Balakrishnan",
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
                    id = "7",
                    name = "Balakrishnan",
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
                    id = "8",
                    name = "Sunil Sharma",
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
                    id = "9",
                    name = "Pravin Varma",
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
                    id = "10",
                    name = "Bala",
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

            add(
                User(
                    id = "11",
                    name = "Venilla",
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
                    id = "12",
                    name = "Velammai",
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
                    id = "13",
                    name = "Sharmi",
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
                    id = "14",
                    name = "Narmi",
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
                    id = "15",
                    name = "Nandhini",
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

    suspend fun getUsers(pageNum: Int, query: String?): List<User> {
        if (query.isNullOrEmpty().not())
            return search(query!!.lowercase())

        delay(3000)
        val start = (pageNum - 1) * 5
        val end = start + 5
        val result = mutableListOf<User>()
        if (start > userList.lastIndex)
            return result
        for (i in start until end)
            if (i < userList.size)
                result.add(userList[i])
        return result
    }

    private suspend fun search(query: String): List<User> {
        delay(2000)
        return userList.filter { it.name.lowercase().contains(query) || it.country.lowercase().contains(query) }
    }
}