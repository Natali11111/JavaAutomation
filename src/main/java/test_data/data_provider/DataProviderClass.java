package test_data.data_provider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "dataForFiltering")
    public static Object[][] dataForFiltering() {
        return new Object[][]{
                {"Гаджеты", "Смарт-часы и фитнес-трекеры"},
                {"Бытовая техника", "Встраиваемая техника"},
                {"Аудио техника", "Наушники"},
                {"Умный дом", "Туризм"}
        };
    }

    @DataProvider
    public static Object[][] invalidDataForSearch() {
        return new Object[][]{
                {"&&&$$!!"},
                {"jfjkngdfjkngd"}

        };
    }

    @DataProvider(name = "checkBoxForGadgets")
    public static Object[][] checkBoxForGadgets() {
        return new Object[][]{
                {"Гаджеты", "Смарт-часы и фитнес-трекеры", "Только товары в наличии", "Samsung",
                        "Samsung Galaxy Watch", "Умные часы", "Дисплей", "Сенсорный",
                        "Вид дисплея", "Цветной", "Совместимость", "Android",
                        "Беспр. коммуникации", "Bluetooth", "Цвет", "Серебристый"}
        };
    }


}
