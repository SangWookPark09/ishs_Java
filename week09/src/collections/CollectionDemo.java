package collections;

public class CollectionDemo {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Fruit("Kiwi", 3000),
        new Fruit("Strawberry", 2500)
        };

//        for(Fruit fruit : fruits){
//            System.out.println(fruit.getName() + " (단가 : " + fruit.getPrice() + ")");
//        }

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i].getName() + " (단가 : " + fruits[i].getPrice() + ")");
        }

//        Fruit fruit1 = new Fruit("Kiwi", 3000);
//        Fruit fruit2 = new Fruit("Strawberry", 2500);
//        System.out.println(fruit1.getName()+"(단가 : " + fruit1.getPrice() + ")");

    }
}
