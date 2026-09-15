package rewards.internal;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rewards.AccountContribution;
import rewards.Dining;
import rewards.RewardNetwork;

/**
 * Unit tests for the RewardNetworkImpl application logic.
 *
 * <p>Besides helping catch bugs early, tests are a great way for a new developer to learn an API as
 * he or she can see the API in action. Tests also help validate a design as they are a measure for
 * how easy it is to use your code.
 */
public class RewardNetworkImplTests {

    private RewardNetwork rewardNetwork;

    @BeforeEach
    void setUp() {
        rewardNetwork = new RewardNetworkImpl();
    }

    @Test
    void testRewardAccountFor() {
        // create a new dining of 100.00 charged to credit card '1234123412341234' by merchant
        // '123457890' as test input
        Dining dining = Dining.createDining("100.00", "1234123412341234", "1234567890");

        // call the 'rewardNetwork' to test its rewardAccountFor(Dining) method
        var confirmation = rewardNetwork.rewardAccountFor(dining);

        // assert the expected reward confirmation results
        assertNotNull(confirmation);
        assertNotNull(confirmation.getConfirmationNumber());

        // assert an account contribution was made
        AccountContribution contribution = confirmation.getAccountContribution();
        assertNotNull(contribution);
    }
}
