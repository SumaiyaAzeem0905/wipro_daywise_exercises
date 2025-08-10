package Exceptions;

public class MonthChecker {
	public static void checkMonth(int month) throws InvalidMonthExceptionEx1 {
        if (month < 1 || month > 12) {
            throw new InvalidMonthExceptionEx1("Invalid month: " + month);
        }
        System.out.println("Valid month: " + month);
    }

    public static void main(String[] args) {
        try {
            checkMonth(15); // Change to test
        } catch (InvalidMonthExceptionEx1 e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
