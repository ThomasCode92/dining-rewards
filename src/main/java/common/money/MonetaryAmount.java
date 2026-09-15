package common.money;

import java.math.BigDecimal;

public class MonetaryAmount {

    private final BigDecimal value;

    private MonetaryAmount(BigDecimal value) {
        this.value = value;
    }

    /**
     * Convert the string representation of a monetary amount (e.g., $5 or 5) to a MonetaryAmount
     * object.
     *
     * @param string the monetary amount string
     * @return the monetary amount object
     */
    public static MonetaryAmount valueOf(String string) {
        if (string == null || string.isEmpty()) {
            throw new IllegalArgumentException("The monetary amount value is required");
        }
        if (string.startsWith("$")) {
            int index = string.indexOf('$');
            string = string.substring(index + 1);
        }

        return new MonetaryAmount(new BigDecimal(string));
    }

    @Override
    public String toString() {
        return "$" + value.toString();
    }
}
