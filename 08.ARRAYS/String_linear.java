public class String_linear {

    public static  int StringLinear(String food[] , String key){

        for(int i =0; i<food.length ; i++){

            if(food[i]==key){

                return i;
            }
        }

        return -1;

    }
    

    public static void main(String[] args){

        String food[] = {"Samosa","Idli", "Dosa", "Chinese", "Veg Pulav" };

        String key = "Dosa";
        int index = StringLinear(food, key);
        if(index==-1){
            System.out.println("Not found");
        }

        else{
            System.out.println("The String at position : "+index);
        }

    }
}
