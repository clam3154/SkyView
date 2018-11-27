public class SkyView
{
    private double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int num = 0;
        for (int i = 0; i < numRows; i++)
        {
            if ((i % 2) == 0)
            {
                for (int j = 0; j < numCols; j++)
                {
                    view[i][j] = scanned[num];
                    num++;
                    System.out.print(view[i][j] + " ");
                }
            } else {
                for (int j = numCols - 1; j > 0; j--)
                {
                    view[i][j] = scanned[num];
                    num++;
                    System.out.print(view[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        int length = 0;
        double total = 0;
        for(int i = startRow; i < endRow; i++)
        {
            if((i%2) == 0)
            {
                for(int j = startCol; j < endCol; j++)
                {
                    total += view[i][j];
                    length++;
                }
            }
            else
            {
                for (int j = endCol-1; j > 0; j--)
                {
                    total += view[i][j];
                    length++;
                }
            }
        }
        return  total/length;
    }
}
