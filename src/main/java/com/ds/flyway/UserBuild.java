package com.ds.flyway;

public class UserBuild {
    private User user;

    public UserBuild(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public static class Builder{
        private String userName;
        private String firstName;
        private String lastName;
        private String email;

        public Builder userName(String userName){
            this.userName = userName;
            return this;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public UserBuild build(){
            User user1 = new User(this.userName, this.firstName, this.lastName, this.email);
            return new UserBuild(user1);
        }
    }
}
