package sk.uniza.fri.korenos.horizoncamera.SupportClass;

import android.graphics.Bitmap;

/**
 * Created by Markos on 24. 11. 2016.
 */

public class GalleryListDataPackage {

    private Bitmap itemImage;
    private String itemMainName;
    private String itemFirstProperty;
    private String itemSecondProperty;
    private String itemThirdProperty;
    private String itemForthProperty;

    private String specialPropertyString;
    private Integer specialPropertyInt;

    public GalleryListDataPackage(Bitmap itemImage, String itemMainName, String itemFirstProperty, String itemSecondProperty,
                                  String itemThirdProperty, String itemForthProperty) {
        this.itemImage = itemImage;
        this.itemMainName = itemMainName;
        this.itemFirstProperty = itemFirstProperty;
        this.itemSecondProperty = itemSecondProperty;
        this.itemThirdProperty = itemThirdProperty;
        this.itemForthProperty = itemForthProperty;
    }

    public GalleryListDataPackage(Bitmap itemImage, String itemMainName, String itemFirstProperty, String itemSecondProperty,
                                  String itemThirdProperty, String itemForthProperty, String specialPropertyString,  Integer specialPropertyInt) {
        this.itemImage = itemImage;
        this.itemMainName = itemMainName;
        this.itemFirstProperty = itemFirstProperty;
        this.itemSecondProperty = itemSecondProperty;
        this.itemThirdProperty = itemThirdProperty;
        this.itemForthProperty = itemForthProperty;
        this.specialPropertyString = specialPropertyString;
        this.specialPropertyInt = specialPropertyInt;
    }

    public Bitmap getItemImage() {
        return itemImage;
    }

    public String getItemMainName() {
        return itemMainName;
    }

    public String getItemFirstProperty() {
        return itemFirstProperty;
    }

    public String getItemSecondProperty() {
        return itemSecondProperty;
    }

    public String getItemThirdProperty() {
        return itemThirdProperty;
    }

    public String getItemForthProperty() {
        return itemForthProperty;
    }

    public String getSpecialPropertyString() {
        return specialPropertyString;
    }

    public Integer getSpecialPropertyInt() {
        return specialPropertyInt;
    }
}
