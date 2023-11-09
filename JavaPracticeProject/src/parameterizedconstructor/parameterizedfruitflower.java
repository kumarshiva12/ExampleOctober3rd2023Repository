package parameterizedconstructor;
class Fruit
{
	String FruitName;
	String FruitWeight;
	int FruitPrice;
	String FruitColor;
	Fruit(int Fpr,String Fn,String Fw,String Fc )
	{
		System.out.println("FRUIT DETAILS:");
		System.out.println("------------------------");
		FruitName = Fn;
		System.out.println("Fruit Name: "+FruitName);
		FruitWeight = Fw;
		System.out.println("Fruit Quantity: "+FruitWeight);
		FruitPrice = Fpr;
		System.out.println("Fruit Price: "+FruitPrice);
		FruitColor = Fc;
		System.out.println("Fruit Color: "+FruitColor);
		System.out.println("************************");
	}
}

class Flower
{
	String FlowerName;
	String FlowerWeight;
	int FlowerPrice;
	String FlowerColor;
	Flower(int Flpr,String Fln, String Flw, String Flc)
	{
		System.out.println("FLOWER DETAILS:");
		System.out.println("------------------------");
		FlowerName = Fln;
		System.out.println("Flower Name: "+FlowerName);
		FlowerWeight = Flw;
		System.out.println("Flower Weight: "+FlowerWeight);
		FlowerPrice = Flpr;
		System.out.println("Flower Price: "+FlowerPrice);
		FlowerColor = Flc;
		System.out.println("Flower Color: "+FlowerColor);
		System.out.println("************************");
	}
}

class Vegetable
{
	String VegetableName;
	String VegetableWeight;
	int VegetablePrice;
	String VegetableColor;
	Vegetable(int Vp,String Vn, String Vw,String Vc)
	{
		System.out.println("VEGETABLE DETAILS:");
		System.out.println("------------------------");
		VegetableName = Vn;
		System.out.println("Vegetable Name: "+VegetableName);
		VegetableWeight = Vw;
		System.out.println("Vegetable Weight: "+VegetableWeight);
		VegetablePrice = Vp;
		System.out.println("Vegetable Price: "+VegetablePrice);
		VegetableColor = Vc;
		System.out.println("Vegetable Color: "+VegetableColor);
		System.out.println("************************");
	}

	public static void main(String[] args) {
		// Object Class For Fruit Flower Vegetable
		new Fruit(200,"Apple","1kg","Red" );
		new Flower(100,"Rose","1kg","Red");
		new Vegetable(60,"Green chilli","1kg","Green");

	}

}



	