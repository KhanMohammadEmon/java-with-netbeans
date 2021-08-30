public class Q3 {

}
class Iteam{
    String name ;
    double price ;
    public double getPrice()
    {
        return price;
    }
}
class Shop
{
    public static void main(String[] args) {
        Iteam[] items = new Iteam[5];
        items[0]= new DiscountedIteam("Laptop",5000.50,5);
        items[1]= new DiscountedIteam("Mouse",450.50,5);
        items[2]= new DiscountedIteam("keybroard",600,10);
        items[3]= new DiscountedIteam("Mobile",6000,10);
        items[4]= new DiscountedIteam("HeadPhone",700,10);

        double total_sel_value = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].name+" "+items[i].getPrice());
            total_sel_value = total_sel_value+items[i].getPrice();
        }
        System.out.println(total_sel_value);
    }
}
class DiscountedIteam extends Iteam {
    double discount;
    DiscountedIteam(String name, double price,double discount)
    {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
      double newprice = price * (discount/100);
      return (price-newprice);
    }
}