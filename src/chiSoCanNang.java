import java.util.Scanner;

public class chiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight/ Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if (bmi < 18){
            System.out.printf("%-20.2f%s", bmi, "Thieu Can");
        }else if (bmi < 25.0){
            System.out.printf("%-20.2f%s", bmi, "Binh Thuong");
        }else if (bmi< 30.0){
            System.out.printf("%-20.2f%s", bmi, "Thua Can");
        }else {
            System.out.printf("%-20.2f%s", bmi, " Beo Phi");
        }
    }

}
