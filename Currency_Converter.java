import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {

        while (true)
        {

            Scanner scanner = new Scanner(System.in);
            System.out.println("CAD = 1, USD = 2; RUBLE = 3");
            System.out.print("First currency name: ");
            int first = scanner.nextInt();

            if (first == 1 || first == 2 || first == 3)
            {
                Scanner scanner1 = new Scanner(System.in);
                System.out.print("Second currency name: ");
                int second = scanner1.nextInt();
                if (first == 1 || first == 2 || first == 3)
                {

                    String CAD = "CAD"; double CADValue;
                    String USD = "USD"; double USDdValue;
                    String RUBLE = "RUB"; double RUBLEValue;

                    if (first == second)
                    {
                        return;
                    }

                    if (first == 1)
                    {
                        Scanner scanner2 = new Scanner(System.in);
                        if (second == 2)
                        {
                            System.out.print("how many " + CAD + " do you want to convert to " + USD + ": ");
                            double what = scanner2.nextInt();
                            USDdValue = 1.251564455569462;
                            double math = what / USDdValue;
                            System.out.println(math);
                            break;
                        } else if (second == 3)
                        {
                            System.out.print("how many + " + CAD + " do you want to convert to " + RUBLE + ": ");
                            int what = scanner2.nextInt();
                            RUBLEValue = 58.7252;
                            double math = what * RUBLEValue;
                            System.out.println(math);
                            break;
                        }

                    } else if (first == 2)
                    {
                        Scanner scanner2 = new Scanner(System.in);

                        if (second == 1)
                        {
                            System.out.print("how many " + USD + " do you want to convert to " + CAD + ": ");
                            double what = scanner2.nextInt();
                            CADValue = 1.252;
                            double math = what * CADValue;
                            System.out.println(math);
                            break;
                        } else if (second == 3)
                        {
                            System.out.print("how many + " + USD + " do you want to convert to " + RUBLE + ": ");
                            int what = scanner2.nextInt();
                            RUBLEValue = 73.5123;
                            double math = what * RUBLEValue;
                            System.out.println(math);
                            break;
                        }

                    } else if (first == 3)
                    {
                        Scanner scanner2 = new Scanner(System.in);

                        if (second == 1)
                        {
                            System.out.print("how many " + RUBLE + " do you want to convert to " + CAD + ": ");
                            double what = scanner2.nextInt();
                            CADValue = 58.82352941176471;
                            double math = what / CADValue;
                            System.out.println(math);
                            break;
                        } else if (second == 2)
                        {
                            System.out.print("how many " + RUBLE + " do you want to convert to " + USD + ": ");
                            double what = scanner2.nextInt();
                            USDdValue = 73.52941176470588;
                            double math = what / USDdValue;
                            System.out.println(math);
                            break;
                        }
                    }
                }
            } else{
                System.out.println("");
                System.out.println("----------------------------------------------");
                System.out.println("E R R O R! ENTER 1 - CAD, 2 - USD OR 3 - RUBLE");
                System.out.println("----------------------------------------------");
                System.out.println("");
            }
        }
    }
}
