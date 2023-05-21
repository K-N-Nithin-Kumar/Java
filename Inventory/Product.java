public class Product{
    private String name;
    private String type;
    private String place;
    private int Warranty;

   public Product(){
    
   }
   public Product(String name , String type , String place , int Warranty){
     this.name = name;
     this.type = type;
     this.place = place;
     this.Warranty = Warranty;
   }
   public String getName() {
       return name;
   }
   public String getType() {
       return type;
   }
   public String getPlace() {
       return place;
   }
   public int getWarranty() {
       return Warranty;
   }

   public void setName(String name) {
       this.name = name;
   }
   public void setType(String type) {
       this.type = type;
   }
   public void setWarranty(int warranty) {
       Warranty = warranty;
   }
   public void setPlace(String place) {
       this.place = place;
   }
   @Override
   public String toString() {
       // TODO Auto-generated method stub
       return "Product{" + 
       "name=' "+ name + '\''+
       ",type=' "+ type + '\''+
       ",place=' "+ place + '\''+
       ",Warranty=' "+ Warranty + '\''+
       '}';
   }
   
}
