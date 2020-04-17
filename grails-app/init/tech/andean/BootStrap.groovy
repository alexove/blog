package tech.andean

import tech.andean.Author
import tech.andean.Post
import tech.andean.Comment

class BootStrap {

    def init = { servletContext ->
        def a1 = new Author(name:'Alex',surname:'Oviedo',username:'aoviedo',email:'aoviedo@andean.tech').save(flush:true)
        def a2 = new Author(name:'Jarni',surname:'Paco',username:'jpaco',email:'jpaco@andean.tech').save(flush:true)
        def a3 = new Author(name:'Luis',surname:'Salas',username:'lsalas',email:'lsalas@andean.tech').save(flush:true)

        a1.addToPosts(new Post(title:'Post autor 11',body:'Primer post'))
        a1.addToPosts(new Post(title:'Post autor 12',body:'Segundo post'))
        a1.save(flush:true)

        a2.addToPosts(new Post(title:'Post autor 21',body:'Primer post'))
        a2.addToPosts(new Post(title:'Post autor 22',body:'Segundo post'))
        a2.save(flush:true)

        a3.addToPosts(new Post(title:'Post autor 31',body:'Primer post'))
        a3.addToPosts(new Post(title:'Post autor 32',body:'Segundo post'))
        a3.save(flush:true)


    }
    def destroy = {
    }
}
