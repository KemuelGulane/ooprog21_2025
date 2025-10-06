public class Employee {
    int empNum;
    double rate;
    double maxRate = 60.00;
    int maxEmpNum = 9999;
    double overtimeRate = 1.5;

    Employee(int num, double r) {
        if(num > maxEmpNum) num = maxEmpNum;
        if(r > maxRate) r = maxRate;
        empNum = num;
        rate = r;
    }

    double regularPay(double hours) {
        if(hours > 40) hours = 40;
        return hours * rate;
    }

    double overtimePay(double hours) {
        double extra = 0;
        if(hours > 40) extra = hours - 40;
        return extra * (rate * overtimeRate);
    }
}
