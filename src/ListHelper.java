import java.util.ArrayList;
import java.util.Collections;

//all lists used in program
public class ListHelper {
    /**
     * creates list of events user is shopping for
     * @return random event from list
     */
    public static String randomEvent() {
        ArrayList<String> events = new ArrayList<>();
        events.add("birthday Party");
        events.add("family Dinner");
        events.add("neighborhood fiesta");
        events.add("potluck");
        events.add("friendsgiving");
        events.add("thanksgiving");
        events.add("fourth of July Dinner");
        events.add("graduation Party");
        events.add("Mothers Day");
        events.add("Fathers Day");
        int lastIndx = events.size();
        return (events.get((int) (Math.random() * lastIndx)));

    }

    /**
     * creates list of main dishes user is shopping for
     * @return random main dish from list
     */
    public static String mainDish() {
        ArrayList<String> mains = new ArrayList<>();
        mains.add("Steak and roasted veggies");
        mains.add("Lasagna");
        mains.add("Tacos");
        mains.add("Spaghetti and Meatballs");
        mains.add("fajitas");
        mains.add("sushi bowl");
        mains.add("chicken pot pie");
        mains.add("Chilli");
        mains.add("Shepard's Pie");
        Collections.shuffle(mains);
        int lastIndx = mains.size();
        return (mains.get((int) (Math.random() * lastIndx)));
    }


    /**
     * creates a list of random dairy items user can put in their cart
     * @return arraylist of dairy items
     */
    public static ArrayList<String> dairyAisle(){
        ArrayList<String> dairy = new ArrayList<>();
        dairy.add("Milk");
        dairy.add("eggs");
        dairy.add("butter");
        dairy.add("cheese");
        return dairy;
    }

    /**
     * creates a list of random vegetables user can put in their cart
     * @return arraylist of veggies
     */
    public static ArrayList<String> veggieAisle(){
        ArrayList<String> veggie = new ArrayList<>();
        veggie.add("lettuce");
        veggie.add("cucumbers");
        veggie.add("tomatoes");
        veggie.add("carrots");
        veggie.add("peas");
        veggie.add("peppers");
        return veggie;
    }

    /**
     * creates a list of random vegetables user can put in their cart
     * @return arraylist of proteins
     */

    public static ArrayList<String> proteinAisle(){
        ArrayList<String> protein = new ArrayList<>();
        protein.add("Steak");
        protein.add("Salmon");
        protein.add("beans");
        protein.add("tofu");
        protein.add("ground turkey");
        protein.add("chicken");
        return protein;
    }
    /**
     * creates a list of random vegetables user can put in their cart
     * @return arraylist of grains
     */
    public static ArrayList<String> grainAisle(){
        ArrayList<String> grain = new ArrayList<>();
        grain.add("pasta");
        grain.add("bread");
        grain.add("rice");
        grain.add("potatoes");
        grain.add("tortillas");
        return grain;
    }

    /**
     * creates a list of random vegetables user can put in their cart
     * @return arraylist of seasoning
     */

    public static ArrayList<String> seasoningAisle(){
        ArrayList<String> seasoning = new ArrayList<>();
        seasoning.add("salt");
        seasoning.add("onions");
        seasoning.add("garlic");
        seasoning.add("paprika");
        seasoning.add("basil");
        return seasoning;
    }
}