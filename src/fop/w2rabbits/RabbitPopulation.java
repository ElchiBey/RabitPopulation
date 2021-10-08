package fop.w2rabbits;

public class RabbitPopulation extends MiniJava {

    public static void main(String[] args){
	 int n=1, g1=1, g2=0, g3=0, k=0;
        int month = readInt("Please insert a number:");
        while(n<=month) {
            k=g1+g2+g3;
            g3=g2;
            g2=g1;
            g1=k;
            n++;
        }
        write(k);
    }
}
