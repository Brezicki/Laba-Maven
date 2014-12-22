/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordericecream;

abstract class IceCream {

    String name;
    String country;
    int number;
    public String getName() {
        return name;
    }
    public String getCountry()
    {
        return country;
    }
    public int getNumber()
    {
    return number;
    }
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Blending the mixture...");
        System.out.println("Cooling...");
        System.out.println("Packaging and bundling the finished product...");
        
    }
}
class MiracleBurenka extends IceCream {

    public MiracleBurenka() {
        name = "Miracle Burenka";  
        country = "Belarus";
        number= (int) (Math.random()*100 + 10);
    }
}
class BelarusianDesigns extends IceCream {

    public BelarusianDesigns() {
        name = "Belarusian designs";
        country = "Russia";
        number= (int) (Math.random()*100 + 10);
    }

}
class IceCreamStore {
    public IceCream orderIceCream (String type) {
        IceCream icecream;        
        icecream = createIceCream(type);        
        icecream.prepare();                 
        return icecream;
    }
    protected IceCream createIceCream (String type){
        if (type.equals("Belarus")) { 
            return new MiracleBurenka();
        } else if (type.equals("Russia")) {
            return new BelarusianDesigns();
        } else return null;
}
}