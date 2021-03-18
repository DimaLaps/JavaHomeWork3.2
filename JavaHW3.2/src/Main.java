public class Main {
    public static void main(String[] args) {
        double balance = 152.55;
        double deposit = 1350.43;
        int multiplicity = 100;
        int coefficient = 1;
        int condition = 1000;
        int bonus = 0;
        if (deposit >= condition) {
            bonus = (int) (deposit / multiplicity * coefficient);
        }
        balance = balance + deposit + bonus;
        System.out.println(balance);
    }}