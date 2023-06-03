// class members (variables or methods) can be accessed from static & instance methods. 
// Just to be completely clear, here is a summary of that same information.

// a) Accessibility from Static Methods:

// Cannot directly access instance variables/methods defined in the same class as the static method

// Can directly access static variables/methods defined in the same class

// Can access anything via an object reference. So, from a static method by using an object reference, we can access instance variables/methods

// b) Accessibility from Instance Methods:

// Can access anything from an instance method. So, we can even access static variables/methods defined in the same class as the instance method.
// import java.math.BigDecimal;

// class CurrencyConverter {
//     int rupee = 63;
//     int dirham = 3;
//     int chilean_peso = 595;
//     int mexican_peso = 18;
//     int _yen = 107;
//     int $australian = 2;
//     int dollar = 1;
//     int Rupee = 63;
//     int i = 0x7fffffff;   // int MAX_VALUE
//     int j = 0x80000000;  // int MIN_VALUE

//     void printCurrencies() {
//         System.out.println("rupee : " + rupee);
//         System.out.println("dirham : " + dirham);
//         System.out.println("chilean_peso : " + chilean_peso);
//         System.out.println("mexican_peso : " + mexican_peso);
//         System.out.println("yen : " + _yen);
//         System.out.println("Australian : " + $australian);
//         System.out.println("Dollar : " + dollar);
//         System.out.println("Rupee  : " + Rupee);
//         System.out.println("i  : " + i);
//         System.out.println("j  : " + j);

//         // Double is not a good choice if you deal with money, use BigDecimal instead
//         double k = 0.1 + 0.2;

//         System.out.println("k (0.1 + 0.2 using Decimal): " + k);

//         BigDecimal first_l = new BigDecimal(String.valueOf(0.1));
//         BigDecimal second_l = new BigDecimal(String.valueOf(0.2));
//         BigDecimal l = first_l.add(second_l);

//         System.out.println("l  (0.1 + 0.2 using Decimal): " + l);
//     }


//     public static void main(String[] args) {
//         CurrencyConverter cc = new CurrencyConverter();

//         cc.printCurrencies();
//     }

// }

// Using Array

// public class CurrencyConverter {

//     double[] exchangeRates = {63, 3, 3, 595,18,107,2};   
    
       
    
//     void printCurrencies() {
    
//         System.out.println("rupee: " + exchangeRates[0]);
    
//         System.out.println("dirham: " + exchangeRates[1]);

//         System.out.println("real: " + exchangeRates[2]);

//         System.out.println("chilean_peso: " + exchangeRates[3]);

//         System.out.println("mexican_peso: " + exchangeRates[4]);

//         System.out.println("_yen: " + exchangeRates[5]);

//         System.out.println("$australian: " + exchangeRates[6]);

//         System.out.println("Length: " + exchangeRates.length);


//     }
// }

	




public class CurrencyConverter {   

    // Currency exchange rates of different currencies relative to 1 US dollar

   double[] exchangeRates = new double[] {63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};



   void setExchangeRates(double[] rates) {

         exchangeRates = rates;

    }

    void updateExchangeRate(int countryIndex, double newVal) {

         exchangeRates[countryIndex] = newVal;

    }



    double getExchangeRate(int countryIndex) {

        return exchangeRates[countryIndex];

    }

    double computeTransferAmount(int countryIndex, double amount) {

        return amount * getExchangeRate(countryIndex);

    }



    void printCurrencies() {

         System.out.println("\nrupee: " + exchangeRates[0]);

         System.out.println("dirham: " + exchangeRates[1]);

         System.out.println("real: " + exchangeRates[2]);

         System.out.println("chilean_peso: " + exchangeRates[3]);

         System.out.println("mexican_peso: " + exchangeRates[4]);

         System.out.println("_yen: " + exchangeRates[5]);

         System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);

   }

   

}