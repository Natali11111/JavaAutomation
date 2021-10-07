package builder;

public class CheckboxesForAudioTechnologyBuilder {
    private String categoryItem;
    private String subcategoryItem;
    private String goodsInStock;
    private String minPrice;
    private String maxPrice;
    private String connectionSection;
    private String connectionCheckbox;
    private String producerSection;
    private String producerCheckboxOne;
    private String producerCheckboxTwo;
    private String producerCheckboxThree;
    private String typeHeadphoneCheckbox;
    private String wayConnectionCheckbox;
    private String typeConstructionCheckbox;
    private String microphoneSection;
    private String microphoneCheckbox;
    private String colorSection;
    private String colorCheckboxOne;
    private String colorCheckboxTwo;
    private String nameGoods;

    public CheckboxesForAudioTechnologyBuilder withCategoryItem(String categoryItem) {
        this.categoryItem = categoryItem;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withSubcategoryItem(String subcategoryItem) {
        this.subcategoryItem = subcategoryItem;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withGoodsInStock(String goodsInStock) {
        this.goodsInStock = goodsInStock;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withMinPrice(String minPrice) {
        this.minPrice = minPrice;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withConnectionSection(String connectionSection) {
        this.connectionSection = connectionSection;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withConnectionCheckbox(String connectionCheckbox) {
        this.connectionCheckbox = connectionCheckbox;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withProducerSection(String producerSection) {
        this.producerSection = producerSection;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withProducerCheckboxOne(String producerCheckboxOne) {
        this.producerCheckboxOne = producerCheckboxOne;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withProducerCheckboxTwo(String producerCheckboxTwo) {
        this.producerCheckboxTwo = producerCheckboxTwo;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withProducerCheckboxThree(String producerCheckboxThree) {
        this.producerCheckboxThree = producerCheckboxThree;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withTypeHeadphoneCheckbox(String typeHeadphoneCheckbox) {
        this.typeHeadphoneCheckbox = typeHeadphoneCheckbox;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withWayConnectionCheckbox(String wayConnectionCheckbox) {
        this.wayConnectionCheckbox = wayConnectionCheckbox;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withTypeConstructionCheckbox(String typeConstructionCheckbox) {
        this.typeConstructionCheckbox = typeConstructionCheckbox;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withMicrophoneSection(String microphoneSection) {
        this.microphoneSection = microphoneSection;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withMicrophoneCheckbox(String microphoneCheckbox) {
        this.microphoneCheckbox = microphoneCheckbox;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withColorSection(String colorSection) {
        this.colorSection = colorSection;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withColorCheckboxOne(String colorCheckboxOne) {
        this.colorCheckboxOne = colorCheckboxOne;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withColorCheckboxTwo(String colorCheckboxTwo) {
        this.colorCheckboxTwo = colorCheckboxTwo;
        return this;
    }

    public CheckboxesForAudioTechnologyBuilder withNameGoods(String nameGoods) {
        this.nameGoods = nameGoods;
        return this;
    }


    public CheckboxesForAudioTechnology build() {
        return new CheckboxesForAudioTechnology(categoryItem, subcategoryItem, goodsInStock, minPrice,
                maxPrice, connectionSection, connectionCheckbox, producerSection,
                producerCheckboxOne, producerCheckboxTwo, producerCheckboxThree,
                typeHeadphoneCheckbox, wayConnectionCheckbox, typeConstructionCheckbox,
                microphoneSection, microphoneCheckbox, colorSection,
                colorCheckboxOne, colorCheckboxTwo, nameGoods);
    }
}
