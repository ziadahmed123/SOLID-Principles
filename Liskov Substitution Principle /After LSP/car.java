public class car extends vehicle {
    @Override
    public void run() {
        super.run();
        System.out.println("in this case the vehicle is 'car' ");

    }

        /* in that case is car can fly !?
        sure it is not so lsp didn't apply in that case because we can't replace car with vehicle
        so the solution for that case to make vehicle with only on function (run) and make sub class
        from the vehicle for the classes that have the ability to fly
         */

    }

