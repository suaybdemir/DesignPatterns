package StructuralPatterns.adapter;

public class Test {

	public static void main(String[] args)
	{
		Priz priz = new Priz();
		
		Utu utu = new Utu();
		
		Buzdolabi buzdolabi = new Buzdolabi();
		
		priz.ElektrikVer(utu);
		priz.ElektrikVer(buzdolabi);
		
		SamsungTelefon samsungTelefon = new SamsungTelefon();
		TelefonEEAAdapter adapter = new TelefonEEAAdapter(samsungTelefon);
		
		
		priz.ElektrikVer(adapter);
	}
}
