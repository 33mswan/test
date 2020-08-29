// Name : Michael Swanson
// Class : CIST 1400-502
// Colleagues : N/a
// Resources : N/a



public class GroceryList {
   private int count;
   private Item[] list;
   public static final int MAX = 30;

   public GroceryList() {
      this.list = new Item[MAX];
      for (int i = 0; i < MAX; i++)
      {
         this.list[i] = new Item();
      }
      this.count = 0;
   }
   public GroceryList(Item[] source)
   {
      this.list = new Item[MAX];
      for (int i = 0; i < MAX; i++)
      {
         this.list[i] = new Item();
      }
      this.count = 0;
      for (int a = 0; a < source.length; a++)
      {
         list[a] = source[a];
         if (list[a] != null && !this.list[a].getItem().equals("none"))
         {            
            this.count++;
         }
         else
         {
            this.list[a] = new Item();
         }
      } 
   }
   public int getCount() {
      return this.count;
   }
   public void addItem(Item m) {
      for (int i = 0; i < MAX; i++)
      {
         if (this.list[i].getItem().equals("none"))
         {   
            this.list[i] = m;
            this.count++;
            break;
         }
      }    
   }
   public void deleteItem(int p) {
      for (int i = 1; i <= MAX; i++)
      {
         if (p == i && !list[p - 1].getItem().equals("none"))
         {
            Item m = list[i - 1];
            for (i = p; i < MAX; i++)
            {
               if (i <= 29)
               {
                  this.list[i - 1] = this.list[i]; 
               }
            } 
            this.list[29] = new Item();
            count--;
         }
      }
   }
   public Item[] sortName() {
      int smallest;
      Item[] copylist = new Item[30];
      for (int copy = 0; copy < MAX; copy++)
      {
         copylist[copy] = list[copy];
      }   
      if (this.count > 0)
      {
         for (int i = 0; i < MAX; i++)
         {
            smallest = i;
            for (int a = i + 1; a < MAX; a++)
            {              
               String first = copylist[a].getItem();
               String sec =  copylist[smallest].getItem();
               if (first.compareTo(sec) < 0 && !copylist[a].getItem().equals("none"))
               {
                  Item temp = copylist[a];
                  copylist[a] = copylist[smallest];
                  copylist[smallest] = temp;
               }
            }
         }        
      }
      return copylist;
   }
   public Item getItem(int pos) {
      Item result = null;
      if (pos >= 1 && pos <= count)
      {
         result = this.list[pos - 1];
      }
      return result;
   }
   public Item[] sortQuant() {
      int smallest;
      Item[] copylist = new Item[30];
      for (int copy = 0; copy < MAX; copy++)
      {
         copylist[copy] = list[copy];
      }   
      if (this.count > 0)
      {
         for (int pos = 0; pos < MAX - 1; pos++)
         {          
            smallest = pos;            
            for (int a = pos + 1; a < MAX; a++)
            {
               if (copylist[a].getQuantity() > copylist[pos].getQuantity() 
                  && !copylist[a].getItem().equals("none"))
               {
                  smallest = a;
                  Item temp = copylist[pos];
                  copylist[pos] = copylist[smallest];
                  copylist[smallest] = temp;
               }
                   
            }
         }   
      }
      return copylist;
   }
   @Override
   public String toString() {
      String result = "";
      int i = 1;
      if (count > 0)
      {       
         while (i <= count)
         {  
            for (int a = 0; a < MAX; a++) 
            {       
               String b = this.list[a].getItem();
               if (!b.equals("none"))
               {   
                  result = String.format(result + i + ". " + this.list[a].toString() + "\n");           
                  i++;
               }
            }            
         }         
      }
      return result;
   }
   @Override
   public boolean equals(Object other) {
      boolean result = true;
      if (other instanceof GroceryList)
      {
         GroceryList o = (GroceryList) other;
         if (this.getCount() == o.getCount())
         {
            Item[] sortt = this.sortName();
            Item[] sorto = o.sortName();         
            for (int i = 0; i < this.getCount(); i++)
            {
               if (!sortt[i].getItem().equals(sorto[i].getItem()))
               {
                  result = false;
               }
            }
         }
         else
         {
            result = false;
         }
      }
      return result;
   }
}