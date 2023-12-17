public class plane extends vehicle {
    @Override
    public void run() {
        super.run();
        System.out.println("on this case the vehicle is plane ");

    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("in this case the vehicle is plane");
        /*here we apply it because we can replace plane with vehicle as it can run before
        it going to fly
         */
    }
}
