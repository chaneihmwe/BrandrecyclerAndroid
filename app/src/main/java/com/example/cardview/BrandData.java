package com.example.cardview;

public class BrandData
{

    private String BrandTitle;
    private int BrandImage;

    public BrandData (String BrandTitle, int BrandImage)
    {
        this.BrandTitle = BrandTitle;
        this.BrandImage = BrandImage;
    }

    public String getBrandTitle() {
        return BrandTitle;
    }

    public void setBrandTitle(String brandTitle) {
        BrandTitle = brandTitle;
    }

    public int getBrandImage() {
        return BrandImage;
    }

    public void setBrandImage(int brandImage) {
        BrandImage = brandImage;
    }


}
