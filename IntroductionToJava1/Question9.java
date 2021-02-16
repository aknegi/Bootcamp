
public class Question9 {
    enum House {
        House1(734000),House2(230500),House3(4005600),House4(1226040),House5(2530023);
        int price;
        House(int p)
        {
            price = p;
        }
        int getPrice()
        {
            return price;
        }
    }
    public static void main(String[] args) {
        System.out.println("All House prices:");
        for (House c : House.values())
            System.out.println(c + " costs " + c.getPrice() + " Rupees.");
    }
}

