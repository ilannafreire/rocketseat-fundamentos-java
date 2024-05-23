package repeticao;

public class estruturaIfElse {
    public static void main(String[] args) {
        //if -else

        int dadoDoTipoInt = 10;
        if(dadoDoTipoInt == 11){
          // sysout
          System.out.println("Entrou no if");
        } else if(dadoDoTipoInt == 12){
          System.out.println("Entrou no if do 12");
        }
        else {
           System.out.println("Entrou no else");

        }

    }
}


//não é uma boa prática ter no seu código muitos if-else.
//o else sozinho não precisa de condição