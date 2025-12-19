package Studentdata;

public class Marks 
{
    int m1,m2,m3;
    public void setMarks(int m1, int m2, int m3)
    {
            this.m1=m1;
            this.m2=m2;
            this.m3=m3;
    }

    public int totalMarks()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return (m1+m2+m3) /3.0;
    }
    public int highestMarks()
    {
        return Math.max(m1, Math.max(m2, m3));
    }
}

