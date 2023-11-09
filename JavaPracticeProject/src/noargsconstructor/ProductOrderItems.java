package noargsconstructor;
class Product
{
	int PrdID;
	String PrdName;
	String PrdType;
	int PrdAmt;
	Product()
	{
		System.out.println("PRODUCT DETAILS:");
		System.out.println("------------------------");
		PrdID = 601;
		System.out.println("Product ID: "+PrdID);
		PrdName = "Mouse";
		System.out.println("Product Name: "+PrdName);
		PrdType = "Elctronics";
		System.out.println("Product Type: "+PrdType);
		PrdAmt = 250;
		System.out.println("Product Amount: "+PrdAmt);
		System.out.println("************************");
	}
}

class Order
{
	int OdrNo;
	String OdrName;
	int OdrAmt;
	int OdrQuantity;
	Order()
	{
		System.out.println("ORDER DETAILS:");
		System.out.println("------------------------");
		OdrNo = 211;
		System.out.println("Order No: "+OdrNo);
		OdrName = "Sony TV";
		System.out.println("Order Name: "+OdrName);
		OdrAmt = 2500;
		System.out.println("Order Amount: "+OdrAmt);
		OdrQuantity = 25;
		System.out.println("Order Quantity: "+OdrQuantity);
		System.out.println("************************");
	}
}

class Item
{
	int ItmNo;
	String ItmName;
	String ItmType;
	int ItmAmt;
	Item()
	{
		System.out.println("ITEM DETAILS:");
		System.out.println("------------------------");
		ItmNo = 111;
		System.out.println("Item No: "+ItmNo);
		ItmName = "Samsung TV";
		System.out.println("Item Name: "+ItmName);
		ItmType = "Electronics";
		System.out.println("Item Type: "+ItmType);
		ItmAmt = 3000;
		System.out.println("Item Amount: "+ItmAmt);
		System.out.println("************************");
	}




	public static void main(String[] args) {
		new Product();
		new Order();
		new Item();
	}
}

	
