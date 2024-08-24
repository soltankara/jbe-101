package session11W3resourceOOP;

public class Restaurant {
    private String[] itemsOfMenu;
    private double[] prices;
    private double[] ratings;
    private int countOfItem;
    private int countOfRating;

    public Restaurant(int maxCountOfItem, int maxCountOfRating) {
        this.countOfItem = 0;
        this.countOfRating = 0;
        this.ratings = new double[maxCountOfRating];
        this.prices = new double[maxCountOfItem];
        this.itemsOfMenu = new String[maxCountOfItem];

    }
    public void addItem(String item, double price) {
        if (countOfItem < itemsOfMenu.length) {
            itemsOfMenu[countOfItem] = item;
            prices[countOfItem] = price;
            countOfItem++;
        } else {
            System.out.println("there is not enough place ");
        }
    }
    public void removeItem(String item) {
        boolean found = false;
        for (int i = 0; i < countOfItem; i++) {
            if (itemsOfMenu[i].equals(item)) {
                found = true;
                itemsOfMenu[i] = itemsOfMenu[countOfItem - 1];
                prices[i] = prices[countOfItem - 1];
                itemsOfMenu[countOfItem - 1] = null;
                prices[countOfItem - 1] = 0;
                countOfItem--;
                break;
            }
        }
        if (!found) {
            System.out.println("Item was not found");
        }
    }
    public void addRating(double rating) {
        if (countOfRating < ratings.length) {
            ratings[countOfRating] = rating;
            countOfRating++;
        } else {
            System.out.println("there is not enough place ");
        }
    }
    public double calculateAverageRating() {
        double total = 0;
        for (int i = 0; i < countOfRating; i++) {
            total += ratings[i];
        }
        return countOfRating > 0 ? total / countOfRating : 0;
    }
    public void showMenu() {
        System.out.println("Menu :");
        for (int i = 0; i < countOfItem; i++) {
            System.out.println(itemsOfMenu[i] + ": $" + prices[i]);
        }
    }
    public void showRatings() {
        System.out.println("Ratings :");
        for (int i = 0; i < countOfRating; i++) {
            System.out.println(ratings[i]);
        }
    }
}

