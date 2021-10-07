package builder;

import lombok.Getter;

@Getter
public class CheckboxesForAudioTechnology {

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


    public CheckboxesForAudioTechnology(String categoryItem, String subcategoryItem, String goodsInStock, String minPrice,
                                        String maxPrice, String connectionSection, String connectionCheckbox, String producerSection,
                                        String producerCheckboxOne, String producerCheckboxTwo, String producerCheckboxThree,
                                        String typeHeadphoneCheckbox, String wayConnectionCheckbox, String typeConstructionCheckbox,
                                        String microphoneSection, String microphoneCheckbox, String colorSection,
                                        String colorCheckboxOne, String colorCheckboxTwo, String nameGoods) {
        this.categoryItem = categoryItem;
        this.subcategoryItem = subcategoryItem;
        this.goodsInStock = goodsInStock;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.connectionSection = connectionSection;
        this.connectionCheckbox = connectionCheckbox;
        this.producerSection = producerSection;
        this.producerCheckboxOne = producerCheckboxOne;
        this.producerCheckboxTwo = producerCheckboxTwo;
        this.producerCheckboxThree = producerCheckboxThree;
        this.typeHeadphoneCheckbox = typeHeadphoneCheckbox;
        this.wayConnectionCheckbox = wayConnectionCheckbox;
        this.typeConstructionCheckbox = typeConstructionCheckbox;
        this.microphoneSection = microphoneSection;
        this.microphoneCheckbox = microphoneCheckbox;
        this.colorSection = colorSection;
        this.colorCheckboxOne = colorCheckboxOne;
        this.colorCheckboxTwo = colorCheckboxTwo;
        this.nameGoods = nameGoods;
    }
}
