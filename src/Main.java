// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int price = 5800; // стоимость авиабилета в рублях
        int mile = 20; // 1 миля начисляется за каждые 20 рублей

        System.out.println("Количество миль за стоимость билета");
        System.out.println(price / mile);
    }
}