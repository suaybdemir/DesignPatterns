using System;
namespace Adapter1
{
	interface Charger
	{
		void charge();
	}

    class iPhoneCharger : Charger
    {
        public void charge()
        {
			Console.WriteLine("Charging iPhone");
        }
    }

	class AndroidCharger
	{
		void chargeAndroid()
		{
			Console.WriteLine("Charging Android");
		}
	}

	class AndroidChargerAdapter : Charger
	{
		private AndroidCharger androidCharger;

		public AndroidChargerAdapter(AndroidCharger androidCharger)
		{
			this.androidCharger = androidCharger;
		}

        public void charge()
        {
            Console.WriteLine("Charging Andrpid");
        }
    }
    public class Test
	{
		public static void Main(String[] args)
		{
			Charger iphoneCharger = new iPhoneCharger();
			iphoneCharger.charge();

			AndroidCharger androidCharger = new AndroidCharger();
			Charger androidChargerAdapter = new AndroidChargerAdapter(androidCharger);
			androidChargerAdapter.charge();
		}
	}

}

