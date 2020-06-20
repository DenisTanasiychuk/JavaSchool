package HomeTask2.HT_2_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String strings = "ПервоеСлово ВтороеСлово ТретьСлово JAVA";

        List<String> listOfStrings = Arrays.asList( strings.split(" "));

       listOfStrings.forEach(System.out::println);


    }
}
