package com.brandevsolutions.user_preferences

import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/preferences")
@CrossOrigin(origins = ["http://localhost:4200"])
class MusicPreferenceController(private val service: MusicPreferenceService) {

    @GetMapping
    fun getAllPreferences(): List<MusicPreference> {
        return service.getAllPreferences()
    }

    @PostMapping
    fun addPreference(@RequestBody preference: MusicPreference): MusicPreference {
        return service.addPreference(preference)
    }
    //actualizar
    @PutMapping("/{id}")
    fun updatePreference(@PathVariable id: Long, @RequestBody preference: MusicPreference): MusicPreference {
        return service.updatePreference(id, preference)
    }
    //eliminar
    @DeleteMapping("/{id}")
    fun deletePreference(@PathVariable id: Long) {
        service.deletePreference(id)
    }
}