package methods;

import lombok.AllArgsConstructor;
import shop.Product;
import shop.Store;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

@AllArgsConstructor
public class InfoMethodsStore implements MethodsStore {
    private final Store store;

    @Override
    public void addProduct(Product product) {
        store.getProducts().add(product);
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return store.getProducts();
    }

    @Override
    public void deleteProduct(int id) {
        try {
            Product productDelete = findProductById(id);
            ArrayList<Product> productsArrayList = getAllProducts();
            productsArrayList.remove(productDelete);
            System.out.println(productDelete + " удален ");
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void editProduct(Product product) {
        Product productEdit = findProductById(product.getId()); // нашли продукт который будем редактировать
        productEdit.setName(product.getName());
        productEdit.setPrice(product.getPrice());
    }

    @Override
    public Product getProductById(int id) {
        Product product = null;
        try {
            product = findProductById(id); // если мы найдем продукт то мы его перезапишем.
        } catch (NoSuchElementException e) { // если не найдем то вылетим через исключение.
            e.getMessage();

        }
        return product;
    }


    private Product findProductById(int id) throws NoSuchElementException {
        ArrayList<Product> productsArrayList = getAllProducts(); // создали лист
        return productsArrayList.stream() // в листе с помощью потока
                .filter(product -> product.getId() == id) //отфильтровали товар по id
                .findAny() // и нашли любой
                .orElseThrow(() -> new NoSuchElementException("Продукт с id " + id + " не найден"));
    }
}
