package com.brandevsolutions.user_preferences

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class UserPreferencesApplication {

	@Bean
	fun run(repository: MusicPreferenceRepository) = CommandLineRunner {
		// Check if there are any preferences in the repository
		if (repository.count() == 0L) {
			val preferences = listOf(
				MusicPreference(genre = "Pop", artist = "Taylor Swift", mood = "Happy", popularity = 90),
				MusicPreference(genre = "Rock", artist = "Queen", mood = "Energetic", popularity = 85),
				MusicPreference(genre = "Hip-Hop", artist = "Kendrick Lamar", mood = "Motivational", popularity = 88),
				MusicPreference(genre = "Pop", artist = "Ariana Grande", mood = "Happy", popularity = 85),
				MusicPreference(genre = "Rock", artist = "The Beatles", mood = "Energetic", popularity = 80),
				MusicPreference(genre = "Hip-Hop", artist = "Drake", mood = "Motivational", popularity = 82),
				MusicPreference(genre = "Pop", artist = "Ed Sheeran", mood = "Happy", popularity = 80),
				MusicPreference(genre = "Rock", artist = "Led Zeppelin", mood = "Energetic", popularity = 75),
				MusicPreference(genre = "Hip-Hop", artist = "J. Cole", mood = "Motivational", popularity = 78),
				MusicPreference(genre = "Pop", artist = "Shawn Mendes", mood = "Happy", popularity = 75),
				MusicPreference(genre = "Rock", artist = "Pink Floyd", mood = "Energetic", popularity = 70),
				MusicPreference(genre = "Hip-Hop", artist = "Travis Scott", mood = "Motivational", popularity = 72),
				MusicPreference(genre = "Pop", artist = "Dua Lipa", mood = "Happy", popularity = 70),
				MusicPreference(genre = "Rock", artist = "The Rolling Stones", mood = "Energetic", popularity = 65)
			)
			repository.saveAll(preferences)
		}
	}
}

fun main(args: Array<String>) {
	runApplication<UserPreferencesApplication>(*args)
}

