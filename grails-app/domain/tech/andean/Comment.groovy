package tech.andean

class Comment {

    String body
    Date dateCreated
    String email

    static belongsTo = [post:Post]

    static constraints = {
        email email:true
        dateCreated nullable:true,blank:true
    }
}
