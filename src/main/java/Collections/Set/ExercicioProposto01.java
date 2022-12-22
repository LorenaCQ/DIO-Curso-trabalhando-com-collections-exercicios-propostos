package Collections.Set;
import org.jetbrains.annotations.NotNull;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

public class ExercicioProposto01 {
    //Criando o conjunto de cores
    //Com o HashSet os dados são armazenados de forma aleatória
    static Set<String> coresArcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

    public static void main(String[] args) {


        //a) Exiba todas as cores o arco-íris uma abaixo da outra
        exibirCoresQuestaoA();

        //b) A quantidade de cores que o arco-íris tem
        quantidadeDeCoresQuestaoB();

        //c) Exiba as cores em ordem alfabética
        coresOrdemAlfabeticaQuestaoC();

        //d) Exiba as cores na ordem inversa da que foi informada
        coresOrdemInversaQuestaoD();

        //e) Exiba todas as cores que começam com a letra ”v”
        coresComecamComLetraVQuestaoE();

        //f) Remova todas as cores que não começam com a letra “v”
        removerCoresQueNaoComecamComLetraVQuestaoF();

        //g) Limpe o conjunto
        limparConjuntoQuestaoG(coresArcoIris);

        //h) Confira se o conjunto está vazio
        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }

    public static void exibirCoresQuestaoA(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Exiba todas as cores o arco-íris uma abaixo da outra: ");
        for (String cores : coresArcoIris) {
            System.out.println(cores);
        }
    }
    public static void quantidadeDeCoresQuestaoB(){
        System.out.println("------------------------------------------------------------");
        System.out.println("A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());
    }
    public static void coresOrdemAlfabeticaQuestaoC(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris); //Com o TreeSet os dados são apresentados de forma natural, ou seja, por letras seria em ordem alfabetica
        System.out.println(coresArcoIris2);
    }

    public static void coresOrdemInversaQuestaoD(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(
                Arrays.asList("violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"));
        System.out.println("Cores informadas:\n" + coresArcoIris3);

        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println("Cores na ordem inversa:\n" + coresArcoIrisList);
    }
    public static void coresComecamComLetraVQuestaoE(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cores: coresArcoIris) {
            if(cores.startsWith("v")) System.out.println(cores);
        }
    }
    public static void removerCoresQueNaoComecamComLetraVQuestaoF(){
        System.out.println("------------------------------------------------------------");
        System.out.println("Remova todas as cores que não começam com a letra “v”: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);
    }
    public static void limparConjuntoQuestaoG(@NotNull Set conjunto){
        System.out.println("------------------------------------------------------------");
        System.out.println("Limpe o conjunto ...");
        conjunto.clear();
    }
}
