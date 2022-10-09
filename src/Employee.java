import java.util.Date;

public class Employee {
    public String name;
    public double salary;
    public int  workHours;
    public int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*Maaşa uygulanan vergiyi hesapla salary>1000=>%3 uygula
        Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar
    */
    public double tax(double newSalary){
        if (newSalary>1000){
            return newSalary*0.03;
        }
        else {
            return 0;
        }
    }

    /* Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
        her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    */
    public double bonus(int hour){
        if (hour>40){
            int mesai=hour-40;
            double mesaiUcreti=mesai*30;
            return mesaiUcreti;

        }else {
            return 0;
        }

    }


    /*Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
        Şuanki yıl 2021
    */
    public double raiseSalary(int year, double salary){
        int hYear=year-2021;
        if (hYear<10){
            return salary=salary*0.05;
        }
        else if (hYear>9 && hYear<20) {
            return salary=salary*0.1;
        }
        else if (hYear>19) {
            salary=salary*0.15;
            return salary;
        }
        else return 0;

    }

    ///Çalışan bilgilerini yaz
    public static void toString(Employee employee){
        System.out.println("Adı: " +employee.name + "\nMaaşı: "+employee.salary + "\nBaşlangıç Yılı: "+employee.hireYear );

    }

}
