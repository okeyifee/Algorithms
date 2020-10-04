import java.util.Date;


/*
Build A simple Comment section using Java OOP
 */

public class Algo1 {

    public static class User {

//      Variable naming
        private String name;
        private boolean isLoggedIn;
        private Date lastLoggedInAt;


        public User(String name) {
            this.name = name;
        }
//      Method to check if user is logged in
        boolean isLoggedIn() {
            if(this.isLoggedIn){
                return true;
            }
            return false;
        }


        Date getLastLoggedInAt() {
            return lastLoggedInAt;
        }

//      method to login user
        public void logIn() {
            if (!this.isLoggedIn){
                this.isLoggedIn = true;
                lastLoggedInAt = new Date();
            }
        }


        public void logOut() {
            if(this.isLoggedIn){
                this.isLoggedIn = false;
            }
        }


        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name= name;
        }

//      method to allow user edit his comment
        public boolean canEdit(Comment comment) {
            if (comment.author.name == name) {
                return true;
            }
            return false;
        }




        public boolean canDelete(Comment comment) {
            return false;
        }

    }


//  moderator inherits from user class
    public static class Moderator extends User{

        public Moderator(String name) {
            super (name);
        }
        public boolean canDelete(Comment comment) {
            return true;
        }
    }

    public static class Admin  extends Moderator{
        public Admin(String name) {
            super(name);
        }
        public boolean canEdit(Comment comment) {
            return true;
        }
    }


    public static class Comment {
        public User author;
        public String message;
        public Comment repliedTo;
        public Date createdAt;


        public Comment(User author, String message) {
            this.createdAt = new Date();
            this.message = message;
            this.author = author;
        }

        public Comment(User author, String message, Comment repliedTo) {
            this.createdAt = new Date();
            this.message = message;
            this.author = author;
            this.repliedTo = repliedTo;
        }


        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
        public Date getCreatedAt() {
            return createdAt;
        }


        public User getAuthor() {
            return author;
        }

        public Comment getRepliedTo() {
            return repliedTo;
        }


        public String toString() {
            if(this.repliedTo == null) {
                return message + " by " + author.name;
            }
            return message + " by " + author.name + " (replied to " +
                    repliedTo.author.name + ")";
        }
    }
}