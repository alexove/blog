package tech.andean

class ConsultasController {

    def index() {
        def autores = Author.list() // SELECT * FROM author
        autores.each{ author ->
            render "<p>-> ${author.username}<p>"
        }

        def autorAOviedo = Author.findByUsername('aoviedo')

        render "<br> ~~> ${autorAOviedo.name} ${autorAOviedo.surname} - ${autorAOviedo.username}"

        def autores2 = Author.findAllByUsernameLike('%o%')
        autores2.each{ author ->
            render "<br> ** ${author.username}"
        }

        // -- CRITERIA
        def c1= Author.createCriteria()

        def r1 = c1.list{
            like('username','%o%')
            and{
                like('email','%j%')
            }
        }

        r1.each{
            render "<br>## ${it.username} - ${it.name}"
        }

    }
}
