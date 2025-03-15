package exercicios;

class Calculadora {
    //SOMA
    int soma (int a, int b){
        return a + b;
    }
    int soma(int a ,int b, int c){
        return a + b + c;
    }
    double soma (double a, double b){
        return a + b;
    }
    int soma(int[] array){
        int sum = 0;
        for (int n : array){
            sum+=n;
        }
        return sum;
    }
    //SUBTRAÇÃO
    int sub (int a, int b){
        return a - b;
    }
    int sub(int a ,int b, int c){
        return a - b - c;
    }
    double sub (double a, double b){
        return a - b;
    }
    int sub(int[] array){
        int sub = 0;
        for (int n : array){
            sub-=n;
        }
        return sub;
    }
    //MULTIPLICAÇÃO
    int mult (int a, int b){
        return a * b;
    }
    int mult(int a ,int b, int c){
        return a * b * c;
    }
    double mult (double a, double b){
        return a * b;
    }
    int mult(int[] array){
        int mult = 0;
        for (int n : array){
            mult*=n;
        }
        return mult;
    }
    //DIVISÃO
    int div (int a, int b){
        return a / b;
    }
    double div (double a, double b){
        return a / b;
    }
    //MASTER
//    int Calculo()
}
