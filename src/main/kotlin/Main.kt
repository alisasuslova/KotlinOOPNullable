package ru.netology

data class Likes(val likes: Int = 0)

data class Post(
    var postId: Int,
    var dateOfPublished: String = "07/21/2020",
    var title: String = "Запись на стене | Разработчикам",
    var page: Int,
    var listOnTheLeft: String,
    var nameFieldOfTheList: String = "Запись на стене",
    var descriptionFieldOfTheList: String = "Объект, описывающий запись на стене пользователя или сообщества, содержит следующие поля:",
    var fieldId: Int, //id самой табличной записи, не поста
    var fieldName: String?,
    var fieldTypeDescription: String,
    var fieldType: String = "",
    var likes: Likes = Likes()
)

object WallService {
    private var posts = emptyArray<Post>() // массив для хранения постов
    private var lastPostId = 0

    fun add(post: Post): Post {
        posts += post.copy(++lastPostId, likes = post.likes.copy()) //добавляет пост в массив
        return posts.last() // возращает последний пост
    }

    fun ubdate(newPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.postId == newPost.postId) {
                posts[index] = newPost.copy(likes = post.likes.copy())
                return true
            }
        }
        return false
    }

    fun printPosts() {
        for (post in posts) {
            print(post)
            print(" ")
        }
        println()
    }
}


fun main() {

    WallService.add(
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

    WallService.add(
        Post(
            postId = 0,
            page = 1,
            listOnTheLeft = "Документация",
            fieldId = 1,
            fieldName = "text",
            fieldTypeDescription = "Текст записи."
        )
    )

    println(
        WallService.ubdate(
            Post(
                postId = 1,
                page = 1,
                listOnTheLeft = "Документация",
                fieldId = 1,
                fieldName = "NEW text",
                fieldTypeDescription = "Текст записи."
            )
        )
    )

    WallService.printPosts()

    WallService.add(
        Post(
            postId = 3,
            page = 1,
            listOnTheLeft = "Документация",
            fieldId = 1,
            fieldName = null,
            fieldTypeDescription = "Текст записи."
        )
    )
    WallService.printPosts()
}


