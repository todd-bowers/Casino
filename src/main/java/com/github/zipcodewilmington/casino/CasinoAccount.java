package com.github.zipcodewilmington.casino;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccount` is registered for each user of the `Arcade`.
 * The `ArcadeAccount` is used to log into the system to select a `Game` to play.
 */
public class CasinoAccount {
    private Integer money;
    private String accountName;
    private String accountPassword;

    public CasinoAccount (String accountName, String accountPassword, Integer money) {
        this.accountName = accountName;
        this.accountPassword = accountPassword;
        this.money = money;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public int getMoney () {
        return money;
    }

}
