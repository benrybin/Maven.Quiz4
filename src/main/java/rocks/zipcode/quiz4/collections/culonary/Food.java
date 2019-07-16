package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {
    List<Spice> temp;
    Food test;
    public List<Spice> getAllSpices() {



        return temp;
    }

    public <SpiceType extends Class<? extends Spice>> Map<SpiceType, Integer> getSpiceCount() {
        Map<SpiceType, Integer> test = new HashMap<>();

        Integer curryCount =0;
        Integer gingerCount =0;
        Integer pepperCount=0;

        for (Spice spice: this.getAllSpices()) {

            if(spice.equals(Curry.class)){

                curryCount++;

            }
            else if(spice.equals(Pepper.class)){
                pepperCount++;

            }else if(spice.equals(Curry.class)){
                pepperCount++;

            }

        }
        //test.put((Spice) new Curry(),curryCount);
        //test.put(new Spice,pepperCount);
        //test.put(new Spice,gingerCount);




        return test;
    }

    public void applySpice(Spice spice) {
        temp.add(spice);

    }
}
