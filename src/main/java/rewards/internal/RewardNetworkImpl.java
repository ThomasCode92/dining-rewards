package rewards.internal;

import rewards.Dining;
import rewards.RewardConfirmation;
import rewards.RewardNetwork;
import rewards.internal.account.AccountRepository;

import java.util.Random;

/**
 * Rewards an Account for Dining at a Restaurant.
 *
 * <p>The sole Reward Network implementation. This object is an application-layer service
 * responsible for coordinating with the domain-layer to carry out the process of rewarding benefits
 * to accounts for dining.
 *
 * <p>Said in other words, this class implements the "reward account for dining" use case.
 */
public class RewardNetworkImpl implements RewardNetwork {

    private final AccountRepository accountRepository;

    private final Random random = new Random();

    /**
     * Creates a new reward network.
     *
     * @param accountRepository the repository for loading accounts to reward
     */
    public RewardNetworkImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public RewardConfirmation rewardAccountFor(Dining dining) {
        var account = this.accountRepository.findByCreditCard(dining.getCreditCardNumber());
        var contribution = account.makeContribution(dining.getAmount());

        return new RewardConfirmation(random.toString(), contribution);
    }
}
