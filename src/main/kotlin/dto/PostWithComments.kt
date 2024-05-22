package dto

data class PostWithComments(
    val post: Post,
    val author: String,
    val comments: List<Comment>,
)