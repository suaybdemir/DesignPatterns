internal class Program
{
    interface Component
    {
        void Display();
    }

    class Leaf : Component
    {
        private String name;

        public Leaf(String name)
        {
            this.name = name;
        }

        public void Display()
        {
            Console.WriteLine(name);
        }
    }

    class Composite : Component
    {
        private List<Component> components = new List<Component>();

        public void Display()
        {
            foreach (Component component in components)
            {
                component.Display();
            }
        }

        public void Add(Component component)
        {
            components.Add(component);
        }

        public void Remove(Component component)
        {
            components.Remove(component);
        }
    }

    public static void Main(string[] args)
    {
        Component fileSystem = new Composite();

        Component folder1 = new Composite();
        folder1.Add(new Leaf("File 1"));
        folder1.Add(new Leaf("File 2"));
        fileSystem.Add(folder1);

        Component folder2 = new Composite();
        folder2.Add(new Leaf("File 3"));
        folder2.Add(new Leaf("File 4"));
        fileSystem.Add(folder2);

        fileSystem.Display();
    }
}