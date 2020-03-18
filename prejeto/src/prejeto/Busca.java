package prejeto;

public class Busca {

	public static void main(String[] args) {

        // TODO Auto-generated method stub



        int[] vet = new int[] {5,2,3,9,8,7};

       // int k = 5;
        //int k = 3;
        //int k = 7;
       int k = 90;

        System.out.println("Localizada no vetor "+ busca(vet,0,k));

       

       

       

 

  }     

 

  public static int busca(int[] iV,int ii,int iK) {

       

       

        if((ii<=iV.length-1)&&(iK!=iV[ii])) {

        return busca(iV,(ii+1),iK);

       

  }else {

              

               return ii;

              

  }

       

       

  }}
