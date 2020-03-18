
public class twodtooned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x,y;
        for(int num =0; num<16;num++)
        {
            if((num % 4)>0)
            {
                x = num/4;
                y = num%4;

            }else
            {
                x = num/4;
                y = 0;
            }

            System.out.println("num ["+num+"]---["+x+","+y+"]");

        }
	}

}
