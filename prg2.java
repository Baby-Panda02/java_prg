class Mobile
{
    void mobileInfo()
    {
        System.out.println("This is a mobile phone");
    }
}

class ClickPhoto extends Mobile
{
    void clickPhoto()
    {
        System.out.println("Photo clicked");
    }
}

class DialNumber extends Mobile
{
    void dialNumber()
    {
        System.out.println("Number dialed");
    }
}

public class MobileTest
{
    public static void main(String[] args)
    {
        ClickPhoto c = new ClickPhoto();
        DialNumber d = new DialNumber();

        c.mobileInfo();
        c.clickPhoto();

        d.mobileInfo();
        d.dialNumber();
    }
}
