import java.text.NumberFormat;

public class FormattingNumbers {

    public static void main (String[] agrs){
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();  //NumberFormat is a abstract it cannot be instansiated (we cannot use new keyword)
        String result =  currency.format( 1234567.891);
        System.out.println(result);
        
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2);

        //simple waay without obj, and using method chaining
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result3);

    }
}
