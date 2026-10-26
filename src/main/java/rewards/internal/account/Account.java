package rewards.internal.account;

import common.money.MonetaryAmount;

import rewards.AccountContribution;

/** An account for a member of the reward network. */
public class Account {

    private final String number;

    /**
     * Create a new account.
     *
     * @param number the account number
     */
    public Account(String number) {
        this.number = number;
    }

    /** Returns the number used to uniquely identify this account. */
    public String getNumber() {
        return number;
    }

    /** Make a monetary contribution to this account. */
    public AccountContribution makeContribution(MonetaryAmount amount) {
        return new AccountContribution(getNumber(), amount);
    }
}
