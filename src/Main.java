public class Main {
    private static Flower[] bouquet;

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


        bouquet = new Flower[]{
                new Flower("Роза", " ", "Голандия", 35.59f, 0),
                new Flower("Хризантема", "", "", 15f, 5),
                new Flower("Пион", "", "Англия", 69.9f, 1),
                new Flower("гипсофила", "", "Турция", 19.5f, 10)
        };
        //calculateCost();
        fullInformation();


    }


    public static void fullInformation() {
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null) {
                System.out.println(bouquet[i]);
            }
        }
        System.out.printf("цена " + "%.2f" , calculateCost());
        System.out.println(" цветок простоит дней " + minLifeSpan());

    }

    private static float calculateCost() {
        float sum = 0;
        for (int i = 0; i < bouquet.length; i++) {
            sum += bouquet[i].getCost();
        }
        int pay = 10;
        sum = sum + (sum * pay / 100);
        //System.out.printf("%.2f", sum);
        return sum;
    }

    private static int minLifeSpan() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bouquet.length; i++) {
            if (bouquet[i] != null && bouquet[i].getLifeSpan() < min) {
                min = bouquet[i].getLifeSpan();
            }
        }
        return min;
    }


}