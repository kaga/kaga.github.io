package com.kaga.test_mockk

import com.google.common.truth.Truth.assertThat
import org.junit.Test

fun printLocation(location: String?): String {
    val locationRawFormat = location?.replace("-", "")?.toIntOrNull()
    return when {
        locationRawFormat != null && locationRawFormat > 0 -> location
        else -> "Not Available"
    }
}

class PrintLocationTest {

    @Test
    fun `should return valid location`() {
        assertThat(printLocation("12-12-12-12-12"))
            .isEqualTo("12-12-12-12-12")
    }

    @Test
    fun `should return 'Not Available' on location 0000000000`() {
        assertThat(printLocation("0000000000"))
            .isEqualTo("Not Available")
    }

    @Test
    fun `should return 'Not Available' on invalid data`() {
        assertThat(printLocation("invalid"))
            .isEqualTo("Not Available")
    }

    @Test
    fun `should return 'Not Available' on empty`() {
        assertThat(printLocation(""))
            .isEqualTo("Not Available")
    }

    @Test
    fun `should return 'Not Available' on null`() {
        assertThat(printLocation(null))
            .isEqualTo("Not Available")
    }
}

