public class fraction 
{
    public  int x;
    public   int y;

    public  fraction(int x,int y)
    {
        this.x=x;
        if(y==0)
        {
            System.out.println("y is zero");
        }else this.y=y;
    }
    /*public static int getx()
    {
        return x;
    }
    public static int gety()
    {
        return y;
    }*/
    public static void tostring1(int x,int y)
    {
        System.out.println(x+"/"+y);
    }
      

}

