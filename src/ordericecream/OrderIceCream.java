package ordericecream;
public class OrderIceCream {

    public static void main(String[] args) {
       IceCreamStore nyStore=new IceCreamStore();        
        IceCream icecream = nyStore.orderIceCream("Belarus");
        System.out.println("The name of the ice cream is "+icecream.getName());
        System.out.println("For sale in "+icecream.getCountry());
        System.out.println("Number of "+icecream.getNumber());
        System.out.println("------------------------------------------------ ");
        icecream = nyStore.orderIceCream("Russia");
        System.out.println("The name of the ice cream is "+icecream.getName());
        System.out.println("For sale in "+icecream.getCountry());
        System.out.println("Number of "+icecream.getNumber());
    }
    
}




