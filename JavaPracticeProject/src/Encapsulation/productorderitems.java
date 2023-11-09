package Encapsulation;
class Product
{
	int PrdID;
	String PrdName;
	String PrdType;
	int PrdAmt;
}

class Order
{
	int OdrNo;
	String OdrName;
	int OdrAmt;
	int OdrQuantity;
}

class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
}
public class productorderitems {

	public static void main(String[] args) {
		// Object class For Product Order Item
		Product obj1 = new Product();
		System.out.println("PRODUCT DETAILS:");
		System.out.println("------------------------");
		obj1.PrdID = 601;
		System.out.println("Product ID: "+obj1.PrdID);
		obj1.PrdName = "Mouse";
		System.out.println("Product Name: "+obj1.PrdName);
		obj1.PrdType = "Elctronics";
		System.out.println("Product Type: "+obj1.PrdType);
		obj1.PrdAmt = 250;
		System.out.println("Product Amount: "+obj1.PrdAmt);
		System.out.println("************************");
		obj1.PrdID = 602;
		System.out.println("Product ID: "+obj1.PrdID);
		obj1.PrdName = "Keyboard";
		System.out.println("Product Name: "+obj1.PrdName);
		obj1.PrdType = "Elctronics";
		System.out.println("Product Type: "+obj1.PrdType);
		obj1.PrdAmt = 280;
		System.out.println("Product Amount: "+obj1.PrdAmt);
		System.out.println("************************");
		obj1.PrdID = 603;
		System.out.println("Product ID: "+obj1.PrdID);
		obj1.PrdName = "Moniter";
		System.out.println("Product Name: "+obj1.PrdName);
		obj1.PrdType = "Elctronics";
		System.out.println("Product Type: "+obj1.PrdType);
		obj1.PrdAmt = 2500;
		System.out.println("Product Amount: "+obj1.PrdAmt);
		System.out.println("************************");
		obj1.PrdID = 604;
		System.out.println("Product ID: "+obj1.PrdID);
		obj1.PrdName = "Dimond Ring";
		System.out.println("Product Name: "+obj1.PrdName);
		obj1.PrdType = "Jewellary";
		System.out.println("Product Type: "+obj1.PrdType);
		obj1.PrdAmt = 30000;
		System.out.println("Product Amount: "+obj1.PrdAmt);
		System.out.println("************************");
		Order obj2 = new Order();
		System.out.println("ORDER DETAILS:");
		System.out.println("------------------------");
		obj2.OdrNo = 211;
		System.out.println("Order No: "+obj2.OdrNo);
		obj2.OdrName = "Sony TV";
		System.out.println("Order Name: "+obj2.OdrName);
		obj2.OdrAmt = 2500;
		System.out.println("Order Amount: "+obj2.OdrAmt);
		obj2.OdrQuantity = 25;
		System.out.println("Order Quantity: "+obj2.OdrQuantity);
		System.out.println("************************");
		obj2.OdrNo = 212;
		System.out.println("Order No: "+obj2.OdrNo);
		obj2.OdrName = "Realme Mobile";
		System.out.println("Order Name: "+obj2.OdrName);
		obj2.OdrAmt = 28000;
		System.out.println("Order Amount: "+obj2.OdrAmt);
		obj2.OdrQuantity = 20;
		System.out.println("Order Quantity: "+obj2.OdrQuantity);
		System.out.println("************************");
		obj2.OdrNo = 213;
		System.out.println("Order No: "+obj2.OdrNo);
		obj2.OdrName = "Table Fan";
		System.out.println("Order Name: "+obj2.OdrName);
		obj2.OdrAmt = 2500;
		System.out.println("Order Amount: "+obj2.OdrAmt);
		obj2.OdrQuantity = 18;
		System.out.println("Order Quantity: "+obj2.OdrQuantity);
		System.out.println("************************");
		obj2.OdrNo = 214;
		System.out.println("Order No: "+obj2.OdrNo);
		obj2.OdrName = "Apple Watch";
		System.out.println("Order Name: "+obj2.OdrName);
		obj2.OdrAmt = 1500;
		System.out.println("Order Amount: "+obj2.OdrAmt);
		obj2.OdrQuantity = 20;
		System.out.println("Order Quantity: "+obj2.OdrQuantity);
		System.out.println("************************");
		Item obj3 = new Item();
		System.out.println("ITEM DETAILS:");
		System.out.println("------------------------");
		obj3.ItmNo = 111;
		System.out.println("Item No: "+obj3.ItmNo);
		obj3.ItmName = "Samsung TV";
		System.out.println("Item Name: "+obj3.ItmName);
		obj3.ItmType = "Electronics";
		System.out.println("Item Type: "+obj3.ItmType);
		obj3.ItmAmt = 3000;
		System.out.println("Item Amount: "+obj3.ItmAmt);
		System.out.println("************************");
		obj3.ItmNo = 112;
		System.out.println("Item No: "+obj3.ItmNo);
		obj3.ItmName = "Videocon TV";
		System.out.println("Item Name: "+obj3.ItmName);
		obj3.ItmType = "Electronics";
		System.out.println("Item Type: "+obj3.ItmType);
		obj3.ItmAmt = 2100;
		System.out.println("Item Amount: "+obj3.ItmAmt);
		System.out.println("************************");
		obj3.ItmNo = 113;
		System.out.println("Item No: "+obj3.ItmNo);
		obj3.ItmName = "Apple TV";
		System.out.println("Item Name: "+obj3.ItmName);
		obj3.ItmType = "Electronics";
		System.out.println("Item Type: "+obj3.ItmType);
		obj3.ItmAmt = 8000;
		System.out.println("Item Amount: "+obj3.ItmAmt);
		System.out.println("************************");
		obj3.ItmNo = 114;
		System.out.println("Item No: "+obj3.ItmNo);
		obj3.ItmName = "Realme TV";
		System.out.println("Item Name: "+obj3.ItmName);
		obj3.ItmType = "Electronics";
		System.out.println("Item Type: "+obj3.ItmType);
		obj3.ItmAmt = 2800;
		System.out.println("Item Amount: "+obj3.ItmAmt);
		System.out.println("************************");
	}
}


