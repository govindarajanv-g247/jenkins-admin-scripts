import hudson.model.User
User.getAll().each { user ->
println user.getId()}


total_users = User.getAll().size()

