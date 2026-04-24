package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import rewards.RewardNetwork;
import rewards.internal.RewardNetworkImpl;
import rewards.internal.account.AccountRepository;
import rewards.internal.account.JdbcAccountRepository;
import rewards.internal.restaurant.JdbcRestaurantRepository;
import rewards.internal.restaurant.RestaurantRepository;
import rewards.internal.reward.JdbcRewardRepository;
import rewards.internal.reward.RewardRepository;

import javax.sql.DataSource;

@ComponentScan("rewards.internal")
public class RewardsConfig {

    private final DataSource dataSource;

    public RewardsConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public RewardNetwork rewardNetwork() {
        return new RewardNetworkImpl(accountRepository(), restaurantRepository(), rewardRepository());
    }

    public AccountRepository accountRepository() {
        JdbcAccountRepository accountRepository = new JdbcAccountRepository();
        accountRepository.setDataSource(dataSource);
        return accountRepository;
    }

    public RestaurantRepository restaurantRepository() {
        return new JdbcRestaurantRepository(dataSource);
    }

    public RewardRepository rewardRepository() {
        JdbcRewardRepository rewardRepository = new JdbcRewardRepository();
        rewardRepository.setDataSource(dataSource);
        return rewardRepository;
    }
}
