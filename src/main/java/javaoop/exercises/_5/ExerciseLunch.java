package javaoop.exercises._5;

public class ExerciseLunch {
    private Double price = null;
    private String nameOfDayEaten = null;

    private static final double MAX_PRICE = 5;

     ExerciseLunch(Double price, String nameOfDayEaten){
        this.price = price;
        this.nameOfDayEaten = nameOfDayEaten;
    }

    public static void printMaxPrice(){
        System.out.println(MAX_PRICE);
    }

    private void printLunch() {
        System.out.println(
                "ExerciseLunch{" +
                        "price=" + price +
                        ", nameOfDayEaten='" + nameOfDayEaten + '\'' +
                        '}'
        );
    }
}
