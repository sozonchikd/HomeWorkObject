public class Main {
    public static void main(String[] args) {
        Human maksim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артём", "Москва", "директор по развитию бизнеса");
        Human vladimir = new Human("Владимир", "Казань", "безработный", 21);
        System.out.println(katya);
        maksim.setYearOfBirth(-1988);
        maksim.setTown("  ");
        System.out.println(maksim);
        System.out.println(vladimir);



    }

}