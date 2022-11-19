import com.sun.source.tree.CatchTree;

import java.time.LocalDate;

public class Human {
    private int yearOfBirth;
    public String name;
    private String town;
    public String jobTitle;
    private int age;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            yearOfBirth = 0;
        }
        this.yearOfBirth = yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            town = "'Информация не указана'";
        }
        this.town = town;
    }

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.town = town;
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public Human( String name, String town, String jobTitle, int age) {
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
        if (age >= 0) {
            this.yearOfBirth = LocalDate.now().getYear() - age;
        } else this.yearOfBirth = LocalDate.now().getYear() - Math.abs(age);
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ". Я из города " + getTown() + ". Я родился в " +
                getYearOfBirth() + " году." + " Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
