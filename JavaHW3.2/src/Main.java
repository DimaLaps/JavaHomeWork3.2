public class Main {
    public static void main(String[] args) {
        double startBalance = 152.55;
        double deposit = 1350.43;
        int multiplicity = 100;
        int coefficient = 1;
        int condition = 1000;
        long bonus = (long)deposit / multiplicity * coefficient;
        double finalBalance = startBalance + deposit;
        if (deposit >= condition) {
            finalBalance = startBalance + deposit + bonus;
        }
        System.out.println(finalBalance);
    }}
