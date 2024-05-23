package io.indisp

import io.indisp.user.UserController
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureCors()
    configureRouting()
    configureSerialization()
}

fun Application.configureCors() {
    install(CORS) {
        methods.add(HttpMethod.Options)
        methods.add(HttpMethod.Put)
        methods.add(HttpMethod.Delete)
        methods.add(HttpMethod.Patch)
        methods.add(HttpMethod.Get)
        methods.add(HttpMethod.Post)
        methods.add(HttpMethod.Head)
        headers.add(HttpHeaders.Authorization)
        headers.add(HttpHeaders.ContentType)
        allowCredentials = true
        anyHost() // Do not use this in production, specify the domains you trust instead
        allowNonSimpleContentTypes = true
    }
}

val userController = UserController()

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/users") {
            runBlocking {
                val usersList = userController.getUsers()
                call.respond(HttpStatusCode.OK, usersList)
            }
        }
    }
}

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
    }
}
