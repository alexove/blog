package tech.andean

class Post {
    String title
    String body
    Date dateCreated
    Date lastUpdated
    Boolean published = false

    static belongsTo = [author:Author]
    static hasMany = [comments:Comment]

    static constraints = {
        title unique:true,blank:false,maxSize:150
        dateCreated nullable:true
        lastUpdated nullable:true
        body blank:false
    }
}
