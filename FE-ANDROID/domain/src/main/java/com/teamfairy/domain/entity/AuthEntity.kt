package com.teamfairy.domain.entity

data class AuthEntity(
    val accessToken: String,
    val refreshToken: String
)