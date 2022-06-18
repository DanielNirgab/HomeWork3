package lesson3.Task4;

public class VodkaHouse {
  private static int countOfItem;

    public static int getCountOfItem() {
        return countOfItem;
    }

    public static void setCountOfItem(int countOfItem) {
        VodkaHouse.countOfItem = countOfItem;
    }

    public VodkaHouse(int countOfItem) {
        VodkaHouse.countOfItem = countOfItem;
    }

    public static boolean issueItem (int count) {
        System.out.println("На складе " + getCountOfItem() + " водки");
        if (getCountOfItem() > 0 && count <= getCountOfItem()) {
            countOfItem = getCountOfItem() - count;
            System.out.println("На складе осталось: " + getCountOfItem() + " Водки");
            return true;
        } else if (countOfItem < count && countOfItem != 0) {
            System.out.println("На складе не хватает водки, осталось " + getCountOfItem());
            return false;
        } else {
            System.out.println("Склад пуст");
            return false;
        }
    }
}
