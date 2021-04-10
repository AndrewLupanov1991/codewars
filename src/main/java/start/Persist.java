package start;

class Persist {
    public static Long spliter2(Long number) {
        if (number < 10) {
            return number;
        }
        long betweenResult,

                result = number;

        while (result > 9) {
            betweenResult = result;
            result = 1L;
            while (betweenResult > 0) {
                result = betweenResult % 10 * result;
                betweenResult = betweenResult / 10;
            }
        }
        return result;
    }
}