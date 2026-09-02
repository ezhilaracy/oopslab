import java.util.*;
import java.text.DecimalFormat;

public class Convertor {


static Scanner sc = new Scanner(System.in);
static DecimalFormat f = new DecimalFormat("##.###");

// Currency Conversion
static void convertInrToEuro() {
    System.out.print("Enter amount in Rupees: ");
    double rupee = sc.nextDouble();
    double euro = rupee / 80;
    System.out.println("Euro: " + f.format(euro));
}

static void convertEuroToInr() {
    System.out.print("Enter amount in Euro: ");
    double euro = sc.nextDouble();
    double rupee = euro * 80;
    System.out.println("Rupees: " + f.format(rupee));
}

static void convertInrToDollar() {
    System.out.print("Enter amount in Rupees: ");
    double rupee = sc.nextDouble();
    double dollar = rupee / 66;
    System.out.println("Dollar: " + f.format(dollar));
}

static void convertDollarToInr() {
    System.out.print("Enter amount in Dollar: ");
    double dollar = sc.nextDouble();
    double rupee = dollar * 66;
    System.out.println("Rupees: " + f.format(rupee));
}

static void convertInrToYen() {
    System.out.print("Enter amount in Rupees: ");
    double rupee = sc.nextDouble();
    double yen = rupee / 0.61;
    System.out.println("Yen: " + f.format(yen));
}

static void convertYenToInr() {
    System.out.print("Enter amount in Yen: ");
    double yen = sc.nextDouble();
    double rupee = yen * 0.61;
    System.out.println("Rupees: " + f.format(rupee));
}

// Distance Conversion
static void convertMeterToKm() {
    System.out.print("Enter the meter: ");
    double meter = sc.nextDouble();
    double km = meter * 0.001;
    System.out.println("Kilometer: " + f.format(km));
}

static void convertKmToMeter() {
    System.out.print("Enter the Kilometer: ");
    double km = sc.nextDouble();
    double meter = km / 0.001;
    System.out.println("Meter: " + f.format(meter));
}

static void convertMilesToKm() {
    System.out.print("Enter the miles: ");
    double miles = sc.nextDouble();
    double km = miles * 1.6093;
    System.out.println("Kilometer: " + f.format(km));
}

static void convertKmToMiles() {
    System.out.print("Enter the Kilometer: ");
    double km = sc.nextDouble();
    double miles = km / 1.6093;
    System.out.println("Miles: " + f.format(miles));
}

// Time Conversion
static void convertHourToMinute() {
    System.out.print("Enter the Hour: ");
    double hour = sc.nextDouble();
    double minute = hour * 60;
    System.out.println("Minutes: " + f.format(minute));
}

static void convertMinuteToHour() {
    System.out.print("Enter the Minute: ");
    double minute = sc.nextDouble();
    double hour = minute / 60;
    System.out.println("Hours: " + f.format(hour));
}

static void convertHourToSeconds() {
    System.out.print("Enter the Hour: ");
    double hour = sc.nextDouble();
    double second = hour * 3600;
    System.out.println("Seconds: " + f.format(second));
}

static void convertSecondsToHour() {
    System.out.print("Enter the Seconds: ");
    double second = sc.nextDouble();
    double hour = second / 3600;
    System.out.println("Hours: " + f.format(hour));
}

public static void main(String[] args) {

    System.out.println("Enter the code:");
    System.out.println("1. Currency");
    System.out.println("2. Distance");
    System.out.println("3. Time");

    int code = sc.nextInt();

    if (code == 1) {

        System.out.println("Enter the Currency code:");
        System.out.println("1. Euro");
        System.out.println("2. Dollar");
        System.out.println("3. Yen");

        int currencyCode = sc.nextInt();

        if (currencyCode == 1) {
            convertInrToEuro();
            convertEuroToInr();
        }
        else if (currencyCode == 2) {
            convertInrToDollar();
            convertDollarToInr();
        }
        else if (currencyCode == 3) {
            convertInrToYen();
            convertYenToInr();
        }
        else {
            System.out.println("Invalid Code");
        }
    }

    else if (code == 2) {

        System.out.println("Enter the Distance code:");
        System.out.println("1. Meter");
        System.out.println("2. Miles");

        int distanceCode = sc.nextInt();

        if (distanceCode == 1) {
            convertMeterToKm();
            convertKmToMeter();
        }
        else if (distanceCode == 2) {
            convertMilesToKm();
            convertKmToMiles();
        }
        else {
            System.out.println("Invalid Code");
        }
    }

    else if (code == 3) {

        System.out.println("Enter the Time code:");
        System.out.println("1. Minutes");
        System.out.println("2. Seconds");

        int timeCode = sc.nextInt();

        if (timeCode == 1) {
            convertHourToMinute();
            convertMinuteToHour();
        }
        else if (timeCode == 2) {
            convertHourToSeconds();
            convertSecondsToHour();
        }
        else {
            System.out.println("Invalid Code");
        }
    }

    else {
        System.out.println("Invalid Code");
    }

    sc.close();
}


}
