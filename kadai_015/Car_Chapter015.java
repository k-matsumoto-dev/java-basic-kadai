package kadai_015;

public class Car_Chapter015 {
    private int gear    = 1;
    private int speed   = 10;

    public void gearChange(int afterGear) {
        this.gear = afterGear;
        this.speed = switch(afterGear) {
            case 1 -> 10;
            case 2 -> 20;
            case 3 -> 30;
            case 4 -> 40;
            case 5 -> 50;
            default -> 10;
        };
    }

    public void run() {
        System.out.println("ギアチェンジ後の速度：時速" + this.speed + "km");
    }
}
