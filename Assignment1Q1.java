class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int number, temp, total = 0;

        number = num;
        while (number != 0) {
            temp = number % 10;
            total = total + temp * temp * temp;
            number /= 10;
        }
        if (total == num)
            return true;
        else
            return false;
    }
}

public class Assignment1Q1 {
    public static void main(String[] args) {
        ArmstrongOrNot armstrongOrNot = new ArmstrongOrNot();
        boolean result = armstrongOrNot.armstrongCheck(153);
        System.out.println(result);
    }
}