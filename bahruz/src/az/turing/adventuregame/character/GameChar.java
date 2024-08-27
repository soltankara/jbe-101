package az.turing.adventuregame.character;

public class GameChar {

    private Integer charId;

    private String name;
    private Integer damage;
    private Integer money;
    private Integer health;

    public GameChar(Integer charId, String name, Integer damage, Integer money, Integer health) {
        this.charId = charId;
        this.name = name;
        this.damage = damage;
        this.money = money;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCharId() {
        return charId;
    }

    public void setCharId(Integer charId) {
        this.charId = charId;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealty(Integer health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "CharacterId: " + charId + "  Name: " + name + "  Damage: " + damage + "  Money: " + money + "  Healty: " + health;
    }
}
