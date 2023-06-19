package jAVA;

import javax.swing.text.html.ListView;

public class t_3_1 {
    public static void main(String[] args) {
        // создаем массив записей
        String[][] goods = {
                { "Товар1 высший сорт", "150", "1" },
                { "Товар2 обычный сорт", "100", "2" },
                { "Товар3 высший сорт", "200", "1" },
                { "Товар4 высший сорт", "180", "2" },
                { "Товар5 обычный сорт", "90", "1" },
                { "Товар6 высший сорт", "170", "2" }
        };

        // задаем начальное значение для максимальной цены
        int maxPrice = 0;

        // проходим по всем товарам
        for (String[] good : goods) {
            // если товар имеет высший сорт и его цена больше максимальной
            if (good[0].contains("высший") && Integer.parseInt(good[1]) > maxPrice) {
                // обновляем максимальную цену
                maxPrice = Integer.parseInt(good[1]);
            }
        }

        // выводим результат
        System.out.println(
                "Наибольшая цена товаров 1го или 2-го сорта среди товаров, название которых содержит «высший»: "
                        + maxPrice);
    }
}
