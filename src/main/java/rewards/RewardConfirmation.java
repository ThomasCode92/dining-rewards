package rewards;

import static java.util.Objects.requireNonNullElse;

import org.jspecify.annotations.NonNull;

/**
 * A summary of a confirmed reward transaction describing a contribution made to an account that was
 * distributed among the account's beneficiaries.
 *
 * @param confirmationNumber the unique confirmation number
 * @param accountContribution the account contribution (the details of this reward)
 */
public record RewardConfirmation(
        String confirmationNumber, AccountContribution accountContribution) {

    @Override
    public @NonNull String toString() {
        return requireNonNullElse(confirmationNumber, "");
    }
}
