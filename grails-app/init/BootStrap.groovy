import cvut.fel.bambaja2.organize.Role
import cvut.fel.bambaja2.organize.User
import cvut.fel.bambaja2.organize.UserRole

class BootStrap {

    def init = {
        /*def roleUser = new Role(authority: 'ROLE_USER').save()
        def roleTrainer = new Role(authority: 'ROLE_TRAINER').save()
        def roleAdmin = new Role(authority: 'ROLE_ADMIN').save()

        def user = new User(username: 'user', password: 'user').save()
        def trainer = new User(username: 'trainer', password: 'trainer').save()
        def admin = new User(username: 'admin', password: 'admin').save()

        UserRole.create(user, roleUser)
        UserRole.create(trainer, roleTrainer)
        UserRole.create(admin, roleAdmin)

        UserRole.withSession {
            it.flush()
            it.clear()
        }*/
    }
    def destroy = {
    }
}
