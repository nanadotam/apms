public class User {
    private String userId;
    private String name;
    private String role;    // student, staff, visitors

    User(String userId, String name, String role){
        this.userId = userId;
        this.name  = name;
        this.role = role;
    }

    // Getters
    public String getUserId(){
        return userId;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }
    
    // Setters
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setRole(String role){
        this.role = role;
    }

    System.out.println("Elsie commit");

}


