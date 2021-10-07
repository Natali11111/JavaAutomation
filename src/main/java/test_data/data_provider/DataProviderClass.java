package test_data.data_provider;

import builder.CheckboxesForAudioTechnologyBuilder;
import builder.CheckboxesForGadgetsBuilder;
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
                        "Беспр. коммуникации", "Bluetooth", "Цвет", "Серебристый", "2000", "15000",
                        "Samsung Galaxy Watch Active 2 44mm Silver Aluminium ",
                        "Silver"}
        };
    }

    @DataProvider(name = "dataForGadgetsWithBuilder")
    public static Object[][] dataForGadgetsWithBuilder() {
        return new Object[][]{
                {new CheckboxesForGadgetsBuilder()
                        .withCategoryItem("Гаджеты")
                        .withSubcategoryItem("Смарт-часы и фитнес-трекеры")
                        .withGoodsInStock("Только товары в наличии")
                        .withProducerCheckboxOne("Samsung")
                        .withProductLineCheckboxOne("Samsung Galaxy Watch")
                        .withTypeCheckboxOne("Умные часы")
                        .withDisplaySection("Дисплей")
                        .withDisplayCheckboxOne("Сенсорный")
                        .withTypeDisplaySection("Вид дисплея")
                        .withTypeDisplayCheckboxOne("Цветной")
                        .withCompatibilitySection("Совместимость")
                        .withCompatibilityCheckboxOne("Android")
                        .withCommunicationsSection("Беспр. коммуникации")
                        .withCommunicationsCheckboxOne("Bluetooth")
                        .withColorSection("Цвет")
                        .withColorCheckboxOne("Серебристый")
                        .withMinPrice("2000")
                        .withMaxPrice("15000")
                        .withGoodsName("Samsung Galaxy Watch Active 2 44mm Silver Aluminium ")
                        .withSelectedColorForGoods("Silver")
                        .build()
                }
        };
    }

    @DataProvider(name = "dataForFeedBackForm")
    public static Object[][] dataForFeedBackForm() {
        return new Object[][]{
                {"apple", "Apple Magic Keyboard for iPad Pro 12.9", "Отзывы", "Комментарий"}
        };
    }

    @DataProvider(name = "dataForItemDetailsPage")
    public static Object[][] dataForItemDetailsPage() {
        return new Object[][]{
                {"apple", "Apple Magic Keyboard for iPad Pro 12.9"}
        };
    }

    @DataProvider(name = "dataForHomePage")
    public static Object[][] dataForHomePage() {
        return new Object[][]{
                {"apple"}
        };
    }

    @DataProvider(name = "dataForHouseholdAppliances")
    public static Object[][] dataForHouseholdAppliances() {
        return new Object[][]{
                {"Бытовая техника", "Встраиваемая техника", "Духовые шкафы", "Только товары в наличии",
                        "Производитель", "Hansa", "Gefest", "Электрическая", "51-60 л", "Более 60 л",
                        "Количество программ", "6-9", "Подсветка", "Есть", "Тип гриля", "Электрический", "Глубина",
                        "56-61 см", "Тип направляющих", "Съемные", "Система очистки", "Каталитическая", "Цвет", "Бежевый",
                        "10000", "20000", "Hansa BOEY 68229"
                }
        };
    }

    @DataProvider(name = "dataForHeadphones")
    public static Object[][] dataForHeadphones() {
        return new Object[][]{
                {"Аудио техника", "Наушники", "Только товары в наличии", "Подключение", "Bluetooth", "Производитель",
                        "Sony", "Huawei", "Realme", "Геймерские", "Беспроводное", "Полноразмерные", "Микрофон", "Есть",
                        "Цвет", "Белый", "1500", "7300", "Sony Pulse 3D Wireless Headset"}
        };
    }
    @DataProvider(name = "dataForAudioTechnologyWithBuilder")
    public static Object[][] dataForAudioTechnologyWithBuilder() {
        return new Object[][]{
                {new CheckboxesForAudioTechnologyBuilder()
                        .withCategoryItem("Аудио техника")
                        .withSubcategoryItem("Наушники")
                        .withGoodsInStock("Только товары в наличии")
                        .withMinPrice("1500")
                        .withMaxPrice("10000")
                        .withConnectionSection("Подключение")
                        .withConnectionCheckbox("Bluetooth")
                        .withProducerSection("Производитель")
                        .withProducerCheckboxOne("Sony")
                        .withProducerCheckboxTwo("Huawei")
                        .withProducerCheckboxThree("Realme")
                        .withTypeHeadphoneCheckbox("Геймерские")
                        .withWayConnectionCheckbox("Беспроводное")
                        .withTypeConstructionCheckbox("Полноразмерные")
                        .withMicrophoneSection("Микрофон")
                        .withMicrophoneCheckbox("Есть")
                        .withColorSection("Цвет")
                        .withColorCheckboxOne("Белый")
                        .withColorCheckboxTwo("Черный")
                        .withNameGoods("Sony Pulse 3D Wireless Headset")
                        .build()
                }
        };
    }

    @DataProvider(name = "dataForSmartHouse")
    public static Object[][] dataForSmartHouse() {
        return new Object[][]{
                {"Умный дом", "Туризм", "Только товары в наличии", "100", "5000", "Термос Steel Stainless Vacuum Сup"}
        };
    }
}
