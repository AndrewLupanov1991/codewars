package alishev.regExpression;

public class RegExpression {
    public static void main(String[] args) {
        /*

        \\w = 1 буква
        \\d = одна цифра
        + = 1 и более
        * = 0 и более
        ?= может быть или нет до строки
        (-|\\+) = как или
        [a-zA-Z] = все буквы
        [0-9] = все цифры
        [^..] = отрицание, все кроме того,что в скобках
        . = любой символ
        {2} = 2 символа дл \\d{2}
        {2, } = 2 иили более символа \\d{2, }
        {2,4} = от 2 до 4 символа \\d{2, 4}



         */

        String s= "+12222";
        String b = "123";
        String q = "+123";

        //System.out.println(s.matches("(-|\\+)?\\d*"));

        String string = "f122";
        System.out.println(string.matches("[a-zA-Z42]+\\d{3}"));

        String string1 = "10111111";
       // System.out.println(string1.matches("[^2-9a-zA-Z(+|\\-)]{1,}"));

        String url = "http://www.google.com";
        String url2 = "http://www.dgfdgd.ru";
      //  System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
       // System.out.println(f.matches("\\d{3}"));

        String email = "gdgd@gmail.com";

        System.out.println(email.matches("\\w+@(mail|gmail)\\.(ru|com)"));

    }
}
