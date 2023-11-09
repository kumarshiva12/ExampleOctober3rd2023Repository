package parameterizedconstructor;class Product
{
	int PrdID;
	String PrdName;
	String PrdType;
	int PrdAmt;
	Product(int PID,String Pn,String Pt,int Pat)
	{
		System.out.println("PRODUCT DETAILS:");
		System.out.println("------------------------");
		PrdID = PID;
		System.out.println("Product ID: "+PrdID);
		PrdName = Pn;
		System.out.println("Product Name: "+PrdName);
		PrdType = Pt;
		System.out.println("Product Type: "+PrdType);
		PrdAmt = Pat;
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
	Order(int Ono, String On, int Oa,int Oq)
	{
		System.out.println("ORDER DETAILS:");
		System.out.println("------------------------");
		OdrNo = Ono;
		System.out.println("Order No: "+OdrNo);
		OdrName = On;
		System.out.println("Order Name: "+OdrName);
		OdrAmt = Oa;
		System.out.println("Order Amount: "+OdrAmt);
		OdrQuantity = Oq;
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
	Item(int In,String Ina,String It,int Ia)
	{
		System.out.println("ITEM DETAILS:");
		System.out.println("------------------------");
		ItmNo = In;
		System.out.println("Item No: "+ItmNo);
		ItmName = Ina;
		System.out.println("Item Name: "+ItmName);
		ItmType = It;
		System.out.println("Item Type: "+ItmType);
		ItmAmt = Ia;
		System.out.println("Item Amount: "+ItmAmt);
		System.out.println("************************");
	}

	public static void main(String[] args) {
		new Product(601,"Keyboard","Electronics",400);
		new Order(233, "Sony TV",95000,25);
		new Item(454,"Samsung TV","Electronics",35000);

	}

}


	