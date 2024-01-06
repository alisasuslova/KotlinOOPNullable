package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    /*@Test
    fun add() {

        val result = WallService.add(
            Post(
                postId = 0,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 0,
                fieldName = "Id",
                fieldTypeDescription = "Идентификатор записи.",
                likes = Likes(10)
            )
        )

        assertEquals(2, result.postId)
    }

    @Test
    fun ubdateTrue() {

        val firstPost = WallService.add(
            Post(
                postId = 0,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 0,
                fieldName = "Id",
                fieldTypeDescription = "Идентификатор записи.",
                likes = Likes(10)
            )
        )

        val result = WallService.ubdate(
            Post(
                postId = 1,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 1,
                fieldName = "NEW text",
                fieldTypeDescription = "Текст записи."
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun ubdateFalse() {

        val result = WallService.ubdate(
            Post(
                postId = 100,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 0,
                fieldName = "Id",
                fieldTypeDescription = "NEW",
                likes = Likes(10)
            )
        )
        assertEquals(false, result)
    }*/

    @Test
    fun add() {

        val result = WallService.add(
            Post(
                postId = 0,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 0,
                fieldName = null,
                fieldTypeDescription = "Идентификатор записи.",
                likes = Likes(10)
            )
        )

        assertEquals(2, result.postId)
    }

    @Test
    fun ubdateTrue() {

        val firstPost = WallService.add(
            Post(
                postId = 0,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 0,
                fieldName = null,
                fieldTypeDescription = "Идентификатор записи.",
                likes = Likes(10)
            )
        )

        val result = WallService.ubdate(
            Post(
                postId = 1,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 1,
                fieldName = null,
                fieldTypeDescription = "Текст записи."
            )
        )

        assertEquals(true, result)
    }

    @Test
    fun ubdateFalse() {

        val result = WallService.ubdate(
            Post(
                postId = 100,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 0,
                fieldName = null,
                fieldTypeDescription = "NEW",
                likes = Likes(10)
            )
        )
        assertEquals(false, result)
    }
}