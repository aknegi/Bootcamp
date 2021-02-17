interface Furniture {
    public void stressTest();
    public void fireTest();
}

abstract class Metal implements Furniture {
    public abstract void metalFurnitureType();
}
abstract class Wooden implements Furniture {
    public abstract void woodenFurnitureType();
}

class MetalChair extends Metal {
    @Override
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    public void metalFurnitureType() {
        System.out.println("This is a metal Chair");
    }
}

class MetalTable extends Metal {
    @Override
    public void stressTest() {
        System.out.println("Passed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("Passed Fire Test");
    }

    @Override
    public void metalFurnitureType() {
        System.out.println("This is a metal Table");
    }
}

class WoodenChair extends Wooden {
    @Override
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    public void woodenFurnitureType() {
        System.out.println("This is a Wooden Chair");
    }
}

class WoodenTable extends Wooden {
    @Override
    public void stressTest() {
        System.out.println("Failed Stress Test");
    }

    @Override
    public void fireTest() {
        System.out.println("Failed Fire Test");
    }

    @Override
    public void woodenFurnitureType() {
        System.out.println("This is a wooden Table");
    }
}

public class Question9 {
    public static void main(String[] args) {
        Metal metal= new MetalChair();
        metal.metalFurnitureType();
        metal.fireTest();
        metal.stressTest();

        Wooden wooden=new WoodenTable();
        wooden.woodenFurnitureType();
        wooden.fireTest();
        wooden.stressTest();
        }
    }
