// Name : Michael Swanson
// Class :  CIST 1400-502
// Colleagues : N/a
// Resources : N/a


public class Item {
   private String item;
   private int quantity;
   public static final int MIN = 1;
   public static final int MAX = 20;
   
   public Item() {
      this.item = "none";
      this.quantity = MIN;
   }
   public Item(String i, int q) {
      if (i.length() > 0)
      {
         this.item = i;
      }
      else 
      {
         this.item = "none";
      }
      if (q >= MIN && q <= MAX) 
      {
         this.quantity = q;
      }
      else 
      {
         this.quantity = 1;
      }
   }
   public String getItem() {
      return item;
   }
   public int getQuantity() {
      return quantity;
   }
   public int increaseQuant() {
      if (this.quantity < 20)
      {
         this.quantity++;
      }
      else
      {
         this.quantity = this.quantity; 
      }
      return this.quantity;
   }
   public void setItem(String i) {
      if (i.length() > 0) 
      {
         this.item = i;
      }
      else 
      {
         this.item = item;
      }
   }
   public void setQuantity(int q) {
      if (q >= MIN && q <= MAX)
      {
         this.quantity = q;
      }
      else
      {
         this.quantity = quantity;
      }
   }
   @Override
   public String toString() {
      String result;
      result = String.format(this.getItem() + " : " + this.getQuantity());
      return result;
   }
   @Override
   public boolean equals(Object other) {
      boolean result = false;
      if (other instanceof Item)
      {
         Item o = (Item) other;
         if (this.getItem().equalsIgnoreCase(o.getItem())
            && this.getQuantity() == o.getQuantity())
         {
            result = true;
         }
      }
      return result;
   }
}