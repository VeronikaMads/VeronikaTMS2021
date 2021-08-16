package shop;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
//     * Создать класс Товар, поля:
public class Product {
    //     * • id(целое число)
    private final int id;
    //     * • name(строка)
    private String name;
    //     * • price(целое число)
    private int price;
}
