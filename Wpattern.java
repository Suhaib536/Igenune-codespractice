public class Wpattern {
    public static void main(String[] args) 
        {
            int height = 5;
    int i, j, counter = height / 2;
    for (i = 0; i < height; i++) 
    {
        System.out.printf("*");
        for (j = 0; j <= height; j++) 
        {
            if (j == height)
                System.out.printf("*");
            else if ((i >= height / 2)
                    && (j == counter
                    || j == height - counter - 1))
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        if (i >= height / 2)
        {
            counter++;
        }
        System.out.printf("\n");
    }
}
}