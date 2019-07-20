package pl.sda;

import pl.sda.controller.GiantController;
import pl.sda.model.Fatigue;
import pl.sda.model.GiantModel;
import pl.sda.model.Health;
import pl.sda.model.Nourishment;
import pl.sda.view.GiantView;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GiantModel giantModel = new GiantModel(Health.HEALTHY, Fatigue.NOTIRED, Nourishment.NOURISHED);
        GiantView giantView = new GiantView();
        GiantController giantController = new GiantController(giantModel, giantView);

        System.out.println(giantController.getHealth());
        //System.out.println( "Hello World!" );
    }
}
