package shop;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//         * Создать класс Магазин, поля:
public class Store {

    //         * • Список товаров (изначально пустой)
//    private List<Product> products;
    private ArrayList<Product> products = new ArrayList<Product>();

    public ArrayList<Product> getProducts() {
        if (products == null) { // если продукт еще ни разу не инициализировали то создаем новый список
            products = new ArrayList<>();
        }
        return products;
    }
}
