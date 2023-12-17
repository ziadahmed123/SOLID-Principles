public class travel_plane implements  plane {
    @Override
    public void fly() {
        System.out.println("flying");

    }

    @Override
    public void Acrobatic_movements() {
        System.out.println("***/*/*/*/*/**/*/*");

    }

    @Override
    public void launch_rockets() {
        System.out.println("---------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
    /* in that case I forced the plane to implement these 3 function .
    I don't need them all I just need one so Interface segregation help us to make code more
    flexible and maintainable
     */
}
