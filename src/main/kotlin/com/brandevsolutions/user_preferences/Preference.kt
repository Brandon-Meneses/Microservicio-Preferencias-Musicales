package com.brandevsolutions.user_preferences

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
data class MusicPreference(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val genre: String,
    val artist: String,
    val mood: String,
    val popularity: Int
)