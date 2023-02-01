package com.bracketcove.domain

import com.bracketcove.IFakeRepository

class FakeRepoImpl : IFakeRepository {
    override fun getUser(): User? {
//        TODO("Not yet implemented")
        print("Hello from FakeRepoImpl")

        return User(
            "John",
            "Doe",
            "PASSENGER",
            "",
            "",
            "",
            "",
            0.0,
            0.0,
            "",
            ""
        )
    }

}