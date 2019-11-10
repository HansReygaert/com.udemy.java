package com.udemy.encapsulation.page;

/** Pages fields are in mm **/
public class PageDimension
{
    private int width;
    private int length;
    private int safeZone;

    public PageDimension(int width, int length, int safeZone) {
        this.width  = width;
        this.length = length;
        this.safeZone = safeZone;
    }
    public PageDimension(int width,int length)
    {
        this(width,length,3);
    }

    public PageDimension(PageSizes pageSize)
    {
        switch (pageSize)
        {
            case A3:
                this.width  = 297;
                this.length = 420;
                break;
            case A4:
                this.width  = 210;
                this.length = 297;
                break;
            case A5:
                this.width  = 148;
                this.length = 210;
                break;
        }
    }
}
