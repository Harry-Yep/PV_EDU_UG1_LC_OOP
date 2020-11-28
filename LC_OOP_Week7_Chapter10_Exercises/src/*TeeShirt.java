public class TeeShirt
{
   private int orderNumber;
   private String size;
   private String color;
   private double price;
   public void setOrderNumber(int num)
   {
      orderNumber = num;
   }
   public void setSize(String sz)
   {
      size = sz;
      if(size == "XXL" || size == "XXXL")
         price = 22.99;
      else
         price = 19.99;
   }
   public void setColor(String color)
   {
       this.color = color;
   }
   public int getOrderNumber()
   {
      return orderNumber;
   }
   public String getSize()
   {
      return size;
   }
   public String getColor()
   {
      return color;
   }
   public double getPrice()
   {
      return price;
   }
}
