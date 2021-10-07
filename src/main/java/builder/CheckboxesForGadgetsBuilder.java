package builder;

public class CheckboxesForGadgetsBuilder {
    private String categoryItem;
    private String subcategoryItem;
    private String goodsInStock;
    private String minPrice;
    private String maxPrice;
    private String producerCheckboxOne;
    private String productLineCheckboxOne;
    private String typeCheckboxOne;
    private String displaySection;
    private String displayCheckboxOne;
    private String typeDisplaySection;
    private String typeDisplayCheckboxOne;
    private String compatibilitySection;
    private String compatibilityCheckboxOne;
    private String communicationsSection;
    private String communicationsCheckboxOne;
    private String colorSection;
    private String colorCheckboxOne;
    private String goodsName;
    private String selectedColorForGoods;

    private String producerCheckboxTwo;
    private String producerCheckboxThree;
    private String producerCheckboxFour;
    private String producerCheckboxFive;
    private String producerCheckboxSix;
    private String producerCheckboxSeven;
    private String producerCheckboxEight;
    private String producerCheckboxNine;
    private String producerCheckboxTen;
    private String producerCheckboxEleven;
    private String producerCheckboxTwelve;
    private String producerCheckboxThirteen;
    private String producerCheckboxFourteen;
    private String producerCheckboxFifteen;
    private String producerCheckboxSixteen;
    private String producerCheckboxSeventeen;
    private String producerCheckboxEighteen;
    private String producerCheckboxNineteen;
    private String producerCheckboxTwenty;
    private String producerCheckboxTwentyOne;
    private String producerCheckboxTwentyTwo;
    private String producerCheckboxTwentyThree;


    private String productLineCheckboxTwo;
    private String productLineCheckboxThree;
    private String productLineCheckboxFour;
    private String productLineCheckboxFive;


    private String typeCheckboxTwo;
    private String typeCheckboxThree;
    private String typeCheckboxFour;
    private String typeCheckboxFive;


    private String displayCheckboxTwo;
    private String displayCheckboxThree;


    private String typeDisplayCheckboxTwo;
    private String typeDisplayCheckboxThree;


    private String compatibilityCheckboxTwo;


    private String communicationsCheckboxTwo;
    private String communicationsCheckboxThree;
    private String communicationsCheckboxFour;
    private String communicationsCheckboxFive;
    private String communicationsCheckboxSix;
    private String communicationsCheckboxSeven;
    private String communicationsCheckboxEight;


    private String colorCheckboxTwo;
    private String colorCheckboxThree;
    private String colorCheckboxFour;
    private String colorCheckboxFive;
    private String colorCheckboxSix;
    private String colorCheckboxSeven;
    private String colorCheckboxEight;
    private String colorCheckboxNine;
    private String colorCheckboxTen;
    private String colorCheckboxEleven;
    private String colorCheckboxTwelve;
    private String colorCheckboxThirteen;
    private String colorCheckboxFourteen;
    private String colorCheckboxFifteen;
    private String colorCheckboxSixteen;
    private String colorCheckboxSeventeen;
    private String colorCheckboxEighteen;
    private String colorCheckboxNineteen;
    private String colorCheckboxTwenty;
    private String colorCheckboxTwentyOne;
    private String colorCheckboxTwentyTwo;
    private String colorCheckboxTwentyThree;
    private String colorCheckboxTwentyFour;
    private String colorCheckboxTwentyFive;
    private String colorCheckboxTwentySix;
    private String colorCheckboxTwentySeven;

    public CheckboxesForGadgetsBuilder withSelectedColorForGoods(String selectedColorForGoods) {
        this.selectedColorForGoods = selectedColorForGoods;
        return this;
    }

    public CheckboxesForGadgetsBuilder withGoodsName(String goodsName) {
        this.goodsName = goodsName;
        return this;
    }

    public CheckboxesForGadgetsBuilder withSubcategoryItem(String subcategoryItem) {
        this.subcategoryItem = subcategoryItem;
        return this;
    }

    public CheckboxesForGadgetsBuilder withCategoryItem(String categoryItem) {
        this.categoryItem = categoryItem;
        return this;
    }


    public CheckboxesForGadgetsBuilder withColorSection(String colorSection) {
        this.colorSection = colorSection;
        return this;
    }

    public CheckboxesForGadgetsBuilder withCommunicationsSection(String communicationsSection) {
        this.communicationsSection = communicationsSection;
        return this;
    }

    public CheckboxesForGadgetsBuilder withCompatibilitySection(String compatibilitySection) {
        this.compatibilitySection = compatibilitySection;
        return this;
    }

    public CheckboxesForGadgetsBuilder withTypeDisplaySection(String typeDisplaySection) {
        this.typeDisplaySection = typeDisplaySection;
        return this;
    }

    public CheckboxesForGadgetsBuilder withDisplaySection(String displaySection) {
        this.displaySection = displaySection;
        return this;
    }

    public CheckboxesForGadgetsBuilder withGoodsInStock(String goodsInStock) {
        this.goodsInStock = goodsInStock;
        return this;
    }

    public CheckboxesForGadgetsBuilder withMinPrice(String minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public CheckboxesForGadgetsBuilder withMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public CheckboxesForGadgetsBuilder withProducerCheckboxOne(String producerCheckboxOne) {
        this.producerCheckboxOne = producerCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withProductLineCheckboxOne(String productLineCheckboxOne) {
        this.productLineCheckboxOne = productLineCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withTypeCheckboxOne(String typeCheckboxOne) {
        this.typeCheckboxOne = typeCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withDisplayCheckboxOne(String displayCheckboxOne) {
        this.displayCheckboxOne = displayCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withTypeDisplayCheckboxOne(String typeDisplayCheckboxOne) {
        this.typeDisplayCheckboxOne = typeDisplayCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withCompatibilityCheckboxOne(String compatibilityCheckboxOne) {
        this.compatibilityCheckboxOne = compatibilityCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withCommunicationsCheckboxOne(String communicationsCheckboxOne) {
        this.communicationsCheckboxOne = communicationsCheckboxOne;
        return this;
    }

    public CheckboxesForGadgetsBuilder withColorCheckboxOne(String colorCheckboxOne) {
        this.colorCheckboxOne = colorCheckboxOne;
        return this;
    }

    public CheckboxesForGadgets build() {
        return new CheckboxesForGadgets(categoryItem, subcategoryItem, goodsInStock, maxPrice,
                minPrice, producerCheckboxOne, productLineCheckboxOne, typeCheckboxOne,
                displaySection, displayCheckboxOne, typeDisplaySection, typeDisplayCheckboxOne,
                compatibilitySection, compatibilityCheckboxOne, communicationsSection,
                communicationsCheckboxOne, colorSection, colorCheckboxOne, goodsName,
                selectedColorForGoods,

                producerCheckboxTwo, producerCheckboxThree, producerCheckboxFour,
                producerCheckboxFive, producerCheckboxSix, producerCheckboxSeven, producerCheckboxEight,
                producerCheckboxNine, producerCheckboxTen, producerCheckboxEleven, producerCheckboxTwelve,
                producerCheckboxThirteen, producerCheckboxFourteen, producerCheckboxFifteen, producerCheckboxSixteen,
                producerCheckboxSeventeen, producerCheckboxEighteen, producerCheckboxNineteen, producerCheckboxTwenty,
                producerCheckboxTwentyOne, producerCheckboxTwentyTwo, producerCheckboxTwentyThree,

                productLineCheckboxTwo, productLineCheckboxThree, productLineCheckboxFour, productLineCheckboxFive,

                typeCheckboxTwo, typeCheckboxThree, typeCheckboxFour, typeCheckboxFive,

                displayCheckboxTwo, displayCheckboxThree,

                typeDisplayCheckboxTwo, typeDisplayCheckboxThree,

                compatibilityCheckboxTwo,

                communicationsCheckboxTwo, communicationsCheckboxThree, communicationsCheckboxFour, communicationsCheckboxFive,
                communicationsCheckboxSix, communicationsCheckboxSeven, communicationsCheckboxEight,

                colorCheckboxTwo, colorCheckboxThree, colorCheckboxFour, colorCheckboxFive, colorCheckboxSix, colorCheckboxSeven,
                colorCheckboxEight, colorCheckboxNine, colorCheckboxTen, colorCheckboxEleven, colorCheckboxTwelve,
                colorCheckboxThirteen, colorCheckboxFourteen, colorCheckboxFifteen, colorCheckboxSixteen, colorCheckboxSeventeen,
                colorCheckboxEighteen, colorCheckboxNineteen, colorCheckboxTwenty, colorCheckboxTwentyOne,
                colorCheckboxTwentyTwo, colorCheckboxTwentyThree, colorCheckboxTwentyFour,
                colorCheckboxTwentyFive, colorCheckboxTwentySix, colorCheckboxTwentySeven);
    }
}
