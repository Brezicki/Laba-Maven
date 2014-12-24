package ordericecream;
abstract class IceCream {  
 /*3.	Фабрика производит мороженное "Чудо-буренка" для продажи на территории
    РБ, и мороженное "Белорусские узоры" для продажи на территории РФ.
    В проекте присутствует класс, который генерирует количество заказов.
    
    
7.	Программа создает сюжетных персонажей, с которыми сражается герой,
    в зависимости от уровня сложности. Три уровня сложности: легкий, средний,
    сложный. Виды персонажей: монстры, зомби, солдаты. В зависимости от уровня
    сложности персонажи имеют разные сопротивляемость, навыки и т.д. В проекте
    присутствует класс, который генерирует, какое число персонажей каждого
    вида будет создано. 
*/
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