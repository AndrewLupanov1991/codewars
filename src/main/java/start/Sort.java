package start;

public class Sort {
    public  int[]sort (int[] array) {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            int buf = 0;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i -1]) {
                    isSorted = false;
                    buf = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buf;
                }
            }
        }
        return array;
    }


    public int sum (int[] mas) {
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        return sum;
    }


   /* public String swap(String s) {
        char[] chars = s.toCharArray();
        char[] result = new char[chars.length];

       for (char c : chars) {
           result[c] = chars[c];
       }
       String string = String.valueOf(result);
        return string;

    }*/
   public int[] change (int[] mas) {
       int[] result = new int[mas.length];
       for (int i = mas.length - 1; i >= 0; i--) {
           result[mas.length - 1 - i] = mas[i];


       }
       return result;
   }





}
