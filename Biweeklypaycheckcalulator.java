import java.util.Scanner;
public class Biweeklypaycheckcalulator {
    public static void main(String[] args) {
        double hours_worked;
        double hours_worked2;
        double payrate;
        double overtime_rate;
        double overtime_hours;
        double overtime_hours2;
        double overtime_pay;
        double overtime_pay2;
        double paid_timeoff;
        double paid_timeoff2;
        double paid_timeoff_total;
        double pay;
        double pay2;
        double grosspay;
        double federal_tax;
        double social_security_tax;
        double medicare_tax;
        double state_tax;
        double total_tax;
        double net_pay;
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your rate of pay");
        payrate=scan.nextDouble();
        System.out.println("how many hours did you work during the first week");
        hours_worked=scan.nextDouble();
        System.out.println("how many hours did you work during the second week week");
        hours_worked2=scan.nextDouble();
        System.out.println("how many paid timeoff hours did you use the first week");
        paid_timeoff=scan.nextDouble();
        System.out.println("how many paid timeoff hours did you use the first week");
        paid_timeoff2=scan.nextDouble();
        paid_timeoff_total=paid_timeoff+paid_timeoff2;
        overtime_rate=payrate*1.5;
        overtime_hours=hours_worked-40;
        overtime_hours2=hours_worked-40;
        if (hours_worked > 40 && hours_worked2<= 40)
        {
            overtime_pay = overtime_rate*overtime_hours;
            pay = (payrate * 40) + overtime_pay;
            pay2 = payrate * hours_worked2;
        }
        else if (hours_worked2 > 40 && hours_worked <= 40)
        {
            overtime_pay2 =overtime_rate*overtime_hours2;
            pay2 = (payrate * 40) + overtime_pay2;
            pay = payrate *hours_worked;
        }

        else if (hours_worked > 40 && hours_worked2 > 40)
        {
            overtime_pay = overtime_rate *overtime_hours;
            overtime_pay2 = overtime_rate *overtime_hours2;
            pay = (payrate * 40) + overtime_pay;
            pay2 = (payrate * 40) + overtime_pay2;
        }

        else
        {
            pay = payrate * hours_worked;
            pay2 = payrate * hours_worked2;
        }

        grosspay=pay+pay2+(paid_timeoff_total*payrate);
        System.out.println("your gross pay for this period is "+grosspay);
        federal_tax=grosspay*0.0815511364;
        social_security_tax=grosspay*0.062;
        medicare_tax =grosspay*0.0145;
        state_tax =grosspay*0.0469431818;
        total_tax = federal_tax+social_security_tax+medicare_tax+state_tax;
        net_pay=grosspay-total_tax;
        System.out.println("your net pay for this period is "+net_pay);
    }
}