package code;

public class Order {
    public static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }

       StringBuilder sb = new StringBuilder(words);
       StringBuilder result = new StringBuilder(" ");
       String[] array = words.split(" ");
       int number = 1;
       int length = array.length - 1;
       int resLength = 0;
       while (resLength< length) {
           for (int i = 0; i < array.length;i++) {
               if (array[i].contains(Integer.toString(number))) {
                   result.append(array[i]);
                   result.append(" ");
                   number++;
                   resLength++;
               }
           }
       }

       return result.toString().trim();


    }
}
