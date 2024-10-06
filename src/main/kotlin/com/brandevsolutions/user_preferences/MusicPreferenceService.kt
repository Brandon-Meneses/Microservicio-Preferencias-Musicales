package com.brandevsolutions.user_preferences

import org.springframework.stereotype.Service

@Service
class MusicPreferenceService(private val repository: MusicPreferenceRepository) {
    //obtener
    fun getAllPreferences(): List<MusicPreference> {
        return repository.findAll()
    }
    //agregar
    fun addPreference(preference: MusicPreference): MusicPreference {
        return repository.save(preference)
    }

    //actualizar
    fun updatePreference(id: Long, preference: MusicPreference): MusicPreference {
        val existingPreference = repository.findById(id)
        if (existingPreference.isPresent) {
            val updatedPreference = existingPreference.get()
                .copy(
                    genre = preference.genre,
                    artist = preference.artist,
                    mood = preference.mood,
                    popularity = preference.popularity
                )
            return repository.save(updatedPreference)
        }
        throw IllegalArgumentException("Preference with id $id not found")
    }
    //eliminar
    fun deletePreference(id: Long) {
        repository.deleteById(id)
    }

}