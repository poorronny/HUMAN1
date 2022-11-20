public class Main {
    public static void main(String[] args) {

        Human maxim = new Human("Maxim", 1988, "Minsk", "Brand Manager");
        Human anna = new Human ("Anna", 1993, "Moscow", "Methodist of Education Programs");
        Human katya = new Human ("Katya", 1992, "Kaliningrad", "Product Manager");
        Human artem = new Human("Artem", 1995, "Moscow", "Director of Business Development" );

        maxim.hello();
        System.out.println(maxim);
        maxim.bye();
        System.out.println();
        anna.hello();
        System.out.println(anna);
        anna.bye();
        System.out.println();
        katya.hello();
        System.out.println(katya);
        katya.bye();
        System.out.println();
        artem.hello();
        System.out.println(artem);
        artem.bye();
    }
}
