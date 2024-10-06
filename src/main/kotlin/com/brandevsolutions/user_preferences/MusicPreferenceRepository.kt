package com.brandevsolutions.user_preferences

import org.springframework.data.jpa.repository.JpaRepository

interface MusicPreferenceRepository : JpaRepository<MusicPreference, Long>
