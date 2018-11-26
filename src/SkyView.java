public class SkyView
{
    private double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        int num = 0;
        int dir;
        for(int i = 0; i < numRows; i++)
        {
            if((i%2) == 0)
                dir = 1;
            else
                dir = -1;
            for(int j = 0; j < numCols; j+=dir)
            {
                view[i][j] = scanned[num];
                num++;
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        int length = 0;
        double total = 0;
        for(int i = startRow; i < endRow; i++)
        {
            for(int j = startCol; j < endCol; j++)
            {
                total += view[i][j];
                length++;
            }
        }
        return  total/length;
    }
}
