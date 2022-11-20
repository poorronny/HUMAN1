public class Human {
    String name;
    int yearOfBirth;
    String town;
    String jobTitle;


    Human(String name, int yearOfBirth, String town, String jobTitle) {

        if (name == null) {
            this.name = "Value not specified";
        } else {
            this.name = name;
        }

        if (yearOfBirth <= 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        if (town == null) {
            this.town = "Value not specified";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Value not specified";
        } else {
            this.jobTitle = jobTitle;
        }


    }

    void hello() {
        System.out.println("Hello! ");
    }

    void bye() {
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
