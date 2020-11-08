import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        //Welcome screen!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BSDevs currency converter!");
        System.out.println("Type 'start' to run the program!");
        String menu = scanner.next();

        //command to start the program can be removed!
        if (menu.equals("start")) {
            //choose a currency main
            //example:
            // choosing USD and we have 2 options USD to EURO or USD to BGN.
            System.out.println("Welcome! Choose your main currency to convert in other. (1 - 3)");
            System.out.println("1. USD");
            System.out.println("2. Euro");
            System.out.println("3. BGN");
            String currency1 = scanner.next();

            if( currency1.equals("1")){
                System.out.println("Choose again 1 or 2");
                System.out.println("1. USD to Euro");
                System.out.println("2. USD to BGN");
                String currencydouble = scanner.next();

                if (currencydouble.equals("1")){
                    System.out.println("Enter USD: ");
                    double USD = Double.parseDouble(scanner.next());
                    double EURO = USD * 0.84;
                    System.out.println("You have "+ EURO + " Euro");
                }else if(currencydouble.equals("2")){

                    System.out.println("Enter USD: ");
                    double USD = Double.parseDouble(scanner.next());
                    double BGN = USD * 1.65;
                    System.out.println("You have "+ BGN + " BGN");
                }
            }if (currency1.equals("2")){

                System.out.println("Choose again 1 or 2");
                System.out.println("1. Euro to USD");
                System.out.println("2. Euro to BGN");
                String currencydouble1 = scanner.next();
                if (currencydouble1.equals("1")){

                    System.out.println("Enter Euro: ");
                    double euro = Double.parseDouble(scanner.next());
                    double EURO_USD = euro * 1.19;
                    System.out.println("You have " + EURO_USD + " USD");

                }else if(currencydouble1.equals("2")) {
                    System.out.println("Enter Euro: ");
                    double euro = Double.parseDouble(scanner.next());
                    double BGN = euro * 1.96;
                    System.out.println("You have " + BGN + " BGN");
                }
            }else if (currency1.equals("3")) {
                System.out.println("Choose again 1 or 2");
                System.out.println("2. BGN to USD");
                System.out.println("1. BGN to Euro");
                String currencydouble2 = scanner.next();
                if (currencydouble2.equals("1")){
                    System.out.println("Enter BGN: ");
                    double BGN = Double.parseDouble(scanner.next());
                    double USD = BGN * 0.61;
                    System.out.println("You have " + USD + " USD");
                }else if(currencydouble2.equals("2")){
                    System.out.println("Enter BGN: ");
                    double BGN = Double.parseDouble(scanner.next());
                    double Euro = BGN * 0.51;
                    System.out.println("You have " + Euro + " Euro");
                }
            }

            }
        }
    }
