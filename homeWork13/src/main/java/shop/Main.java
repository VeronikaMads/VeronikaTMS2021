package shop;

import methods.InfoMethodsStore;
import methods.MethodsStore;
import methods.UtilityClass;

import java.lang.management.MemoryType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        InfoMethodsStore infoMethodsStore = new InfoMethodsStore(store);

        Product product1 = new Product(112548,"Рис",3);
        Product product2 = new Product(654448,"Пшено",2);
        Product product3 = new Product(145134,"Макароны",4);

        infoMethodsStore.addProduct(product1);
        infoMethodsStore.addProduct(product2);
        infoMethodsStore.addProduct(product3);
        System.out.println("2."+infoMethodsStore.getAllProducts());

        infoMethodsStore.deleteProduct(145134);
        infoMethodsStore.deleteProduct(145132);
        System.out.println("3."+infoMethodsStore.getAllProducts());

        // Создаем новый продукт. на основании уже существующего . ищем его по id(т.е. ищем продукт кторый будем редактировать)
        Product product = infoMethodsStore.getProductById(145134);
        product.setName(UtilityClass.readNewName("Имя"));
        product.setPrice(UtilityClass.readNewPrice("Цена",50));
        infoMethodsStore.editProduct(product1);
    }
}
