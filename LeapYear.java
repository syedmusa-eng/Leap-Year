public class LeapYear {

    //Creating a method
    public static boolean isLeapYear(int year) {

        boolean value = false;

        if (year < 1 && year > 9999) {
            value = false;
        } else if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {

                if (year % 100 == 0) {

                    if (year % 400 == 0) {
                        value = true;
                    } else {
                        value = false;
                    }

                } else {
                    value = true;
                }

            } else {
                value = false;
            }

        }

        return value;
    }
}
