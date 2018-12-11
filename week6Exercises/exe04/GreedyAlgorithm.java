package week6Exercises.exe04;

import java.util.ArrayList;
import java.util.List;

public class GreedyAlgorithm {

    List<Money> changes=new ArrayList<>();

    public List<Money> change(Integer amount) {
        List<Money> coins=Coins.getCoins();
        for (Money coin : coins) {
            if(coin.applicable(amount)){
                Integer times=amount/coin.getCent();
                getAddMoney(coin, times);
            }
            amount=amount%coin.getCent();
        }
        return changes;
    }

    private void getAddMoney(Money coin, Integer times) {
        for (int time = 0; time < times; time++) {

            changes.add(coin);
        }

    }

}
