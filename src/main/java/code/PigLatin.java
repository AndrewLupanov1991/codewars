package code;


public class PigLatin {
    public static String pigIt(String str) {
        if (str.isEmpty()) {
            return null;
        }
        String[] input = str.split(" ");
        StringBuilder sb = new StringBuilder("");
        String s = "!";

        for (int i =0; i<input.length;i++) {
            StringBuilder buf  = new StringBuilder(input[i]);
            if (buf.toString().equals(s) || buf.toString().equals("?") ) {
                sb.append(buf.toString());
                sb.append(" ");
                continue;
            }

            sb.append(buf.substring(1,buf.length()));
            sb.append(buf.charAt(0));
            sb.append("ay");
            sb.append(" ");

        }
        return sb.toString().trim();
    }
}
