namespace Practice1
{
    public class StudentFactory
    {   
        public static Student Create(string studentType,string name)
        {

            switch (studentType.ToLower())
            {
                case "regular":
                    return new RegularStudent(name);
                case "online":
                    return new OnlineStudent(name);
                default:
                    throw new ArgumentException("Unknown type!.");
            }
        }

    }
}
