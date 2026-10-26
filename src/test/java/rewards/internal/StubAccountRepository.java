package rewards.internal;

import rewards.internal.account.Account;
import rewards.internal.account.AccountRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * A dummy account repository implementation. Has a single Account associated with credit card
 * "1234123412341234".
 *
 * <p>Stubs facilitate unit testing. An object needing an AccountRepository can work with this stub
 * and not have to bring in expensive and/or complex dependencies such as a Database. Simple unit
 * tests can then verify object behavior by considering the state of this stub.
 */
public class StubAccountRepository implements AccountRepository {

    private final Map<String, Account> accountsByCreditCard = new HashMap<>();

    public StubAccountRepository() {
        var account = new Account("123456789");
        accountsByCreditCard.put("1234123412341234", account);
    }

    @Override
    public Account findByCreditCard(String creditCardNumber) {
        var account = accountsByCreditCard.get(creditCardNumber);
        if (account == null) {
            throw new RuntimeException(
                    "no account has been found for credit card number " + creditCardNumber);
        }

        return account;
    }
}
