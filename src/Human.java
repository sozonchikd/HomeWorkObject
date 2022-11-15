import com.sun.source.tree.CatchTree;

public class Human {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth > 1930) {
            this.yearOfBirth = yearOfBirth;
        } else throw new IllegalArgumentException("Некорректно введён год рождения");

        if (town == "" || town == null) {
            throw new IllegalArgumentException("Некорректно введён город");
        }
        this.town = town;
        if (jobTitle == "" || jobTitle == null) {
            throw new IllegalArgumentException("Некорректно введена должность");
        }
        this.jobTitle = jobTitle;
        if (name == "" || name == null) {
            throw new IllegalArgumentException("Некорректный ввод имени");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return "Привет! меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                yearOfBirth + " году." + " Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
