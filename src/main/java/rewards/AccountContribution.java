package rewards;

import common.money.MonetaryAmount;

/**
 * A summary of a momentary contribution made to an account.
 *
 * <p>A value object. Immutable.
 */
public class AccountContribution {

    private final String accountNumber;

    private final MonetaryAmount amount;

    /**
     * Creates a new account contribution.
     *
     * @param accountNumber the number of the account the contribution was made
     * @param amount the total contribution amount
     */
    public AccountContribution(String accountNumber, MonetaryAmount amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    /**
     * Returns the number of the account this contribution was made to.
     *
     * @return the account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns the total amount of the contribution.
     *
     * @return the contribution amount
     */
    public MonetaryAmount getAmount() {
        return amount;
    }
}
