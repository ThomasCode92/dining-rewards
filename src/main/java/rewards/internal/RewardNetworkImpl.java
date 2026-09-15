package rewards.internal;

import rewards.AccountContribution;
import rewards.Dining;
import rewards.RewardConfirmation;
import rewards.RewardNetwork;

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

    private final Random random = new Random();

    @Override
    public RewardConfirmation rewardAccountFor(Dining dining) {
        AccountContribution contribution = new AccountContribution();

        return new RewardConfirmation(random.toString(), contribution);
    }
}
