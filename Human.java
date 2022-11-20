public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;


    Human (String name, int yearOfBirth, String town, String jobTitle){
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    void hello(){
        System.out.println("Hello! ");
    }
    void bye(){
        System.out.println("Glad to meet you!");
    }

    @Override
    public String toString() {
        return "My name is " + name +
                ", I was born in " + yearOfBirth +
                ". I`m from " + town + "." +
                " I work in a position " + jobTitle + ".";
    }

}
