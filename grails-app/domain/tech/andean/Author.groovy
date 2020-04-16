package tech.andean

class Author {
    String name
    String surname
    String username
    String email

    static hasMany = [posts:Post]

    static constraints = {
        email email:true
        username unique:true
    }
}
