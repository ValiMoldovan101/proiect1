import java.util.Objects;
import java.util.Scanner;

public class Main {
    static int menu(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Chose one option: \n 1.Add game\n 2.Search game based on dimensions\n 3.Average size of all games\n 4.Change name\n 0.Stop\n Option is: ");
    int opt=sc.nextInt();
    return opt;
}
    public static void main(String[] args){

        game[] gameList=new game[20];
        int i=0;
        int opt=menu();
        Scanner sc= new Scanner(System.in);
        while(opt!=0){
            if(opt==1){
                gameList[i]=new game();
                System.out.println("Name: ");
                String aux=sc.nextLine();
                gameList[i].setName(aux);

                System.out.println("Genre: ");
                aux=sc.nextLine();
                gameList[i].setGenre(aux);

                System.out.println("Dimension: ");
                double aux2=sc.nextDouble();;
                gameList[i].setDimension(aux2);

                System.out.println("Playtime: ");
                aux2=sc.nextDouble();;
                gameList[i].setPlayTime(aux2);
                i++;
            } else if (opt==2) {
                System.out.println("Searched dimension: ");
                int aux=sc.nextInt();
                for(int j=0;j<i;j++){
                    if(gameList[j].getDimension()==aux)
                        System.out.println(gameList[j].toString()+"\n");
                }
            }
            else if(opt==3){
                double sum=0;
                for(int j=0;j<i;j++){
                    sum=sum+gameList[j].getDimension();
                }
                System.out.println("Average size is:"+ sum/i);
            }
            else if(opt==4){
                int ok=0;
                System.out.println("Current name:");
                String oldName= sc.nextLine();
                System.out.println("New name:");
                String newName= sc.nextLine();
                for(int j=0;j<i;j++){
                    if(Objects.equals(gameList[j].getName(), oldName)){
                        ok=1;
                        gameList[j].setName(newName);
                    }
                }
                if(ok==0)
                    System.out.println("No game named "+oldName+" exists!\n");
            }
            opt=menu();
        }
    }


}

