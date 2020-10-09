
/**Yasmine Pourarian
 * CS 111-002
 * Assignment 1
**/
	import java.util.Scanner;
	public class Product {

	        private String Name;
	        private String listprice;
	        private String price;
	        private String weight;
	        private String description;
	        private String instock;
	        
	        public Product(){
	            Name = " ";
	            listprice = "";
	            price = "";
	            weight = " ";
	            description = " ";
	            instock = "";
	        }
	        public Product(String Name, String listprice, String price){
	        this.Name = Name;
	        this.listprice = listprice;
	        this.price = price;
	        weight = "";
	        description = "";
	        instock = "";
	        }
	        public Product(String Name, String listprice, String price, String weight, String description, String instock){
	            this.Name = Name;
	            this.listprice = listprice;
	            this.price = price;
	            this.weight = weight;
	            this.description = description;
	            this.instock = instock;
	        }
	        public String toString()
	        {
	        	String object;
	        	double save;
	        	double perSave;
	        	
	        	save = Double.parseDouble(listprice) - Double.parseDouble(price);
	        	perSave = Math.round(save/Double.parseDouble(listprice) * 100);
	        	
	        	
	        	object = "Name: " + Name + "\nListing price: " + listprice + "\nprice: " + price + "\nsave: " + save + "\npercent Save: " + perSave + "%"+"\nweight: " + weight + "\ndescription: " + description + "\ninstock: " + instock;
	        			return object;
	        }
	        public String getList(){
	        	return listprice;
	        	
	        }
	        public String getPrice(){
	        	return price;
	        }
	        public void setList(String listprice){
	        	this.listprice = listprice;
	        	
	        }
	        public void setPrice (String price){
	        	this.price = price;
	        }
	        
	}


