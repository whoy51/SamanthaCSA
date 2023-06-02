import java.util.ArrayList;

public class Shopper{
    private String name;
    public Shopper (String n){
        this.name = n;
    }
    public String getName(){
        return this.name;
    }

    /**
     * @param d dairy item user wants to put in their cart
     * @return string that verifies what user has put in their cart
     * returns "no items have been added" if user doesn't add anything
     */
    public static String getDairyItem(String d){
        for (String i: ListHelper.dairyAisle()){
            if (d.toLowerCase().contains(i.toLowerCase()) && i.contains("s")){
            return (d + " have been added to your cart.");
            }
             if (d.toLowerCase().contains(i.toLowerCase())){
                return (d + " has been added to your cart.");
            }
        }
        return "No items have been added";
    }
    /**
     * @param v veggie item user wants to put in their cart
     * @return string that verifies what user has put in their cart
     * returns "no items have been added" if user doesn't add anything
     */
    public static String getVeggieItem(String v){
        for (String i: ListHelper.veggieAisle()){
            if (v.toLowerCase().contains(i.toLowerCase()) && i.contains("s")){
                return (v + " have been added to your cart.");
            }
            if (v.toLowerCase().contains(i.toLowerCase())){
                return (v + " has been added to your cart.");
            }
        }
        return "No items have been added";
    }

    public static String getProteinItem(String p){
        for (String i : ListHelper.proteinAisle()){
            if ((p.toLowerCase().contains(i.toLowerCase())) && i.contains("s")){
                return (p + " have been added to your cart.");
            }
            if (p.toLowerCase().contains(i.toLowerCase())){
                return (p + " has been added to your cart.");
            }
        }
        return "No items have been added";
    }

    public static String getGrainItem(String g){
        for (String i : ListHelper.grainAisle()){
            if (g.toLowerCase().contains(i.toLowerCase()) && i.contains("s")){
                return (g + " have been added to your cart.");
            }
            if (g.toLowerCase().contains(i.toLowerCase())){
                return (g + " has been added to your cart.");
            }
        }
        return "No items have been added";
    }
    public static String getSeasoningItem(String s){
        for (String i : ListHelper.seasoningAisle()){
            if (s.toLowerCase().contains(i.toLowerCase()) && i.contains("s")){
                return (s + " have been added to your cart.");
            }
            if (s.toLowerCase().contains(i.toLowerCase())){
                return (s + " has been added to your cart.");
            }
        }
        return "No items have been added";
    }
}
